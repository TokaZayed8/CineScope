package com.example.cinescope.data

import com.example.cinescope.domain.models.Actor
import com.example.cinescope.domain.models.Movie

object DummyData {

    val actors = listOf(
        // Zootopia 2 Voice Cast
        Actor(301, "Ginnifer Goodwin", "https://media.themoviedb.org/t/p/w276_and_h350_face/n8XOnjgyfYvqRUDcnkAckRqSaNN.jpg"),
        Actor(302, "Jason Bateman", "https://image.tmdb.org/t/p/w200/nX2kKjSbgzW1jOY1kcMz5B5JJ7K.jpg"),
        Actor(303, "Shakira", "https://image.tmdb.org/t/p/w200/uWk3gGJJf5LmJt5E5jJ5ZL9w7H.jpg"),
        Actor(304, "Ke Huy Quan", "https://image.tmdb.org/t/p/w200/zpJ5Z6Bij2VIvQxY4g9wn4BFhTI.jpg"),
        Actor(305, "Idris Elba", "https://image.tmdb.org/t/p/w200/2oXz9tKM5w6Q4JH0mQ6t7NeS1Yc.jpg"),
        Actor(306, "Quinta Brunson", "https://image.tmdb.org/t/p/w200/5JpG6F7uNVL1cS3GlTuG5M7WtX6.jpg"),

        // Superman 2025 Cast (Lead examples)
        Actor(307, "David Corenswet", "https://image.tmdb.org/t/p/w200/8mYz0MjdVUVv6DJW8Sk8uF3I44I.jpg"),
        Actor(308, "Rachel Brosnahan", "https://image.tmdb.org/t/p/w200/3JSCtD0jN45mN8pE48knV2aYMHl.jpg"),
        Actor(309, "Nicholas Hoult", "https://image.tmdb.org/t/p/w200/iMzNa8XECYoN3PT7FHe7EqmXYd8.jpg"),

        // Inside Out 2 (Example known voices)
        Actor(310, "Amy Poehler", "https://image.tmdb.org/t/p/w200/58mCmrV1j1S1JgG9kVwOIrd9RJN.jpg"),
        Actor(311, "Phyllis Smith", "https://image.tmdb.org/t/p/w200/dLbWdGgpIL4F4qWhVQkXYgUWjO9.jpg"),

        // Deadpool 3 (Example cast)
        Actor(312, "Ryan Reynolds", "https://image.tmdb.org/t/p/w200/g1r7di8xG3uI0p6vJ5x4Q0bQ0Zp.jpg"),
        Actor(313, "Hugh Jackman", "https://image.tmdb.org/t/p/w200/lBNpMq4WT7hlTU7YdcnZ5uv8a3O.jpg"),

        // Joker (Folie à Deux) — Joaquin Phoenix already big role
        Actor(314, "Joaquin Phoenix", "https://image.tmdb.org/t/p/w200/4RS8K6WAMfE1HYbq6IEeUAn0wYQ.jpg"),

        // Avatar 3 (expected return)
        Actor(315, "Sam Worthington", "https://image.tmdb.org/t/p/w200/blH4m72a03ziGmO5a6Kh9Q6wO49.jpg")
    )

    private fun findActor(name: String) =
        actors.filter { it.name.contains(name, ignoreCase = true) }

    val movies = listOf(
        Movie(
            301,
            "Zootopia 2",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/oJ7g2CifqpStmoYQyaLQgEU32qO.jpg",
            4.8,
            "2025-11-26",
            "Judy Hopps and Nick Wilde return for their biggest adventure yet.",
            listOf("https://image.tmdb.org/t/p/w500/9TnBx9d47RQX4s9SsqkOMAe0sCe.jpg"),
            listOf("https://www.youtube.com/watch?v=sEgPQ7HKoBA"),
            findActor("Ginnifer Goodwin") + findActor("Jason Bateman") + findActor("Shakira") + findActor("Ke Huy Quan") + findActor("Idris Elba") + findActor("Quinta Brunson")
        ),
        Movie(
            302,
            "Superman",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/ldyfo0BKmz5rWtJJKCvwaNS4cJT.jpg",
            4.2,
            "2025-07-11",
            "Clark Kent struggles to balance his dual legacy.",
            listOf("https://image.tmdb.org/t/p/w500/6W4fHIXbjY9veKdrP0t0f4Ua2wP.jpg"),
            listOf("https://www.youtube.com/watch?v=superman2025"), // placeholder
            findActor("David Corenswet") + findActor("Rachel Brosnahan") + findActor("Nicholas Hoult")
        ),
        Movie(
            303,
            "Inside Out 2",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/vpnVM9B6NMmQpWeZvzLvDESb2QY.jpg",
            4.5,
            "2025-06-14",
            "New emotions take center stage.",
            listOf("https://image.tmdb.org/t/p/w500/xv1G4xx8w4Q2Lax6AtP7N8tJ0ny.jpg"),
            listOf("https://www.youtube.com/watch?v=insideout2"),
            findActor("Amy Poehler") + findActor("Phyllis Smith")
        ),
        Movie(
            304,
            "Deadpool 3",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/wlKU9yB0Q8nfPMakBcSBT0JGS7.jpg",
            4.6,
            "2024-07-26",
            "The Merc with a Mouth returns for another wild ride.",
            listOf("https://image.tmdb.org/t/p/w500/4cXH7J5wUu5Y4KpP8x1m6Dk0y8R.jpg"),
            listOf("https://www.youtube.com/watch?v=deadpool3"),
            findActor("Ryan Reynolds") + findActor("Hugh Jackman")
        ),
        Movie(
            305,
            "Joker 2",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg",
            4.3,
            "2024-10-04",
            "Return to Gotham’s chaotic storm.",
            listOf("https://image.tmdb.org/t/p/w500/d0mbaJokerPoster.jpg"),
            listOf("https://www.youtube.com/watch?v=joker2"),
            findActor("Joaquin Phoenix")
        ),
        Movie(
            306,
            "Avatar 3",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/gKY6q7SjCkAU6FqvqWybDYgUKIF.jpg",
            4.7,
            "2025-12-19",
            "A new world awaits on Pandora.",
            listOf("https://image.tmdb.org/t/p/w500/6na7G3p5Q7oKq2s7kqWw6r5V8sH.jpg"),
            listOf("https://www.youtube.com/watch?v=avatar3"),
            findActor("Sam Worthington")
        )
    )
}
