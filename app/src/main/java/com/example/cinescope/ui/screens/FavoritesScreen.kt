package com.example.cinescope.ui.screens

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.cinescope.data.DummyData
import com.example.cinescope.ui.components.MovieCard

@Composable
fun FavoritesScreen(onMovieClick: (Int) -> Unit = {}) {
    val favs = DummyData.movies.take(2)
    Scaffold {
        LazyVerticalGrid(columns = GridCells.Fixed(2), contentPadding = PaddingValues(8.dp)) {
            items(favs.size) { idx ->
                val m = favs[idx]
                MovieCard(title = m.title, imageUrl = m.posterUrl, onClick = { onMovieClick(m.id) })
            }
        }
    }
}
