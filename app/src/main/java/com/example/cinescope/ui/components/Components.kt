package com.example.cinescope.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.cinescope.ui.model.Movie

@Composable
fun MoviePosterItem(
    movie: Movie,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Column(
        modifier = modifier
            .width(150.dp)
            .padding(8.dp)
            .clickable { onClick() }
    ) {
        Image(
            painter = rememberAsyncImagePainter(movie.poster),
            contentDescription = movie.title,
            modifier = Modifier
                .height(220.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(movie.title, maxLines = 2)
    }
}
