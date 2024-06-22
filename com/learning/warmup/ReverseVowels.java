package com.learning.warmup;

import java.util.HashSet;
import java.util.Set;

/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s= "hello"
Output: "holle"

Example 2:
Input: s= "AEIOU"
Output: "UOIEA"

Example 3:
Input: s= "DesignGUrus"
Output: "DusUgnGires"
 */
public class ReverseVowels {

    public String reverseVowels (String s) {
        Set<Character> vowelSet = new HashSet<>();
        char[]         vowels   = "aeiouAEIOU".toCharArray();
        char[]         arr      = s.toCharArray();
        int            left     = 0;
        int            right    = arr.length - 1;
        if ( arr.length == 1 ) {
            return s;
        }
        for (int i = 0; i < vowels.length; i++) {
            vowelSet.add(vowels[i]);
        }
        while ( left < right ) {
            while ( left < right && !vowelSet.contains(arr[left]) ) {
                left++;
            }
            while ( left < right && !vowelSet.contains(arr[right]) ) {
                right--;
            }
            swap(arr, left, right);
            left++;
            right--;
        }
        return new String(arr);
    }

    private static void swap (char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main (String[] args) {
        ReverseVowels rv = new ReverseVowels();
        System.out.println(rv.reverseVowels("DesignGUrus"));
    }
}
