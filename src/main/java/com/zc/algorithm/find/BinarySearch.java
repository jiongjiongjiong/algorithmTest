package com.zc.algorithm.find;

/**
 * @description: 二分查找
 * @author: Zhangc
 * @date: 2019-05-05
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arrayInt = {1,2,3,4,5,6,7,8,9};
        int value = 6;
        int res = findKey(arrayInt, value);
        System.out.println("二分查找初始版:" + res);

        int res2 = findKeyOpt(arrayInt, value);
        System.out.println("二分查找优化版:" + res2);

        int res3 = bsearchInternally(arrayInt, 0, arrayInt.length - 1, value);
        System.out.println("二分查找递归版:" + res3);

        int[] arrayInt2 = {1,3,4,5,6,8,8,8,11,18};
        int value2 = 8;
        int res4 = findFirstKey(arrayInt2, value2);
        System.out.println("查询第一个相等数字的位置:" + res4);
        int res5 = findLastKey(arrayInt2, value2);
        System.out.println("查询最后一个相等数字的位置:" + res5);

        int res6 = findFirstGteKey(arrayInt2, value2);
        System.out.println("查询第一个大于等于数字的位置:" + res6);

        int res7 = findLastLteKey(arrayInt2, value2);
        System.out.println("查询最后一个小于等于数字的位置:" + res7);
    }

    private static int findKey(int[] arrayInt, int value){
        int mid;
        int start = 0;
        int end = arrayInt.length - 1;
        while (start <= end){
            mid = (end - start)/2 + start;
            if (value < arrayInt[mid]){
                end = mid - 1;
            }else if (value > arrayInt[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    private static int findKeyOpt(int[] arrayInt, int value){
        int start = -0;
        int end  = arrayInt.length - 1;

        while (start <= end){
            int mid = start + ((end - start) >> 1);
            if (value == arrayInt[mid]){
                return mid;
            }else if (value < arrayInt[mid]){
                end  = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    //递归
    private static int bsearchInternally(int[] arrayInt, int start, int end, int value){
        if (start>end) {
            return -1;
        }
        int mid = start + ((end - start) >> 1);
        if (arrayInt[mid] == value){
            return mid;
        }else if (value > arrayInt[mid]){
            return bsearchInternally(arrayInt, mid +1, end, value);
        }else{
            return bsearchInternally(arrayInt, start, mid -1 ,value);
        }
    }

    /**
     * 查找第一个相等的元素
     * @param arrarInt
     * @param value
     * @return
     */
    private static int findFirstKey(int[] arrarInt, int value) {
        int start = 0;
        int end = arrarInt.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (value > arrarInt[mid]) {
                start = mid + 1;
            } else if (value < arrarInt[mid]) {
                end = mid - 1;
            } else {
                if (mid == 0 || arrarInt[mid - 1] != value) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            }
        }
        return  -1;
    }

    /**
     * 查找最后一个相等的元素
     * @param arrayInt
     * @param value
     * @return
     */
    private static int findLastKey(int[] arrayInt, int value){
        int start = 0;
        int end = arrayInt.length - 1;
        while (start <= end){
            int mid = start + ((end - start) >> 1);
            if (value > arrayInt[mid]){
                start = mid + 1;
            } else if (value < arrayInt[mid]) {
                end = mid - 1;
            } else {
                if ((mid == end -1) || arrayInt[mid + 1] != value){
                    return mid;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    /**
     * 查找第一个大于等于给定值的元素
     * @param arrayInt
     * @param value
     * @return
     */
    private static int findFirstGteKey(int[] arrayInt, int value){
        int start = 0;
        int end = arrayInt.length - 1;
        while (start <= end){
            int mid = start + ((end - start) >> 1);
            if (value <= arrayInt[mid]){
                if (mid == 0 || arrayInt[mid -1] < value){
                    return mid;
                }else{
                    end = mid - 1;
                }
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 查找最后一个小于等于指定元素
     * @param arrayInt
     * @param value
     * @return
     */
    private static int findLastLteKey(int[] arrayInt, int value){
        int start = 0;
        int end = arrayInt.length - 1;
        while (start <= end){
            int mid = start + ((end - start) >> 1);
            if (value >= arrayInt[mid]) {
                if ((mid == end -1) || arrayInt[mid + 1] > value){
                    return mid;
                }else{
                    start = mid - 1;
                }
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
