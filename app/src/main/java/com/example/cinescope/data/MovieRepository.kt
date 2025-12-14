package com.example.cinescope.data

import com.example.cinescope.data.dao.MovieDao
import com.example.cinescope.domain.models.Movie
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class MovieRepository(private val dao: MovieDao) {

    fun getAllMovies(): Flow<List<Movie>> {
        return dao.getAllMoviesWithActors().map { entitiesList ->
            entitiesList.map { it.toMovie() }
        }
    }

    fun getMovieById(id: Int): Flow<Movie?> {
        return dao.getMovieWithActors(id).map { entity ->
            entity?.toMovie()
        }
    }


    fun getMoviesBySearchQuery(query: String): Flow<List<Movie>> {
        return dao.getMoviesBySearchQuery(query).map { entitiesList ->
            entitiesList.map { it.toMovie() }
        }
    }

    suspend fun insertMovies(movies: List<Movie>) {
        movies.forEach { movie ->
            val entity = movie.toMovieWithActors()
            dao.insertMovieWithActors(entity)
        }

    }
    suspend fun preloadMovies(movies: List<Movie>) {
        val count = dao.countMovies()
        if (count == 0) {
            insertMovies(movies)
        }
    }

}