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

public class FieldSort {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Lord of the rings", 8.8),
                new Movie("Back to the future", 8.5),
                new Movie("Carlito's way", 7.9),
                new Movie("Pulp fiction", 8.9));
        movies.sort(Comparator.comparingDouble(Movie::getRating)
                .reversed());
        movies.forEach(System.out::println);
    }

    @Data
    @AllArgsConstructor
    private static class Movie {
        private String desc;
        private Double rating;
    }
}
