package com.example.cinescope.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinescope.ui.components.MoviePosterItem
import com.example.cinescope.ui.viewmodels.HomeViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel,
    onMovieClick: (Int) -> Unit,
    onOpenSearch: () -> Unit,
    onOpenFavorites: () -> Unit
) {
    val trending by viewModel.trendingMovies.collectAsState()
    val popular by viewModel.popularMovies.collectAsState()

    Scaffold(topBar = {
        CenterAlignedTopAppBar(title = { Text("CineScope") }, actions = {
            IconButton(onClick = onOpenSearch) { Text("Search") }
            IconButton(onClick = onOpenFavorites) { Text("Fav") }
        })
    }) { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            item {
                Text("Trending", style = MaterialTheme.typography.titleLarge, modifier = Modifier.padding(16.dp))
                LazyRow(contentPadding = PaddingValues(horizontal = 12.dp)) {
                    items(trending) { movie ->
                        MoviePosterItem(movie) { onMovieClick(movie.id) }
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item { Text("Popular", style = MaterialTheme.typography.titleLarge, modifier = Modifier.padding(16.dp)) }
            items(popular.chunked(2)) { row ->
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    row.forEach { movie ->
                        MoviePosterItem(movie, modifier = Modifier.weight(1f)) { onMovieClick(movie.id) }
                    }
                    if (row.size == 1) Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}
