package com.zc.algorithm.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: Zhangc
 * @date: 2019-03-22
 */

public class AlphabeticallySort {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList(
                "Milan",
                "london",
                "San Francisco",
                "Tokyo",
                "New Delhi"
        );
        System.out.println(cities);
        //字母顺序排序
        cities.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(cities);
        //ASCII值排序
        cities.sort(Comparator.naturalOrder());
        System.out.println(cities);
    }
}
