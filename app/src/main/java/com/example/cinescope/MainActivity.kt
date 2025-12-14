package com.example.cinescope
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cinescope.data.database.AppDatabase
import com.example.cinescope.data.MovieRepository
import com.example.cinescope.data.DummyData
import com.example.cinescope.ui.theme.CineScopeTheme
import com.example.cinescope.ui.navigation.CineNavGraph
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private val database by lazy {
        AppDatabase.getDatabase(applicationContext)
    }

    private val movieRepository by lazy {
        MovieRepository(database.movieDao())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        CoroutineScope(Dispatchers.IO).launch {
            movieRepository.preloadMovies(DummyData.movies)
        }
        setContent {
            CineScopeTheme {

                CineNavGraph(movieRepository = movieRepository)
            }
        }
    }
}