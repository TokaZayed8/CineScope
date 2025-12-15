package com.example.cinescope.data

import androidx.room.*

@Entity(tableName = "movie")
data class MovieEntity(
    @PrimaryKey val id: Int,
    val title: String,
    val posterUrl: String,
    val rating: Double,
    val releaseDate: String,
    val overview: String,
    val trailers: List<String>,
    val images: List<String>
)

@Entity(tableName = "actor")
data class ActorEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val profileUrl: String
)

@Entity(
    primaryKeys = ["movieId", "actorId"],
    foreignKeys = [
        ForeignKey(
            entity = MovieEntity::class,
            parentColumns = ["id"],
            childColumns = ["movieId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = ActorEntity::class,
            parentColumns = ["id"],
            childColumns = ["actorId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["actorId"])
    ]
)
data class MovieActorCrossRef(
    val movieId: Int,
    val actorId: Int
)

data class MovieWithActors(
    @Embedded val movie: MovieEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(
            value = MovieActorCrossRef::class,
            parentColumn = "movieId",
            entityColumn = "actorId"
        )
    )
    val actors: List<ActorEntity>
)