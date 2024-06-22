package com.learning.warmup;

/*
Given an array of strings words and two different strings that already exist in the array word1 and word2, return the
 shortest distance between these two words in the list.

Example 1:
Input: words = ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"], word1 = "fox", word2 = "dog"
Output: 5
Explanation: The distance between "fox" and "dog" is 5 words.

Example 2:
Input: words = ["a", "c", "d", "b", "a"], word1 = "a", word2 = "b"
Output: 1
Explanation: The shortest distance between "a" and "b" is 1 word
 */
public class ShortestWordDistance {
    public int shortestDistance(String[] word, String word1, String word2) {
        int indexWord1 = -1;
        int indexWord2 = -1;
        int shortestDistance = Integer.MAX_VALUE;
        for (int i = 0; i < word.length; i++) {
            if (word[i].equals(word1)) {
                indexWord1 = i;
            }
            if (word[i].equals(word2)) {
                indexWord2 = i;
            }
            if ( indexWord1 != -1 && indexWord2 != -1 ) {
                shortestDistance = Math.min(Math.abs(indexWord1 - indexWord2), shortestDistance);
            }
        }
        return shortestDistance;
    }
    public static void main(String[] args) {
    ShortestWordDistance swd = new ShortestWordDistance();
    String[] word = {"a", "c", "d", "b", "a"};
    System.out.println(swd.shortestDistance(word, "a", "b"));
    }
}
