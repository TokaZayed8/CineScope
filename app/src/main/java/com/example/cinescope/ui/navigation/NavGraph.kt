package com.example.cinescope.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.cinescope.ui.screens.DetailsScreen
import com.example.cinescope.ui.screens.FavoritesScreen
import com.example.cinescope.ui.screens.HomeScreen
import com.example.cinescope.ui.screens.LoginScreen
import com.example.cinescope.ui.screens.SearchScreen

@Composable
fun CineNavGraph(startDestination: String = Routes.LOGIN) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        composable(Routes.LOGIN) {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate(Routes.HOME) {
                        popUpTo(Routes.LOGIN) { inclusive = true }
                    }
                },
                onSignUpClick = {
                }
            )
        }
        composable(Routes.HOME) {
            HomeScreen(
                onMovieClick = { id -> navController.navigate("${Routes.DETAILS}/$id") },
                onSearch = { navController.navigate(Routes.SEARCH) },
                onFavorites = { navController.navigate(Routes.FAVORITES) }
            )
        }
        composable(Routes.SEARCH) {
            SearchScreen(onMovieClick = { id -> navController.navigate("${Routes.DETAILS}/$id") })
        }
        composable(Routes.FAVORITES) {
            FavoritesScreen(onMovieClick = { id -> navController.navigate("${Routes.DETAILS}/$id") })
        }
        composable(
            route = "${Routes.DETAILS}/{movieId}",
            arguments = listOf(navArgument("movieId") { type = NavType.IntType })
        ) { backStack ->
            val id = backStack.arguments?.getInt("movieId") ?: 0
            DetailsScreen(movieId = id, onBack = { navController.popBackStack() })
        }
    }
}