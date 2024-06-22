package com.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/*
Problem: Given a string, find the length of the longest substring without repeating characters

*/
public class LongestSubstringWithoutRepeatingCharacters {
    // Store the character
    Set<Character> charSet   = new HashSet<>();
    // right pointer
    int            right     = 0;
    // left pointer
    int            left      = 0;
    // maxLength
    int            maxLength = 0;

    public int lengthOfLongestSubstring (String s) {
        for (right = 0; right < s.length(); right++) {
            while ( charSet.contains(s.charAt(right)) ) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main (String[] args) {
        LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(test.lengthOfLongestSubstring("abcabcbb"));
    }
}
