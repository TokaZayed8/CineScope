package com.example.cinescope.ui.screens

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinescope.ui.components.MovieCard

@Composable
fun FavoritesScreen(onMovieClick: (String) -> Unit = {}) {
    val favs = listOf(
        MovieUi("2","Black Widow","https://image.tmdb.org/t/p/w500/qAZ0pzat24kLdO3o8ejmbLxyOac.jpg",3.8),
        MovieUi("3","Free Guy","https://image.tmdb.org/t/p/w500/xmbU4JTUm8rsdtn7Y3Fcm30GpeT.jpg",4.0)
    )
    Scaffold {
        LazyVerticalGrid(columns = GridCells.Fixed(2), contentPadding = PaddingValues(8.dp)) {
            items(favs.size) { idx ->
                val m = favs[idx]
                MovieCard(title = m.title, imageUrl = m.poster, onClick = { onMovieClick(m.id) })
            }
        }
    }
}
