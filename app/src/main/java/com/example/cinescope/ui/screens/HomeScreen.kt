package com.example.cinescope.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.cinescope.ui.components.MovieCard
import com.example.cinescope.ui.theme.PurplePrimary

data class MovieUi(val id: String, val title: String, val poster: String, val rating: Double)

private val sampleMovies = listOf(
    MovieUi("1","Luca","https://image.tmdb.org/t/p/w500/8mKfZ0u2yJcWz5H8jLJ6Qz8bKqV.jpg",4.2),
    MovieUi("2","Black Widow","https://image.tmdb.org/t/p/w500/qAZ0pzat24kLdO3o8ejmbLxyOac.jpg",3.8),
    MovieUi("3","Free Guy","https://image.tmdb.org/t/p/w500/xmbU4JTUm8rsdtn7Y3Fcm30GpeT.jpg",4.0),
    MovieUi("4","Infinite","https://image.tmdb.org/t/p/w500/2bXbqYdUdNVa8VIWXVfclP2ICtT.jpg",2.9),
    MovieUi("5","Movie A","https://via.placeholder.com/300x450.png?text=Movie+A",3.5),
    MovieUi("6","Movie B","https://via.placeholder.com/300x450.png?text=Movie+B",4.8)
)

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    onMovieClick: (String) -> Unit = {},
    onSearch: () -> Unit = {},
    onFavorites: () -> Unit = {}
) {
    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("CineScope") }, backgroundColor = PurplePrimary, actions = {
                IconButton(onClick = onSearch) { Icon(Icons.Default.Search, contentDescription = "Search") }
                IconButton(onClick = onFavorites) { Icon(Icons.Default.Favorite, contentDescription = "Favs") }
            })
        },
        bottomBar = {
            BottomNavigation(backgroundColor = PurplePrimary) {
                BottomNavigationItem(
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0 },
                    icon = { Icon(Icons.Default.Movie, contentDescription = null) },
                    label = { Text("Movie") }
                )
                BottomNavigationItem(
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1; onSearch() },
                    icon = { Icon(Icons.Default.Tv, contentDescription = null) },
                    label = { Text("Tv") }
                )
                BottomNavigationItem(
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2; onFavorites() },
                    icon = { Icon(Icons.Default.Person, contentDescription = null) },
                    label = { Text("Person") }
                )
            }
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding).fillMaxSize()) {
            Text("Trending", modifier = Modifier.padding(12.dp), style = MaterialTheme.typography.h6)
            LazyHorizontalGrid(
                rows = GridCells.Fixed(1),
                contentPadding = PaddingValues(horizontal = 12.dp),
                modifier = Modifier
                    .height(260.dp)
            ) {
                items(sampleMovies) { m ->
                    MovieCard(title = m.title, imageUrl = m.poster, onClick = { onMovieClick(m.id) })
                }
            }

            Spacer(modifier = Modifier.height(12.dp))
            Text("Popular", modifier = Modifier.padding(12.dp), style = MaterialTheme.typography.h6)
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(8.dp),
                modifier = Modifier.fillMaxHeight()
            ) {
                items(sampleMovies) { m ->
                    MovieCard(title = m.title, imageUrl = m.poster, onClick = { onMovieClick(m.id) })
                }
            }
        }
    }
}
