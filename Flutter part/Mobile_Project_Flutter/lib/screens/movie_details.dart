import 'package:flutter/material.dart';
import 'package:url_launcher/url_launcher.dart';
import 'package:mobile_project_flutter/data/movies.dart';

class MovieDetails extends StatelessWidget {
  final Movie movie;

  const MovieDetails({super.key, required this.movie});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text(movie.title)),
      body: SingleChildScrollView(
        padding: const EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            ClipRRect(
              borderRadius: BorderRadius.circular(12),
              child: Image.network(movie.poster),
            ),
            const SizedBox(height: 16),

            // Rating
            Text(
              "⭐ Rating: ${movie.rating}",
              style: const TextStyle(
                fontSize: 20,
                fontWeight: FontWeight.bold,
              ),
            ),

            const SizedBox(height: 16),

            // Overview
            Text(
              movie.overview,
              style: const TextStyle(fontSize: 16),
            ),
            const SizedBox(height: 25),

            // Trailer Button
            ElevatedButton(
              onPressed: () async {
                final Uri url = Uri.parse(
                    "https://www.youtube.com/results?search_query=${movie.title}+trailer");

                if (!await launchUrl(url,
                    mode: LaunchMode.externalApplication)) {
                  throw Exception('Could not launch YouTube!');
                }
              },
              child: const Text("Watch Trailer on YouTube"),
            ),
          ],
        ),
      ),
    );
  }
}
