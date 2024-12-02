package com.routine.day1;

import java.util.Arrays;

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100]

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 */
public class SquaresOfSortedArray {
    public int [] sortedSquares (int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] nums1 = {-7,-3,2,3,11};
        SquaresOfSortedArray solution = new SquaresOfSortedArray();
        System.out.println(Arrays.toString(solution.sortedSquares(nums)));
        System.out.println(Arrays.toString(solution.sortedSquares(nums1)));
    }
}
