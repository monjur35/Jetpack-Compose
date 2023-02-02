package com.monjur.composenav.navigation

sealed class Screens (val route:String){
    object Login:Screens("login")
    object Home:Screens("home")
    object Details:Screens("details")
    object Profile:Screens("profile")
}