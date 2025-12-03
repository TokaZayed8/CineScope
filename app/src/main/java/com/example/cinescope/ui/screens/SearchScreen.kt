package com.example.cinescope.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinescope.ui.components.MoviePosterItem
import com.example.cinescope.ui.viewmodels.SearchViewModel

@Composable
fun SearchScreen(viewModel: SearchViewModel, onMovieClick: (Int) -> Unit, onBack: () -> Unit) {
    val query = viewModel.query.collectAsState()
    val results = viewModel.searchResults.collectAsState()

    Scaffold(topBar = { SmallTopAppBar(title = { Text("Search") }) }) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            OutlinedTextField(value = query.value, onValueChange = { viewModel.updateQuery(it) },
                label = { Text("Search...") }, modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn {
                items(results.value) { movie ->
                    MoviePosterItem(movie) { onMovieClick(movie.id) }
                }
            }
        }
    }
}
