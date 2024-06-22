package com.leetcode.slidingwindow;

/*
Longest Substring Without Duplicates
Given a string s, find the length of the longest substring without duplicate characters.
A substring is a contiguous sequence of characters within a string.

Example 1:
Input: s = "zxyzxyz"
Output: 3
Explanation: The string "xyz" is the longest without duplicate characters.

Example 2:
Input: s = "xxxx"
Output: 1

Constraints:
0 <= s.length <= 1000
s may consist of printable ASCII characters.
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringNoDuplicates {
    public int lengthOfLongestSubstring (String s) {
        if (s == null || s.length() == 0 || s.isEmpty()) return 0;
        char[]         chars   = s.toCharArray();
        if (chars.length == 1) return 1;
        int            left    = 0;
        int            right;
        int            longest = 0;
        Set<Character> set     = new HashSet<>();
        for (right = 0; right < chars.length; right++) {
            while ( set.contains(chars[right]) ) {
                set.remove(chars[left]);
                left++;
            }
            set.add(chars[right]);
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }

    public static void main (String[] args) {
        LongestSubStringNoDuplicates longestSubStringNoDuplicates = new LongestSubStringNoDuplicates();
        System.out.println(longestSubStringNoDuplicates.lengthOfLongestSubstring("au"));
    }
}
