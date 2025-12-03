package com.example.cinescope.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun MovieCard(
    title: String,
    imageUrl: String?,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 6.dp,
        backgroundColor = MaterialTheme.colors.surface,
        modifier = modifier
            .padding(6.dp)
            .width(160.dp)
            .clickable { onClick() }
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            AsyncImage(
                model = imageUrl ?: "https://via.placeholder.com/300x450.png?text=No+Image",
                contentDescription = title,
                modifier = Modifier
                    .height(220.dp)
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = title,
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp),
                maxLines = 2
            )
        }
    }
}
