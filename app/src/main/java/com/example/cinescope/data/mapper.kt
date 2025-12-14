package com.example.cinescope.data

import com.example.cinescope.domain.models.Actor
import com.example.cinescope.domain.models.Movie


fun ActorEntity.toActor(): Actor {
    return Actor(
        id = this.id,
        name = this.name,
        profileUrl = this.profileUrl
    )
}

fun MovieWithActors.toMovie(): Movie {
    return Movie(
        id = this.movie.id,
        title = this.movie.title,
        posterUrl = this.movie.posterUrl,
        rating = this.movie.rating,
        releaseDate = this.movie.releaseDate,
        overview = this.movie.overview,
        trailers = this.movie.trailers,
        images = this.movie.images,
        actors = this.actors.map { it.toActor() }
    )
}

fun Movie.toMovieWithActors(): MovieWithActors {
    val movieEntity = MovieEntity(
        id = this.id,
        title = this.title,
        posterUrl = this.posterUrl,
        rating = this.rating,
        releaseDate = this.releaseDate,
        overview = this.overview,
        trailers = this.trailers ,
        images = this.images,
    )


    val actorEntities = this.actors.map { actor ->
        ActorEntity(
            id = actor.id,
            name = actor.name,
            profileUrl = actor.profileUrl,

        )
    }


    return MovieWithActors(
        movie = movieEntity,
        actors = actorEntities
    )
}