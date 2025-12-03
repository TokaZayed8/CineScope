package com.example.cinescope.ui.sample

import com.example.cinescope.ui.model.Movie

object SampleData {
    val trending = listOf(
        Movie(1, "Oppenheimer", "https://picsum.photos/300/450?random=1", "2023", 8.5, "A story about the atomic bomb."),
        Movie(2, "Dune 2", "https://picsum.photos/300/450?random=2", "2024", 9.0, "Epic sci-fi continuation.")
    )
    val popular = listOf(
        Movie(3, "John Wick 4", "https://picsum.photos/300/450?random=3", "2023", 8.2, "Action-packed thriller."),
        Movie(4, "Avatar 2", "https://picsum.photos/300/450?random=4", "2022", 8.1, "Return to Pandora.")
    )
    val allMovies = trending + popular
}
