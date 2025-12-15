package com.example.cinescope.data

import com.example.cinescope.domain.models.Actor
import com.example.cinescope.domain.models.Movie

object DummyData {

    val actors = listOf(

        Actor(301, "Ginnifer Goodwin", "https://tse1.mm.bing.net/th/id/OIP.TSxPnt84CYISsj1n1PyoXAHaLH?w=2100&h=3150&rs=1&pid=ImgDetMain&o=7&rm=3"),
        Actor(302, "Jason Bateman", "https://tvseriesfinale.com/wp-content/uploads/2024/03/Jason-Bateman-Courtesy-of-Netflix.jpeg"),
        Actor(303, "Shakira", "https://wallpapercave.com/wp/wp3193063.jpg"),
        Actor(304, "Ke Huy Quan", "https://m.media-amazon.com/images/M/MV5BODk2YjYxNGUtNGE2OC00MzIyLTg3OWItOTM3YjJiMTQ4NzM0XkEyXkFqcGc@._V1_CR1253,318,1141,1712_FMjpg_UX1000_.jpg"),
        Actor(305, "Idris Elba", "https://wallpapers.com/images/hd/idris-elba-in-white-and-navy-blue-suit-gswftpl23q1uzhkb.jpg"),
        Actor(306, "Quinta Brunson", "https://tse4.mm.bing.net/th/id/OIP.Xd-Zrht_dOXgW3eHvc85CQAAAA?rs=1&pid=ImgDetMain&o=7&rm=3"),


        Actor(307, "David Corenswet", "https://images.fandango.com/ImageRenderer/300/0/redesign/static/img/default_poster.png/0/images/masterrepository/performer%20images/828188/DavidCorenswet-2019.jpg"),
        Actor(308, "Rachel Brosnahan", "https://www.hawtcelebs.com/wp-content/uploads/2018/01/rachel-brosnahan-at-bafta-los-angeles-tea-party-in-los-angeles-01-06-2018-9_thumbnail-535x800.jpg"),
        Actor(309, "Nicholas Hoult", "https://tse2.mm.bing.net/th/id/OIP.jUQaANvGy4C7pXSEmbAMMwHaJQ?rs=1&pid=ImgDetMain&o=7&rm=3"),


        Actor(310, "Amy Poehler", "https://tse4.mm.bing.net/th/id/OIP.EPxZS7kTvL3k40ebMsxwbgHaFy?rs=1&pid=ImgDetMain&o=7&rm=3"),
        Actor(311, "Phyllis Smith", "https://tse2.mm.bing.net/th/id/OIP.pGR52ojq0CXVLMhuCAMrzQHaI6?rs=1&pid=ImgDetMain&o=7&rm=3"),


        Actor(312, "Ryan Reynolds", "https://tse2.mm.bing.net/th/id/OIP.FMJb_boz75-jqCQaIiGSsgHaHh?rs=1&pid=ImgDetMain&o=7&rm=3"),
        Actor(313, "Hugh Jackman", "https://hips.hearstapps.com/hmg-prod/images/hugh-jackman-gettyimages-1211676023.jpg?resize=1200:*"),


        Actor(314, "Joaquin Phoenix", "https://tse1.mm.bing.net/th/id/OIP.K-jhxk00ADQEBhdFA5Ru1AHaJP?rs=1&pid=ImgDetMain&o=7&rm=3"),


        Actor(315, "Sam Worthington", "https://www.onthisday.com/images/people/sam-worthington.jpg?w=720"),

        Actor(316, "Leonardo DiCaprio", "https://tse1.mm.bing.net/th/id/OIP.K-jhxk00ADQEBhdFA5Ru1AHaJP?rs=1&pid=ImgDetMain&o=7&rm=3"),
        Actor(317, "Joseph Gordon-Levitt", "https://tse2.mm.bing.net/th/id/OIP.FMJb_boz75-jqCQaIiGSsgHaHh?rs=1&pid=ImgDetMain&o=7&rm=3"),
        Actor(318, "Tom Hanks", "https://media.themoviedb.org/t/p/w600_and_h900_face/oFvZoKI6lvU03n4YoNGAll9rkas.jpg"),
        Actor(319, "Matthew McConaughey", "https://media.themoviedb.org/t/p/w600_and_h900_face/lCySuYjhXix3FzQdS4oceDDrXKI.jpg"),
        Actor(320, "Anne Hathaway", "https://media.themoviedb.org/t/p/w600_and_h900_face/s6tflSD20MGz04ZR2R1lZvhmC4Y.jpg"),
        Actor(321, "Christian Bale", "https://m.media-amazon.com/images/M/MV5BODk2YjYxNGUtNGE2OC00MzIyLTg3OWItOTM3YjJiMTQ4NzM0XkEyXkFqcGc@._V1_CR1253,318,1141,1712_FMjpg_UX1000_.jpg"),
        Actor(322, "Heath Ledger", "https://wallpapers.com/images/hd/idris-elba-in-white-and-navy-blue-suit-gswftpl23q1uzhkb.jpg")
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
            listOf("https://th.bing.com/th/id/OIP.u5Qxdm3hNOmo0Fn35WgkZwHaEK?w=293&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3"),
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
            listOf("https://th.bing.com/th/id/OIP.zfEVToLxb4jFozHkMncOuQHaEI?w=323&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3"),
            listOf("https://youtu.be/uhUht6vAsMY"),
            findActor("David Corenswet") + findActor("Rachel Brosnahan") + findActor("Nicholas Hoult")
        ),
        Movie(
            303,
            "Inside Out 2",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/vpnVM9B6NMmQpWeZvzLvDESb2QY.jpg",
            4.5,
            "2025-06-14",
            "New emotions take center stage.",
            listOf("https://th.bing.com/th/id/OIP.rpXKubkbG7J4Bvp_aUzZqgHaEK?w=319&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3"),
            listOf("https://youtu.be/LEjhY15eCx0"),
            findActor("Amy Poehler") + findActor("Phyllis Smith")
        ),
        Movie(
            304,
            "Deadpool 3",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/wlKU9yB0Q8nfPMakBcSBT0JGS7.jpg",
            4.6,
            "2024-07-26",
            "The Merc with a Mouth returns for another wild ride.",
            listOf("https://i.ytimg.com/vi/HTsVZzP7H8I/maxresdefault.jpg"),
            listOf("https://youtu.be/73_1biulkYk"),
            findActor("Ryan Reynolds") + findActor("Hugh Jackman")
        ),
        Movie(
            305,
            "Joker 2",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg",
            4.3,
            "2024-10-04",
            "Return to Gotham’s chaotic storm.",
            listOf("https://img.youtube.com/vi/_OKAwz2MsJs/maxresdefault.jpg"),
            listOf("https://youtu.be/_OKAwz2MsJs"),
            findActor("Joaquin Phoenix")
        ),
        Movie(
            306,
            "Avatar 3",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/gKY6q7SjCkAU6FqvqWybDYgUKIF.jpg",
            4.7,
            "2025-12-19",
            "A new world awaits on Pandora.",
            listOf("https://i.ytimg.com/vi/cKvPMcjUsbU/maxresdefault.jpg"),
            listOf("https://youtu.be/nb_fFj_0rq8"),
            findActor("Sam Worthington")
        ),

        Movie(
            307,
            "Inception",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/xlaY2zyzMfkhk0HSC5VUwzoZPU1.jpg",
            4.9,
            "2010-07-16",
            "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
            listOf("https://image.tmdb.org/t/p/w500/8gVwE5b3o1O5YhB9Q9hH3iY4O8c.jpg"),
            listOf("https://www.youtube.com/watch?v=YoHD9XEInc0"),
            findActor("Leonardo DiCaprio") + findActor("Joseph Gordon-Levitt")
        ),
        Movie(
            308,
            "Interstellar",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg",
            4.8,
            "2014-11-07",
            "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
            listOf("https://image.tmdb.org/t/p/w500/r0T5Yg7V2uKjVw6pG2Z8wY0Uq6D.jpg"),
            listOf("https://www.youtube.com/watch?v=LY19rHKAaAg"),
            findActor("Matthew McConaughey") + findActor("Anne Hathaway")
        ),
        Movie(
            309,
            "The Martian",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/3ndAx3weG6KDkJIRMCi5vXX6Dyb.jpg",
            4.5,
            "2015-10-02",
            "An astronaut is presumed dead after being stranded on Mars and must rely on his ingenuity to find a way to signal to Earth that he is alive.",
            listOf("data:image/webp;base64,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"),
            listOf("https://youtu.be/Ue4PCI0NamI"),
            findActor("Matt Damon") + findActor("Jessica Chastain")
        ),
        Movie(
            310,
            "The Dark Knight",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/qJ2tW6WMUDux911r6m7haRef0WH.jpg",
            5.0,
            "2008-07-18",
            "When the menace known as The Joker emerges, Batman must confront one of the greatest psychological tests of his ability to fight injustice.",
            listOf("https://image.tmdb.org/t/p/w500/7I9n9L4i714R8XbUo9T9pP3q2wP.jpg"),
            listOf("https://youtu.be/EXeTwQWrcwY"),
            findActor("Christian Bale") + findActor("Heath Ledger")
        ),
        Movie(
            311,
            "Forrest Gump",
            "https://media.themoviedb.org/t/p/w600_and_h900_face/saHP97rTPS5eLmrLQEcANmKrsFl.jpg",
            4.7,
            "1994-07-06",
            "The story of a man with a low IQ who accidentally influences several defining historical events in the 20th century.",
            listOf("https://th.bing.com/th/id/OIP.OoHjJou3ruhmg7ZH25QD2wHaEK?w=308&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3"),
            listOf("https://youtu.be/bLvqoHBptjg?t=4"),
            findActor("Tom Hanks")
        )
    )
}
