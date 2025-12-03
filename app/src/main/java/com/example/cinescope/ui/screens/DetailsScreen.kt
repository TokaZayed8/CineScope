package com.example.cinescope.ui.screens

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinescope.ui.components.PosterCard
import com.example.cinescope.ui.components.RatingBar
import com.example.cinescope.ui.components.TrailerItem
import com.example.cinescope.ui.components.ActorItem

// reuse the sampleMovies from HomeScreen file? for simplicity re-create minimal sample
private val detailsSample = MovieUi("1","Luca","https://image.tmdb.org/t/p/w500/8mKfZ0u2yJcWz5H8jLJ6Qz8bKqV.jpg",4.2)

@Composable
fun DetailsScreen(movieId: String, onBack: () -> Unit = {}) {
    // In final app Member2 will provide real model via viewModel by id
    val movie = detailsSample

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
            PosterCard(imageUrl = movie.poster, title = movie.title, onFavoriteClick = {})
            Spacer(modifier = Modifier.height(12.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                RatingBar(rating = movie.rating)
                Text(text = "Release: 2021", style = MaterialTheme.typography.caption)
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text("Trailers", style = MaterialTheme.typography.h6)
            Spacer(modifier = Modifier.height(8.dp))
            Row(modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .fillMaxWidth()
            ) {
                TrailerItem(
                    thumbnailUrl = "https://img.youtube.com/vi/5qap5aO4i9A/0.jpg",
                    videoUrl = "https://www.youtube.com/watch?v=dQw4w9WgXcQ"
                )
                Spacer(modifier = Modifier.width(8.dp))
                TrailerItem(
                    thumbnailUrl = "https://img.youtube.com/vi/2Vv-BfVoq4g/0.jpg",
                    videoUrl = "https://www.youtube.com/watch?v=2Vv-BfVoq4g"
                )
                Spacer(modifier = Modifier.width(8.dp))
                TrailerItem(
                    thumbnailUrl = "https://img.youtube.com/vi/60ItHLz5WEA/0.jpg",
                    videoUrl = "https://www.youtube.com/watch?v=60ItHLz5WEA"
                )
            }

            Spacer(modifier = Modifier.height(16.dp))
            Text("Summary", style = MaterialTheme.typography.h6)
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "Luca and his best friend Alberto experience an unforgettable summer on the Italian Riviera. But all the fun is threatened by a deeply-held secret: they are sea monsters from another world just below the water’s surface.",
                style = MaterialTheme.typography.body2
            )

            Spacer(modifier = Modifier.height(16.dp))
            Text("Actors", style = MaterialTheme.typography.h6)
            Spacer(modifier = Modifier.height(8.dp))
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                ActorItem("Jason Statham", "https://image.tmdb.org/t/p/w200/keIxh0wPr2Ymj0Btjh4gW7JJ89e.jpg")
                ActorItem("Scarlett Johansson", "https://image.tmdb.org/t/p/w200//6NsMbJXRlDZuDzatN2akFdGuTvx.jpg")
                ActorItem("Emily Blunt", "https://image.tmdb.org/t/p/w200//nVbVhce8C1s3w0Aj8e9qE7Xkgk.jpg")
                ActorItem("Ryan Reynolds", "https://image.tmdb.org/t/p/w200//g1r7di8xG3uI0p6vJ5x4Q0bQ0Zp.jpg")
            }

            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}
