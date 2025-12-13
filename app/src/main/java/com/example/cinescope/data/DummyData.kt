package com.example.cinescope.data

import com.example.cinescope.domain.models.Actor
import com.example.cinescope.domain.models.Movie

object DummyData {

    val sampleActors = listOf(
        Actor(1, "Jason Statham", "https://image.tmdb.org/t/p/w200/keIxh0wPr2Ymj0Btjh4gW7JJ89e.jpg"),
        Actor(2, "Scarlett Johansson", "https://image.tmdb.org/t/p/w200/6NsMbJXRlDZuDzatN2akFdGuTvx.jpg"),
        Actor(3, "Emily Blunt", "https://image.tmdb.org/t/p/w200/nVbVhce8C1s3w0Aj8e9qE7Xkgk.jpg"),
        Actor(4, "Ryan Reynolds", "https://image.tmdb.org/t/p/w200/g1r7di8xG3uI0p6vJ5x4Q0bQ0Zp.jpg")
    )

    val movies = listOf(
        Movie(
            id = 1,
            title = "Luca",
            posterUrl = "https://image.tmdb.org/t/p/w500/8mKfZ0u2yJcWz5H8jLJ6Qz8bKqV.jpg",
            rating = 4.2,
            releaseDate = "2021-06-17",
            overview = "Luca and his best friend Alberto experience an unforgettable summer on the Italian Riviera...",
            images = listOf(
                "https://image.tmdb.org/t/p/w500/8mKfZ0u2yJcWz5H8jLJ6Qz8bKqV.jpg",
                "https://image.tmdb.org/t/p/w500/another_image.jpg"
            ),
            trailers = listOf("https://www.youtube.com/watch?v=dQw4w9WgXcQ"),
            actors = sampleActors
        ),
        Movie(
            id = 2,
            title = "Black Widow",
            posterUrl = "https://image.tmdb.org/t/p/w500/qAZ0pzat24kLdO3o8ejmbLxyOac.jpg",
            rating = 3.8,
            releaseDate = "2021-07-09",
            overview = "Natasha Romanoff confronts the darker parts of her ledger..."
        ),
        Movie(
            id = 3,
            title = "Free Guy",
            posterUrl = "https://image.tmdb.org/t/p/w500/xmbU4JTUm8rsdtn7Y3Fcm30GpeT.jpg",
            rating = 4.0,
            releaseDate = "2021-08-13",
            overview = "A bank teller discovers he's actually a background character in an open world video game..."
        )
    )
}
