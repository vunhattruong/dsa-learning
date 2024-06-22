package com.leetcode.slidingwindow;
/*
Given two strings s and t, return the shortest substring of s such that every character in t, including duplicates,
is present in the substring. If such a substring does not exist, return an empty string "".
You may assume that the correct output is always unique.

Example 1:
Input: s = "OUZODYXAZV", t = "XYZ"
Output: "YXAZ"
Explanation: "YXAZ" is the shortest substring that includes "X", "Y", and "Z" from string t.

Example 2:
Input: s = "xyz", t = "xyz"
Output: "xyz"

Example 3:
Input: s = "x", t = "xy"
Output: ""
 */

public class MinimumWindowCharacters {
    public String minWindow(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int left = 0;
        int right = 0;
        String result;
        if (charS.length == 0 || charT.length == 0 || charT.length < charS.length) {
            return "";
        }


        return "";
    }
}
