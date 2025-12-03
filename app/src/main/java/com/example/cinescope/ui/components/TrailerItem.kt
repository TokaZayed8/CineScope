package com.example.cinescope.ui.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun TrailerItem(thumbnailUrl: String, videoUrl: String) {
    val ctx = LocalContext.current
    Card(
        modifier = Modifier
            .size(width = 160.dp, height = 90.dp)
            .clickable {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl))
                ctx.startActivity(intent)
            },
        elevation = 6.dp
    ) {
        AsyncImage(model = thumbnailUrl, contentDescription = "trailer")
    }
}
