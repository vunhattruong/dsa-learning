package com.leetcode.easy;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,2,4], target = 6
Output: [1,2]

Input: nums = [3,3], target = 6
Output: [0,1]

Approach using a hash table:

Create an empty hash table to store elements and their indices.
Iterate through the array from left to right.
For each element nums[i], calculate the complement by subtracting it from the target: complement = target - nums[i].
Check if the complement exists in the hash table. If it does, we have found a solution.
If the complement does not exist in the hash table, add the current element nums[i] to the hash table with its index
as the value.
Repeat steps 3-5 until we find a solution or reach the end of the array.
If no solution is found, return an empty array or an appropriate indicator.
This approach has a time complexity of O(n) since hash table lookups take constant time on average. It allows us to
solve the Two Sum problem efficiently by making just one pass through the array.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddSum {

    public static int[] twoSum (int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int                   size   = nums.length;

        // Build the hash table
        for (int i = 0; i < size; i++) {
            numMap.put(nums[i], i);
            // {3:0}
            // {2:1}
            // {4:2}
        }
        // Find the complement
        for (int i = 0; i < size; i++) {
            int total = target - nums[i]; // 6-3 = 3
            if ( numMap.containsKey(total) && numMap.get(total) != i ) {
                // yes && numMap.get(3) = 0
                return new int[] { i, numMap.get(total) };
            }
        }
        return new int[] {}; // No solution found
    }

    public static void main (String[] args) {
        int[] input = { 3, 2, 4 };
        System.out.println(Arrays.toString(twoSum(input, 6)));
    }
}
