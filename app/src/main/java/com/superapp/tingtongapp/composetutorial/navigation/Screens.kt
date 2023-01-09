package com.superapp.tingtongapp.composetutorial.navigation
sealed class Screens (val route:String){
    object Login: Screens("login")
    object Home: Screens("home")
    object Details: Screens("details")
}