package com.example.cinescope.data.dao
import androidx.room.*
import com.example.cinescope.data.ActorEntity
import com.example.cinescope.data.MovieActorCrossRef
import com.example.cinescope.data.MovieEntity
import com.example.cinescope.data.MovieWithActors
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: MovieEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertActor(actor: ActorEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertMovieActorCrossRef(crossRef: MovieActorCrossRef)

    @Transaction
    suspend fun insertMovieWithActors(movieWithActors: MovieWithActors) {
        insertMovie(movieWithActors.movie)
        movieWithActors.actors.forEach { actor ->
            insertActor(actor)
            insertMovieActorCrossRef(
                MovieActorCrossRef(
                    movieId = movieWithActors.movie.id,
                    actorId = actor.id
                )
            )
        }
    }

    @Transaction
    @Query("SELECT * FROM movie WHERE id = :movieId")
    fun getMovieWithActors(movieId: Int): Flow<MovieWithActors?>

    @Transaction
    @Query("SELECT * FROM movie")
    fun getAllMoviesWithActors(): Flow<List<MovieWithActors>>


    @Transaction
    @Query("SELECT * FROM movie WHERE title LIKE '%' || :query || '%'")
    fun getMoviesBySearchQuery(query: String): Flow<List<MovieWithActors>>


    @Query("SELECT COUNT(id) FROM movie")
    suspend fun countMovies(): Int

}