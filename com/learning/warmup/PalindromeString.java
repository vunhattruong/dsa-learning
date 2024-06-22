package com.learning.warmup;

import java.util.ArrayList;
import java.util.List;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and
numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: sentence = "A man, a plan, a canal, Panama!"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: sentence = "Was it a car or a cat I saw?"
Output: true
 */
public class PalindromeString {
    public boolean isPalindrome (String s) {
        char[]       chars       = s.toCharArray();
        List<String> stringList  = new ArrayList<>();
        List<String> reverseList = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            String charString = String.valueOf(chars[i]).toLowerCase();
            if ( !charString.isEmpty() && charString.matches(".*[a-z0-9].*") ) {
                stringList.add(charString);
            }

        }
        int left  = 0;
        int right = stringList.size() - 1;
        while ( left <= right ) {
            reverseList.add(stringList.get(right));
            right--;
        }
        if ( reverseList.equals(stringList) ) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isPalindrome2 (String s) {
        char[] chars   = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while ( left < right ) {
            while ( left < right && !Character.isLetterOrDigit(chars[left]) ) {
                left++;
            }
            while ( left < right && !Character.isLetterOrDigit(chars[right]) ) {
                right--;
            }
            if ( Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right]) ) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main (String[] args) {
        PalindromeString ps = new PalindromeString();
        System.out.println(ps.isPalindrome("0P"));
        System.out.println(ps.isPalindrome2("A man, a plan, a canal, Panama!"));
    }
}
