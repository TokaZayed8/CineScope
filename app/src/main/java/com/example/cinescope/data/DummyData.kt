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
            listOf("https://i.ytimg.com/vi/cKvPMcjUsbU/maxresdefault.jpg"),
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
