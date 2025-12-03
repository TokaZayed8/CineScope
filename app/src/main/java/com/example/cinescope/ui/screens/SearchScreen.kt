package com.example.cinescope.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinescope.ui.components.MovieCard

@Composable
fun SearchScreen(onMovieClick: (String) -> Unit = {}) {
    var query by remember { mutableStateOf("") }
    val all = listOf("Luca","Black Widow","Free Guy","Infinite","Movie A","Movie B")
    val results = if (query.isBlank()) emptyList<String>() else all.filter { it.contains(query, ignoreCase = true) }

    Column(modifier = Modifier.fillMaxSize().padding(12.dp)) {
        OutlinedTextField(value = query, onValueChange = { query = it }, label = { Text("Search movies...") }, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(12.dp))
        if (results.isEmpty()) {
            Text("Type to search", modifier = Modifier.padding(8.dp))
        } else {
            LazyRow {
                items(results) { title ->
                    MovieCard(title = title, imageUrl = "https://via.placeholder.com/300x450.png?text=$title") {
                        // fake id mapping
                        onMovieClick("1")
                    }
                }
            }
        }
    }
}
