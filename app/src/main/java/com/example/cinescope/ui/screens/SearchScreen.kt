package com.example.cinescope.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinescope.data.DummyData
import com.example.cinescope.ui.components.MovieCard

@Composable
fun SearchScreen(onMovieClick: (Int) -> Unit = {}) {
    var query by remember { mutableStateOf("") }
    val all = DummyData.movies.map { it.title }
    val results = if (query.isBlank()) emptyList<String>() else all.filter { it.contains(query, ignoreCase = true) }

    Column(modifier = Modifier.fillMaxSize().padding(12.dp)) {
        OutlinedTextField(value = query, onValueChange = { query = it }, label = { Text("Search movies...") }, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(12.dp))
        if (results.isEmpty()) {
            Text("Type to search", modifier = Modifier.padding(8.dp))
        } else {
            LazyRow {
                items(results) { title ->
                    val movie = DummyData.movies.find { it.title == title }!!
                    MovieCard(title = movie.title, imageUrl = movie.posterUrl) {
                        onMovieClick(movie.id)
                    }
                }
            }
        }
    }
}
