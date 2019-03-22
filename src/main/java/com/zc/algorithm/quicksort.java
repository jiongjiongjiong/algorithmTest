package com.zc.algorithm;

/**
 * @description: 快速排序
 * @author: Zhangc
 * @date: 2019-03-01
 */

public class quicksort {

    public static void main(String[] args) {
        int[] array = new int[]{85,24,63,45,17,31,96,50};

        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        sort(array,0,array.length-1);
        for (int value2 : array) {
            System.out.print(value2 + " ");
        }
    }

    private static void sort(int[] array, int start, int end){
        if (start >= end){
            return;
        }
        int left = start;
        int right = end;
        int pivot = array[(start + end) / 2];
        while (left < right){
            System.out.println("left: " + left + " right: " + right + " pivot: "+ pivot);
            while (array[left] < pivot){
                ++left;
            }
            while (array[right] > pivot){
                --right;
            }
            if (left < right){
                exchange(array, left, right);
                ++left;
                --right;
            }else if (left == right){
                ++left;
            }
        }
        sort(array, start, right);
        sort(array, left, end);
    }

    private static void exchange(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
