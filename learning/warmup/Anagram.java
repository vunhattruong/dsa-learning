package com.learning.warmup;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all
the original letters exactly once.

Example 1:
Input: s = "listen", t = "silent"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Example 3:
Input: s = "hello", t = "world"
Output: false
 */
public class Anagram {
    public boolean isAnagram (String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        if ( sArray.length != tArray.length ) {
            return false;
        }
        Map<Character, Integer> setS = new HashMap<>();
        Map<Character, Integer> setT = new HashMap<>();
        for (char c : sArray) {
            setS.put(c, setS.getOrDefault(c, 0) + 1);
        }
        for (char c : tArray) {
            setT.put(c, setT.getOrDefault(c, 0) + 1);;
        }

        return setS.entrySet().containsAll(setT.entrySet());

    }

    public static void main (String[] args) {
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram("aacc", "ccac"));
    }
}
