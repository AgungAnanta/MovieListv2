package com.tugas.ignagungaaw1600872.movielist;

import java.util.ArrayList;

public class MovieData {
    public static Movie[] data = new Movie[]{
            new Movie("The Room (2003)",
                    "Johnny is a successful banker who lives happily in a San Francisco townhouse with his fiancée, Lisa. One day, inexplicably, she gets bored with him and decides to seduce his best friend, Mark. From there, nothing will be the same again.",
                    "https://m.media-amazon.com/images/M/MV5BYjEzN2FlYmYtNDkwMC00NGFkLWE5ODctYmE5NmYxNzE2MmRiXkEyXkFqcGdeQXVyMjMwODc5Mw@@._V1_.jpg",
            99,9),
            new Movie("Avengers: Infinity War",
                    "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe.",
                    "https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
                    149,8),
            new Movie("The Happening ",
                              "A science teacher, his wife, and a young girl struggle to survive a plague that causes those infected to commit suicide.",
                              "https://m.media-amazon.com/images/M/MV5BMTc2MjcwNjI0MF5BMl5BanBnXkFtZTcwMjM4NjM3MQ@@._V1_.jpg",
                              91,5)};

public static ArrayList<Movie> getListData(){
        Movie movie = null;
        ArrayList<Movie> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            list.add(data[i]);}
        return list;
    }
}
