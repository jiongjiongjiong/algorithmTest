package com.zc.algorithm.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: Zhangc
 * @date: 2019-03-22
 */

public class IntegerSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 2, 1, 4, 9);
        //[6, 2, 1, 4, 9]
        System.out.println(numbers);
        numbers.sort(Comparator.naturalOrder());
        //[1, 2, 4, 6, 9]
        System.out.println(numbers);
    }
}
