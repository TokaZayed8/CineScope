package com.example.cinescope.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RatingBar(rating: Double, modifier: Modifier = Modifier) {
    val full = rating.toInt().coerceIn(0, 5)
    Row(modifier = modifier, horizontalArrangement = Arrangement.Start) {
        for (i in 0 until 5) {
            if (i < full) {
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
            } else {
                Icon(
                    imageVector = Icons.Outlined.Star,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp)
                )
            }
        }
        Spacer(Modifier.width(8.dp))
        Text(
            text = String.format("%.1f", rating),
            fontSize = 12.sp,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}