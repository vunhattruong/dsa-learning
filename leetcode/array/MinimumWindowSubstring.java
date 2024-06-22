package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings s and t of lengths m and n respectively, return the minimum window
substring of s such that every character in t (including duplicates) is included in the window. If there is no such
substring, return the empty string "".

The testcases will be generated such that the answer is unique.

Example 1:
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

Example 2:
Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.

Example 3:
Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
*/
import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Frequency map for characters in t
        Map<Character, Integer> tFreqMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreqMap.put(c, tFreqMap.getOrDefault(c, 0) + 1);
        }

        // Frequency map for the current window in s
        Map<Character, Integer> windowFreqMap = new HashMap<>();
        int left = 0, right = 0;
        int required = tFreqMap.size();
        int formed = 0;
        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            windowFreqMap.put(c, windowFreqMap.getOrDefault(c, 0) + 1);

            if (tFreqMap.containsKey(c) && windowFreqMap.get(c).intValue() == tFreqMap.get(c).intValue()) {
                formed++;
            }

            // Try and contract the window until it ceases to be 'desirable'
            while (left <= right && formed == required) {
                c = s.charAt(left);

                // Update the minimum window
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minLeft = left;
                }

                // The character at the position pointed by the `left` pointer is no longer part of the window
                windowFreqMap.put(c, windowFreqMap.get(c) - 1);
                if (tFreqMap.containsKey(c) && windowFreqMap.get(c).intValue() < tFreqMap.get(c).intValue()) {
                    formed--;
                }

                // Move the left pointer ahead, this would help to look for a new window
                left++;
            }

            // Keep expanding the window once we are done contracting
            right++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
    }

    public static void main(String[] args) {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        System.out.println("Minimum window substring: " + solution.minWindow(s1, t1)); // Output: "BANC"

//        String s2 = "a";
//        String t2 = "a";
//        System.out.println("Minimum window substring: " + solution.minWindow(s2, t2)); // Output: "a"
//
//        String s3 = "a";
//        String t3 = "aa";
//        System.out.println("Minimum window substring: " + solution.minWindow(s3, t3)); // Output: ""
    }
}

