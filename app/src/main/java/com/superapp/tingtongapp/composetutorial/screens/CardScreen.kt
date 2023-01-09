package com.superapp.tingtongapp.composetutorial.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.superapp.tingtongapp.composetutorial.navigation.Screens
import com.superapp.tingtongapp.composetutorial.response.gamesList.GamesListResponseItem

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CardScreen(gameResponseListItem: GamesListResponseItem, navController: NavController) {

    Card(
        modifier = Modifier.padding(10.dp),
        onClick = { navController.navigate(Screens.Details.route+"/${gameResponseListItem.id}")},
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {
        Column() {
            Image(
                painter = rememberAsyncImagePainter(gameResponseListItem.thumbnail),
                contentDescription = "",
                Modifier.size(500.dp, 200.dp),
                contentScale = ContentScale.Crop
            )
            Text(text = gameResponseListItem.title, modifier = Modifier.padding(5.dp),color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.h5)
            Text(text = gameResponseListItem.developer, modifier = Modifier.padding(5.dp), style = MaterialTheme.typography.body1)
        }

    }

/*Text(
        text = "CARD Screen",
        fontSize = MaterialTheme.typography.body2.fontSize,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.background(MaterialTheme.colors.onPrimary)
    )*/
}