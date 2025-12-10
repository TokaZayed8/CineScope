package com.example.cinescope.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinescope.ui.components.MovieCard
import com.example.cinescope.data.DummyData
import com.example.cinescope.domain.models.Movie

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onMovieClick: (Int) -> Unit = {},
    onSearch: () -> Unit = {},
    onFavorites: () -> Unit = {}
) {
    var selectedIndex by remember { mutableStateOf(0) }

    val sampleMovies: List<Movie> = DummyData.movies
    val trendingMovies = sampleMovies.take(1)
    val popularMovies = sampleMovies.drop(1)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("CineScope") },
                actions = {
                    IconButton(onClick = onSearch) {
                        Icon(Icons.Default.Search, contentDescription = "Search")
                    }
                    IconButton(onClick = onFavorites) {
                        Icon(Icons.Default.Favorite, contentDescription = "Favs")
                    }
                }
            )
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0 },
                    icon = { Icon(Icons.Default.Home, contentDescription = null) },
                    label = { Text("Movie") }
                )

                NavigationBarItem(
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1; onSearch() },
                    icon = { Icon(Icons.Default.PlayArrow, contentDescription = null) },
                    label = { Text("Tv") }
                )

                NavigationBarItem(
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2; onFavorites() },
                    icon = { Icon(Icons.Default.Person, contentDescription = null) },
                    label = { Text("Person") }
                )
            }
        }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {

            item {
                Text(
                    text = "Trending",
                    modifier = Modifier.padding(12.dp),
                    style = MaterialTheme.typography.titleMedium
                )
            }

            item {
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 12.dp)
                ) {
                    items(trendingMovies) { m ->
                        MovieCard(
                            title = m.title,
                            imageUrl = m.posterUrl,
                            onClick = { onMovieClick(m.id) }
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Popular",
                    modifier = Modifier.padding(12.dp),
                    style = MaterialTheme.typography.titleMedium
                )
            }

            item {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    modifier = Modifier
                        .fillMaxHeight()
                        .height(600.dp),
                    contentPadding = PaddingValues(8.dp)
                ) {
                    items(popularMovies) { m ->
                        MovieCard(
                            title = m.title,
                            imageUrl = m.posterUrl,
                            onClick = { onMovieClick(m.id) }
                        )
                    }
                }
            }
        }
    }
}
