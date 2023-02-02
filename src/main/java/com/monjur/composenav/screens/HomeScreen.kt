package com.monjur.composenav.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.monjur.composenav.MainViewModel
import com.monjur.composenav.response.GameResponseListItem

@Composable
fun HomeScreen(navController: NavController, helloViewModel: MainViewModel = hiltViewModel()) {

    val gameResponseList1 by helloViewModel.getGameList().observeAsState()
    val gameResponseList = ArrayList<GameResponseListItem>()
    gameResponseList1?.let { gameResponseList.addAll(it) }




    Surface(modifier = Modifier.fillMaxSize()) {
        Log.e("TAG", "HomeScreen: ${gameResponseList1?.size}", )
        LazyColumn {
            items(gameResponseList.reversed()) { it ->

                CardScreen(it, navController = navController)
            }
        }
    }

}
