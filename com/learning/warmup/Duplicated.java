package com.learning.warmup;

import java.util.HashSet;
import java.util.Set;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums= [1, 2, 3, 4]
Output: false
Explanation: There are no duplicates in the given array.
Example 2:

Input: nums= [1, 2, 3, 1]
Output: true
Explanation: '1' is repeating.
 */
public class Duplicated {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Duplicated d = new Duplicated();
        System.out.println(d.containsDuplicate(new int[]{1, 1, 2, 3, 3, 4}));
    }
}
