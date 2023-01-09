package com.superapp.tingtongapp.composetutorial.screens

import com.superapp.tingtongapp.composetutorial.MainViewModel
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter

@Composable
fun DetailScreen(
    navController: NavController,
    gameId: Int,
    helloViewModel: MainViewModel = viewModel()
) {

    val gameDetails = helloViewModel.getGameDetails(gameId).observeAsState()

    // API call
    LaunchedEffect(key1 = Unit) {
        helloViewModel.getGameDetails(gameId)
    }

    Log.e("TAG", "com.superapp.tingtongapp.composetutorial.screens.DetailScreen: $gameDetails")

    Column(modifier = Modifier.fillMaxWidth().verticalScroll(rememberScrollState())) {
        Image(
            painter = rememberAsyncImagePainter(model = gameDetails.value?.thumbnail),
            contentDescription = "",
            modifier = Modifier
                .height(250.dp)
                .fillMaxWidth()
        )
        Text(
            text = gameDetails.value?.title ?: "",
            style = MaterialTheme.typography.h5,
            color = Color.Blue,
            modifier = Modifier.padding(10.dp),
        )
        Text(
            text = gameDetails.value?.description ?: "",
            style = MaterialTheme.typography.h6,
            color = Color.Gray,
            modifier = Modifier.padding(10.dp),
        )


    }

}