package com.zc.algorithm.linkedList;

/**
 * @description: valid palindrome(判断字符串是否为回文)
 * @author: Zhangc
 * @date: 2019-04-25
 */

public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0){
            return false;
        }
        int j = s.length() - 1;
        int i = 0;
        s = s.toLowerCase();
        while (i < j){
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }

            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
