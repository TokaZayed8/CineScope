package com.example.cinescope.navigation

import androidx.compose.runtime.*
import com.example.cinescope.ui.screens.*
import com.example.cinescope.ui.viewmodels.*

class SimpleNavController {
    private val _currentRoute = mutableStateOf("home")
    val currentRoute: State<String> = _currentRoute
    private val _stack = mutableListOf("home")

    fun navigate(route: String) {
        _stack.add(route)
        _currentRoute.value = route
    }
    fun popBackStack() {
        if (_stack.size > 1) {
            _stack.removeLast()
            _currentRoute.value = _stack.last()
        }
    }
}

@Composable
fun rememberNavControllerSimple() = remember { SimpleNavController() }

@Composable
fun AppNavGraph(navController: SimpleNavController) {
    when (val route = navController.currentRoute.value) {
        "home" -> HomeScreen(
            viewModel = HomeViewModel(),
            onMovieClick = { navController.navigate("details/$it") },
            onOpenSearch = { navController.navigate("search") },
            onOpenFavorites = { navController.navigate("favorites") }
        )
        "search" -> SearchScreen(
            viewModel = SearchViewModel(),
            onMovieClick = { navController.navigate("details/$it") },
            onBack = { navController.popBackStack() }
        )
        "favorites" -> FavoritesScreen(
            viewModel = FavoritesViewModel(),
            onMovieClick = { navController.navigate("details/$it") },
            onBack = { navController.popBackStack() }
        )
        else -> {
            if (route.startsWith("details/")) {
                val id = route.substringAfter("details/").toIntOrNull() ?: -1
                MovieDetailsScreen(
                    viewModel = DetailsViewModel(),
                    movieId = id,
                    onBack = { navController.popBackStack() }
                )
            }
        }
    }
}
