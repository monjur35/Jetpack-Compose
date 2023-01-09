package com.superapp.tingtongapp.composetutorial.navigation
import com.superapp.tingtongapp.composetutorial.screens.HomeScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.superapp.tingtongapp.composetutorial.MainViewModel
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse
import com.superapp.tingtongapp.composetutorial.screens.DetailScreen
import com.superapp.tingtongapp.composetutorial.screens.LoginScreen

@Composable
fun NavGraph(navController: NavHostController, gameResponseList: GamesListResponse,helloViewModel: MainViewModel) {
    androidx.navigation.compose.NavHost(
        navController = navController,
        startDestination = Screens.Home.route)
    {
        composable(route = Screens.Login.route){
            LoginScreen(navController)
        }
        composable(route = Screens.Home.route){
            HomeScreen(navController, gameResponseList)
        }
       composable(route = Screens.Details.route+"/{id}"){
           val gameId=it.arguments?.getString("id")?.toInt()?:0
            DetailScreen(navController,gameId, helloViewModel)
        }
    }
}

