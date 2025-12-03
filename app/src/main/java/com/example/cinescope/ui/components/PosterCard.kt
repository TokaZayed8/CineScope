package com.example.cinescope.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.IconButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.ui.Alignment

@Composable
fun PosterCard(
    imageUrl: String?,
    title: String,
    onFavoriteClick: () -> Unit = {}
) {
    Card(shape = RoundedCornerShape(10.dp), elevation = 8.dp, modifier = Modifier.fillMaxWidth()) {
        Column {
            AsyncImage(
                model = imageUrl ?: "https://via.placeholder.com/600x400.png?text=Poster",
                contentDescription = title,
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth()
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = title, style = MaterialTheme.typography.h6)
                }
                IconButton(onClick = onFavoriteClick) {
                    Icon(Icons.Default.FavoriteBorder, contentDescription = "Favorite")
                }
            }
        }
    }
}
