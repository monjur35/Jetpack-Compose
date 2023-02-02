package com.monjur.composenav.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.monjur.composenav.response.GameResponseList
import com.monjur.composenav.screens.DetailScreen
import com.monjur.composenav.screens.HomeScreen
import com.monjur.composenav.screens.LoginScreen
import com.monjur.composenav.screens.ProfileScreen

@Composable
fun NavGraph(
  //  gameResponseList: GameResponseList,
    navController: NavHostController
) {
  //  val navController = rememberNavController()
    androidx.navigation.compose.NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    )
    {
        composable(route = Screens.Login.route) {
            LoginScreen(navController)
        }
        composable(route = Screens.Home.route) {
            HomeScreen(navController)
        }
        composable(route = Screens.Details.route + "/{id}") {
            val gameId = it.arguments?.getString("id")?.toInt() ?: 0
            DetailScreen(gameId)
        }
        composable(route = Screens.Profile.route ) {
            ProfileScreen(navController)
        }
    }
}

