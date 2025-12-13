package com.example.cinescope.ui.screens

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinescope.data.DummyData
import com.example.cinescope.ui.components.PosterCard
import com.example.cinescope.ui.components.RatingBar
import com.example.cinescope.ui.components.TrailerItem
import com.example.cinescope.ui.components.ActorItem

@OptIn(ExperimentalMaterial3Api::class) 
@Composable
fun DetailsScreen(movieId: Int, onBack: () -> Unit = {}) {
    val movie = DummyData.movies.find { it.id == movieId } ?: DummyData.movies.firstOrNull()

    if (movie == null) {
        Box(modifier = Modifier.fillMaxSize()) { Text("Movie not found") }
        return
    }

    Scaffold(topBar = {
        TopAppBar(title = { Text(movie.title) }, navigationIcon = {
            IconButton(onClick = onBack) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }
        })
    }) { padding ->
        Column(modifier = Modifier
            .padding(padding)
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .padding(12.dp)
        ) {
            PosterCard(imageUrl = movie.posterUrl, title = movie.title, onFavoriteClick = {})
            Spacer(modifier = Modifier.height(12.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                RatingBar(rating = movie.rating)
                Text(text = "Release: ${movie.releaseDate}", style = MaterialTheme.typography.bodySmall)
            }
            Spacer(modifier = Modifier.height(12.dp))

            Text("Trailers", style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Row(modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .fillMaxWidth()
            ) {
                val trailers = if (movie.trailers.isEmpty()) listOf("https://www.youtube.com/watch?v=dQw4w9WgXcQ") else movie.trailers
                trailers.forEach { vid ->
                    TrailerItem(thumbnailUrl = "https://img.youtube.com/vi/${vid.substringAfterLast("=")}/0.jpg", videoUrl = vid)
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            Text("Summary", style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = movie.overview, style = MaterialTheme.typography.bodyMedium)

            Spacer(modifier = Modifier.height(16.dp))
            Text("Actors", style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                movie.actors.forEach { actor ->
                    ActorItem(actor.name, actor.profileUrl)
                }
            }
            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}