package com.monjur.composenav.screens

import android.util.Log
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.monjur.composenav.MainViewModel
import com.monjur.composenav.R
import com.monjur.composenav.response.details.Screenshot


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DetailScreen(
    gameId: Int,
    helloViewModel: MainViewModel = hiltViewModel()
) {
    val gameDetails by helloViewModel.getGameDetails(gameId).observeAsState()
    val showDialog = remember { mutableStateOf(false) }
    var ss by remember { mutableStateOf("") }



    if (showDialog.value)
        CustomDialog(value = ss, setShowDialog = {
            showDialog.value = it
        })



    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {

        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = rememberAsyncImagePainter(model = gameDetails?.thumbnail),
                contentDescription = gameDetails?.title,
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth(),

                alignment = Alignment.Center
            )
        }

        Text(
            text = gameDetails?.title ?: "",
            style = MaterialTheme.typography.h6,
            color = colorResource(id = R.color.tomato),
            modifier = Modifier.padding(start = 10.dp),
        )
        Text(
            text = gameDetails?.developer ?: "",
            style = MaterialTheme.typography.subtitle2,
            color = MaterialTheme.colors.onSecondary,
            modifier = Modifier.padding(start = 10.dp),
        )


        val list = ArrayList<Screenshot?>()
        gameDetails?.screenshots?.let { list.addAll(it) }
        LazyRow(modifier = Modifier.fillMaxHeight()) {
            items(items = list) { it ->
                Log.d("COMPOSE", "This get rendered ${it}")

                Card(
                    modifier = Modifier.padding(10.dp),
                    shape = RoundedCornerShape(10.dp),
                    elevation = 5.dp,
                    onClick = {
                        Log.e("TAG", "DetailScreen: ${it?.image}", )
                        ss= it?.image.toString()
                        showDialog.value = true
                    }
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(it?.image),
                        contentDescription = it?.image.toString(),
                        modifier = Modifier
                            .height(150.dp)
                            .width(200.dp),
                        alignment = Alignment.Center,
                        contentScale = ContentScale.Crop
                    )
                }
            }
        }

        Text(
            text = gameDetails?.short_description ?: "",
            style = MaterialTheme.typography.subtitle2,
            color = MaterialTheme.colors.onSecondary,
            modifier = Modifier.padding(start = 10.dp),
        )
        Text(
            text = gameDetails?.description ?: "",
            style = MaterialTheme.typography.body1,
            color = Color.Gray,
            modifier = Modifier.padding(10.dp),
        )
    }

}

@Composable
fun CustomDialog(value: String, setShowDialog: (Boolean) -> Unit) {

    Log.e("TAG", "CustomDialog: $value", )

    Dialog(onDismissRequest = { setShowDialog(false) }) {
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = Color.White
        ) {
            Box(
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = rememberAsyncImagePainter(model = value),
                    contentDescription = value,
                    modifier = Modifier.size(300.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}

