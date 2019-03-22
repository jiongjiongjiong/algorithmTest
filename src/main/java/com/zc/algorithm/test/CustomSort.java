package com.zc.algorithm.test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: Zhangc
 * @date: 2019-03-22
 */

public class CustomSort {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Lord of the rings", 8.8, true),
                new Movie("Back to the future", 8.5, false),
                new Movie("Carlito's way", 7.9, true),
                new Movie("Pulp fiction", 8.9, false));

        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                if (o1.isStarred() == o2.isStarred()){
                    return 0;
                }
                return o1.isStarred() ? -1 : 1;
            }
        });
        movies.forEach(System.out::println);


        System.out.println("=========================");
        movies.sort(Comparator.comparing(Movie::isStarred)
                .reversed()
                .thenComparing(Comparator.comparing(Movie::getRating)
                .reversed())
        );
        movies.forEach(System.out::println);
    }

    @AllArgsConstructor
    @Data
    private static class Movie {
        private String desc;
        private double rating;
        private boolean starred;
    }
}
