package com.superapp.tingtongapp.composetutorial.screens
import android.annotation.SuppressLint
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController, gameResponseList: GamesListResponse) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Top App Bar")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.List, "backIcon")
                    }
                }
            )
        }, content = {
            LazyColumn {
                items(gameResponseList) { it->
                    CardScreen(it,navController = navController)
                }
                }

        })

}