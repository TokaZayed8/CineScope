package com.example.cinescope.ui.screens
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinescope.ui.components.MovieCard
import com.example.cinescope.data.MovieRepository
import androidx.compose.ui.Alignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    movieRepository: MovieRepository,
    onMovieClick: (Int) -> Unit = {},
    onSearch: () -> Unit = {},
    onFavorites: () -> Unit = {}
) {
    var selectedIndex by remember { mutableStateOf(0) }
    val sampleMovies by movieRepository.getAllMovies().collectAsState(initial = emptyList())
    val trendingMovies = sampleMovies.take(4)
    val popularMovies = sampleMovies.drop(4)

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
        if (sampleMovies.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(
                    modifier = Modifier.size(48.dp)
                )
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxSize()
            ) {

                item {
                    Text(
                        text = "Trending",
                        modifier = Modifier.padding(top = 16.dp, start = 12.dp, end = 12.dp),
                        style = MaterialTheme.typography.titleMedium
                    )
                }

                item {
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp)
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
                        modifier = Modifier.padding(top = 16.dp, start = 12.dp, end = 12.dp, bottom = 8.dp),
                        style = MaterialTheme.typography.titleMedium
                    )
                }


                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp)
                    ) {
                        popularMovies.chunked(2).forEach { rowMovies ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 6.dp),
                                horizontalArrangement = Arrangement.spacedBy(16.dp)
                            ) {
                                rowMovies.forEach { m ->

                                    MovieCard(
                                        title = m.title,
                                        imageUrl = m.posterUrl,
                                        onClick = { onMovieClick(m.id) },
                                        modifier = Modifier.weight(1f)
                                    )
                                }
                                if (rowMovies.size < 2) {
                                    Spacer(modifier = Modifier.weight(1f))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}