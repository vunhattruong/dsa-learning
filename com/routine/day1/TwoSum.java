package com.routine.day1;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // build the hashmap to set the value of nums being key and the index is value
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        // solution to find the result by:
        // calculate the total = target - nums[i]
        // then check the total contains in map key
        // if true => and check the value of the total in map vs the current index
        // if true => return (the current index ; the total value in the map)
        for (int i = 0; i < nums.length; i++) {
            int total = target - nums[i];
            if ( numMap.containsKey(total) && numMap.get(total) != i ) {
                return new int[] { i, numMap.get(total) };
            }
        }
        return null;
    }
    public static void main (String[] args) {
        int[]                 nums   = { 2, 7, 11, 15 };
        int                   target = 9;
        int[]                 nums1   = { 3, 2, 4 };
        int                   target1 = 6;
        int[]                 nums2   = { 3, 3 };
        int                   target2 = 6;
        TwoSum solution = new TwoSum();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
        System.out.println(Arrays.toString(solution.twoSum(nums1, target1)));
        System.out.println(Arrays.toString(solution.twoSum(nums2, target2)));
    }
}
