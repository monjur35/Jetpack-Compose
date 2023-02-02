package com.monjur.composenav.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.monjur.composenav.navigation.Screens
import com.monjur.composenav.response.GameResponseListItem
import com.monjur.composenav.ui.theme.Teal200
import com.monjur.composenav.ui.theme.darkGray
import com.monjur.composenav.ui.theme.gray


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CardScreen(gameResponseListItem: GameResponseListItem, navController: NavController) {

    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxSize(),
        onClick = { navController.navigate(Screens.Details.route + "/${gameResponseListItem.id}") },
        shape = RoundedCornerShape(10.dp),
        backgroundColor = Teal200,
        elevation = 5.dp
    ) {
        Column(modifier = Modifier.fillMaxSize(1f)) {

            Box(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = rememberAsyncImagePainter(gameResponseListItem.thumbnail),
                    contentDescription = "",
                    //  modifier= Modifier.size(400.dp,200.dp),
                    modifier = Modifier
                        .height(220.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }

            Text(
                text = gameResponseListItem.title,
                modifier = Modifier.padding(start = 10.dp),
                color = darkGray,
                style = MaterialTheme.typography.h6
            )
            Text(
                text = gameResponseListItem.developer,
                modifier = Modifier.padding(start = 10.dp, top = 0.dp, bottom = 10.dp),
                style = MaterialTheme.typography.body1,
                color= gray
            )
        }

    }

/*Text(
        text = "CARD Screen",
        fontSize = MaterialTheme.typography.body2.fontSize,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.background(MaterialTheme.colors.onPrimary)
    )*/
}