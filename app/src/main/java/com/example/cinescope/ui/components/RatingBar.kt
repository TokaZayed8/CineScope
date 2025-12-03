package com.example.cinescope.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.StarBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Arrangement

@Composable
fun RatingBar(rating: Double, modifier: Modifier = Modifier) {
    val full = rating.toInt().coerceIn(0,5)
    val half = (rating - full) >= 0.5
    Row(modifier = modifier, horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
        for (i in 0 until 5) {
            if (i < full) {
                Icon(Icons.Filled.Star, contentDescription = null, modifier = Modifier.size(18.dp))
            } else {
                Icon(Icons.Outlined.StarBorder, contentDescription = null, modifier = Modifier.size(18.dp))
            }
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = String.format("%.1f", rating), fontSize = 12.sp)
    }
}
