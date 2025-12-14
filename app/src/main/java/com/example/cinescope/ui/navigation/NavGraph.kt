package com.example.cinescope.ui.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.cinescope.data.MovieRepository
import com.example.cinescope.ui.screens.DetailsScreen
import com.example.cinescope.ui.screens.HomeScreen
import com.example.cinescope.ui.screens.LoginScreen
import com.example.cinescope.ui.screens.SearchScreen

@Composable
fun CineNavGraph(
    movieRepository: MovieRepository
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.LOGIN
    ) {


        composable(Routes.LOGIN) {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate(Routes.HOME) {
                        popUpTo(Routes.LOGIN) { inclusive = true }
                    }
                }
            )
        }


        composable(Routes.HOME) {
            HomeScreen(
                movieRepository = movieRepository,
                onMovieClick = { id ->
                    navController.navigate("${Routes.DETAILS}/$id")
                },
                onSearch = {
                    navController.navigate(Routes.SEARCH)
                },
                onFavorites = {

                }
            )
        }


        composable(Routes.SEARCH) {
            SearchScreen(
                movieRepository = movieRepository,
                onMovieClick = { id ->
                    navController.navigate("${Routes.DETAILS}/$id")
                }
            )
        }

        // 🎬 Details
        composable(
            route = "${Routes.DETAILS}/{movieId}",
            arguments = listOf(
                navArgument("movieId") {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->
            val movieId =
                backStackEntry.arguments?.getInt("movieId") ?: 0

            DetailsScreen(
                movieId = movieId,
                movieRepository = movieRepository,
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}
