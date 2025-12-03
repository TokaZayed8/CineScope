package com.example.cinescope.ui.model

data class Movie(
    val id: Int,
    val title: String,
    val poster: String,
    val releaseDate: String,
    val rating: Double,
    val overview: String
)
