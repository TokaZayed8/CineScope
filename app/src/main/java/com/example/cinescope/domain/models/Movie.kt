package com.example.cinescope.domain.models

data class Movie(
    val id: Int,
    val title: String,
    val posterUrl: String,
    val rating: Double,
    val releaseDate: String,
    val overview: String,
    val images: List<String> = emptyList(),
    val trailers: List<String> = emptyList(),
    val actors: List<Actor> = emptyList()
)
