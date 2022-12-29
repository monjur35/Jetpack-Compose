package com.superapp.tingtongapp.composetutorial

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponse
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponseItem
import com.superapp.tingtongapp.composetutorial.ui.theme.ComposeTutorialTheme
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    val vm: GameViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      vm.getGameList().observe(this) {
          setContent {
              Conversation(messages = it)
          }
      }



    }
}

data class Message(val name: String, val age: String)

@Composable
fun MessageCard(msg: GamesListResponseItem) {
    Surface(
        shape = MaterialTheme.shapes.medium,
        elevation = 5.dp,
        color = MaterialTheme.colors.background,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)


    ) {
        Column(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                painter = rememberAsyncImagePainter(msg.thumbnail),
                contentDescription = "",
                modifier = Modifier
                    .clickable {  }
                    .size(500.dp)
                    .scale(1f),
                  //  .fillMaxSize(),
                  //  .border(1.dp, MaterialTheme.colors.primaryVariant, CircleShape),
                contentScale = ContentScale.Crop

            )
            Spacer(modifier = Modifier.width(10.dp))
            var isExpanded by remember { mutableStateOf(false) }
            val surfaceColor by animateColorAsState(if (isExpanded) MaterialTheme.colors.primary else MaterialTheme.colors.surface)

            Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
                Text(
                    text = "${msg.title}!",
                    fontFamily = FontFamily.Monospace,
                    color = MaterialTheme.colors.secondaryVariant,
                    style = MaterialTheme.typography.subtitle1
                )
                Spacer(modifier = Modifier.height(5.dp))

                Surface(
                    shape = MaterialTheme.shapes.medium,
                    elevation = 1.dp,
                    color = surfaceColor,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = msg.short_description,
                        fontFamily = FontFamily.Monospace,
                        modifier = Modifier.padding(all = 4.dp),
                        style = MaterialTheme.typography.body1,
                        maxLines = if (isExpanded) Int.MAX_VALUE else 1
                    )

                }

            }
        }
    }


}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Conversation(messages: GamesListResponse) {

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
                },


                )
        }, content = {
            LazyColumn {
                items(messages) { message ->
                    MessageCard(message)
                }
            }
        })





}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTutorialTheme {
        val a = Message("Monjur", "27")



    }
}
