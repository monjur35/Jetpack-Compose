package com.monjur.composenav

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.monjur.composenav.navigation.BottomNav
import com.monjur.composenav.navigation.NavGraph
import com.monjur.composenav.navigation.Screens
import com.monjur.composenav.response.GameResponseList
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val vm: MainViewModel by viewModels()


    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val list = listOf(
            BottomNav(
                name = "Home",
                route = Screens.Home.route,
                icon = R.drawable.insta
            ),
            BottomNav(
                name = "Bell",
                route = Screens.Login.route,
                icon = R.drawable.bell,
                badgeCount = 100
            ),
            BottomNav(
                name = "Profile",
                route = Screens.Profile.route,
                icon = R.drawable.profile
            )
        )


        setContent {
            val navController = rememberNavController()
            Scaffold(bottomBar = {
                BottomNavigationBar(
                    items =list,
                    navController =navController,
                    modifier =Modifier.fillMaxWidth(),
                    onItemClickListener ={
                        navController.navigate(it.route)
                    }
                )
            }) {
                Box(modifier = Modifier.padding(it)) {
                    NavGraph(navController)
                }

            }
        }

        lifecycleScope.launch {
            vm.getGameList().observe(this@MainActivity) {game->
                Log.e("TAG", "onCreate: $game")
            }
        }
    }
}

@Composable
fun BottomNavigationBar(
    items: List<BottomNav>,
    navController: NavController,
    modifier: Modifier,
    onItemClickListener: (BottomNav) -> Unit
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomNavigation(modifier = modifier, backgroundColor = Color.Black, elevation = 5.dp) {
        items.forEach { item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
                selected = selected,
                onClick = { onItemClickListener(item) },
                selectedContentColor = Color.Red,
                unselectedContentColor = Color.Gray,
                icon = {
                    Column(horizontalAlignment = CenterHorizontally) {
                        if (item.badgeCount > 0) {
                            BadgedBox(badge = {
                                Text(text = item.badgeCount.toString())
                            }) {
                                Icon(
                                    painterResource(id = item.icon),
                                    contentDescription = item.name
                                )
                            }
                        } else {
                            Icon(painterResource(id = item.icon), contentDescription = item.name)
                        }

                        if (selected) {
                            Text(
                                text = item.name,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp,
                                color = Color.White
                            )
                        }
                    }
                })
        }
    }
}


/*setContent {
               val navController = rememberNavController()
               ComposeNavTheme {
                   // A surface container using the 'background' color from the theme
                   Surface(
                       modifier = Modifier.fillMaxSize(),
                       color = MaterialTheme.colors.background
                   ) {
                       NavGraph(it)
                   }
               }
           }*/