package com.example.cinescope.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.example.cinescope.ui.screens.*

@Composable
fun CineNavGraph(startDestination: String = Routes.HOME) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        composable(Routes.HOME) {
            HomeScreen(onMovieClick = { id -> navController.navigate("${Routes.DETAILS}/${id}") },
                onSearch = { navController.navigate(Routes.SEARCH) },
                onFavorites = { navController.navigate(Routes.FAVORITES) })
        }
        composable(Routes.SEARCH) {
            SearchScreen(onMovieClick = { id -> navController.navigate("${Routes.DETAILS}/${id}") })
        }
        composable(Routes.FAVORITES) {
            FavoritesScreen(onMovieClick = { id -> navController.navigate("${Routes.DETAILS}/${id}") })
        }
        composable(
            route = "${Routes.DETAILS}/{movieId}",
            arguments = listOf(navArgument("movieId") { type = NavType.StringType })
        ) { backStack ->
            val id = backStack.arguments?.getString("movieId") ?: ""
            DetailsScreen(movieId = id, onBack = { navController.popBackStack() })
        }
    }
}
