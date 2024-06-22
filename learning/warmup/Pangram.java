package com.learning.warmup;

import java.util.HashSet;
import java.util.Set;

/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing English letters (lower or upper-case), return true if sentence is a pangram, or
false otherwise.

Note: The given sentence might contain other characters like digits or spaces, your solution should handle these too.

Example 1:
Input: sentence = "TheQuickBrownFoxJumpsOverTheLazyDog"
Output: true
Explanation: The sentence contains at least one occurrence of every letter of the English alphabet either in lower or
 upper case.

Example 2:
Input: sentence = "This is not a pangram"
Output: false
Explanation: The sentence doesn't contain at least one occurrence of every letter of the English alphabet.
 */
public class Pangram {
    public boolean checkIfPangram (String sentence) {
        Set<Character> set = new HashSet<>();
        sentence = sentence.toLowerCase();
        for (char c : sentence.toCharArray()) {
            if ( c >= 'a' && c <= 'z' ) {
                set.add(c);
            }
            if ( c >= 'A' && c <= 'Z' ) {
                set.add(c);
            }
            if ( c >= '0' && c <= '9' ) {
                set.add(c);
            }
            if (set.size() == 26) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Pangram p = new Pangram();
        System.out.println(p.checkIfPangram("This is not a pangram"));
    }
}
