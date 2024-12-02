package com.routine.day1;

import java.util.HashMap;
import java.util.Map;

/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element
always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 */

public class MajorityElement {

    public int majorityElement (int[] nums) {
        Map<Integer, Integer> numMap            = new HashMap<>();
        int                   majorityCondition = nums.length / 2;
        int                   result            = 0;
        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
            if (numMap.containsKey(num) && numMap.get(num) > majorityCondition) {
                result = num;
                return result;
            }
        }
        return result;
    }

    public static void main (String[] args) {
        int[]           nums     = { 3, 2, 3 };
        int[]           nums1    = { 2, 2, 1, 1, 1, 2, 2 };
        MajorityElement solution = new MajorityElement();
        System.out.println(solution.majorityElement(nums));
        System.out.println(solution.majorityElement(nums1));
    }
}
