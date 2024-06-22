package com.hackerrank;

public class CamelCase {
    public static int camelcase(String s) {
        // Write your code here
        char[] chars = s.toCharArray();
        int count = 1;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(camelcase("oneTwoThree"));
    }
}
