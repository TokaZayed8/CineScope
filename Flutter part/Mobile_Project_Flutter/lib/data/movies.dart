class Movie {
  final String title;
  final String poster;
  final double rating;
  final String overview;

  Movie({
    required this.title,
    required this.poster,
    required this.rating,
    required this.overview,
  });
}

final movies = [
  Movie(
    title: "Inception",
    poster: "https://upload.wikimedia.org/wikipedia/en/2/2e/Inception_%282010%29_theatrical_poster.jpg",
    rating: 8.8,
    overview:
    "A thief who steals corporate secrets through dream-sharing technology.",
  ),
  Movie(
    title: "Interstellar",
    poster: "https://image.tmdb.org/t/p/w500/rAiYTfKGqDCRIIqo664sY9XZIvQ.jpg",
    rating: 8.6,
    overview:
    "A team travels through a wormhole in space in an attempt to ensure humanity's survival.",
  ),
  Movie(
    title: "The Dark Knight",
    poster:
    "https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg",
    rating: 9.0,
    overview:
    "Batman faces the Joker, a criminal mastermind who plunges Gotham into chaos.",
  ),
];
