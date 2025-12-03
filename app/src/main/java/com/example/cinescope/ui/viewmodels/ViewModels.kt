package com.example.cinescope.ui.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.example.cinescope.ui.model.Movie
import com.example.cinescope.ui.sample.SampleData

class HomeViewModel : ViewModel() {
    private val _trendingMovies = MutableStateFlow(SampleData.trending)
    val trendingMovies: StateFlow<List<Movie>> = _trendingMovies

    private val _popularMovies = MutableStateFlow(SampleData.popular)
    val popularMovies: StateFlow<List<Movie>> = _popularMovies
}

class DetailsViewModel : ViewModel() {
    fun getMovie(id: Int) = MutableStateFlow(SampleData.allMovies.firstOrNull { it.id == id })
}

class SearchViewModel : ViewModel() {
    private val _query = MutableStateFlow("")
    val query: StateFlow<String> = _query

    private val _searchResults = MutableStateFlow(SampleData.allMovies)
    val searchResults: StateFlow<List<Movie>> = _searchResults

    fun updateQuery(q: String) {
        _query.value = q
        _searchResults.value = SampleData.allMovies.filter { it.title.contains(q, true) }
    }
}

class FavoritesViewModel : ViewModel() {
    private val _favorites = MutableStateFlow(SampleData.popular.take(3))
    val favorites: StateFlow<List<Movie>> = _favorites
}
