package com.leetcode.array;

import java.util.*;

public class FindSmallestMissingPositive {

    public int findSmallestMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // Add only positive numbers to the set
        for (int number : nums) {
            if (number > 0) {
                set.add(number);
            }
        }

        // Find the smallest positive integer that is not in the set
        int smallestMissingPositive = 1;
        while (set.contains(smallestMissingPositive)) {
            smallestMissingPositive++;
        }

        return smallestMissingPositive;
    }
}
