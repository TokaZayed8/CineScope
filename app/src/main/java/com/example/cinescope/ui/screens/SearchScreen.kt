package com.example.cinescope.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
// import com.example.cinescope.data.DummyData
import com.example.cinescope.ui.components.MovieCard
import com.example.cinescope.data.MovieRepository
import com.example.cinescope.domain.models.Movie

@Composable
fun SearchScreen(

    movieRepository: MovieRepository,
    onMovieClick: (Int) -> Unit = {}
) {
    var query by remember { mutableStateOf("") }
    val results by movieRepository.getMoviesBySearchQuery(query).collectAsState(initial = emptyList())


    Column(modifier = Modifier.fillMaxSize().padding(12.dp)) {
        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            label = { Text("Search movies...") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(12.dp))

        if (query.isBlank()) {
            Text("Type to search", modifier = Modifier.padding(8.dp))
        } else if (results.isEmpty()) {
            Text("No results found for \"$query\"", modifier = Modifier.padding(8.dp))
        } else {
            LazyRow {
                items(results) { movie ->
                    MovieCard(
                        title = movie.title,
                        imageUrl = movie.posterUrl
                    ) {
                        onMovieClick(movie.id)
                    }
                }
            }
        }
    }
}