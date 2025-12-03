package com.example.cinescope.ui.screens

import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import com.example.cinescope.ui.components.MoviePosterItem
import com.example.cinescope.ui.viewmodels.FavoritesViewModel

@Composable
fun FavoritesScreen(viewModel: FavoritesViewModel, onMovieClick: (Int) -> Unit, onBack: () -> Unit) {
    val favorites by viewModel.favorites.collectAsState()

    Scaffold(topBar = { SmallTopAppBar(title = { Text("Favorites") }) }) { padding ->
        LazyColumn(contentPadding = padding) {
            items(favorites) { movie ->
                MoviePosterItem(movie) { onMovieClick(movie.id) }
            }
        }
    }
}
