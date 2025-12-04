package com.example.cinescope.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import coil.compose.AsyncImage
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment

@Composable
fun ActorItem(name: String, photoUrl: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(8.dp)) {
        Card(shape = CircleShape, modifier = Modifier.size(72.dp)) {
            AsyncImage(model = photoUrl, contentDescription = name, modifier = Modifier.fillMaxSize())
        }
        Spacer(modifier = Modifier.height(6.dp))
        Text(text = name, maxLines = 1, style = androidx.compose.material3.MaterialTheme.typography.bodySmall)
    }
}
