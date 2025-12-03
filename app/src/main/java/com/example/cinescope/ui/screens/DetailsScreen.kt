package com.example.cinescope.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinescope.ui.viewmodels.DetailsViewModel
import coil.compose.AsyncImage

@Composable
fun MovieDetailsScreen(viewModel: DetailsViewModel, movieId: Int, onBack: () -> Unit) {
    val movie by viewModel.getMovie(movieId).collectAsState()

    Scaffold(topBar = {
        SmallTopAppBar(title = { Text(movie?.title ?: "Details") }, navigationIcon = { /* back handled externally */ })
    }) { padding ->
        movie?.let { data ->
            Column(modifier = Modifier.padding(padding).verticalScroll(rememberScrollState())) {
                AsyncImage(model = data.poster, contentDescription = null, modifier = Modifier.fillMaxWidth().height(360.dp))
                Spacer(modifier = Modifier.height(12.dp))
                Text(data.title, style = MaterialTheme.typography.headlineMedium, modifier = Modifier.padding(horizontal = 16.dp))
                Spacer(modifier = Modifier.height(8.dp))
                Text("Release: ${'$'}{data.releaseDate}", modifier = Modifier.padding(horizontal = 16.dp))
                Text("Rating: ${'$'}{data.rating}", modifier = Modifier.padding(horizontal = 16.dp))
                Spacer(modifier = Modifier.height(12.dp))
                Text(data.overview, modifier = Modifier.padding(16.dp))
            }
        } ?: Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { Text("Loading...") }
    }
}
