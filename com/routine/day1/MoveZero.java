package com.routine.day1;

import java.util.Arrays;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 */

public class MoveZero {

    public void moveZeros(int[] nums) {
        int left = 0;
        int right = 0;
        int length = nums.length;
        while (right < length) {
            if (nums[right] != 0) {
                int tempt = nums[left];
                nums[left] = nums[right];
                nums[right] = tempt;
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] nums1 = {0};
        MoveZero solution = new MoveZero();
        solution.moveZeros(nums);
        solution.moveZeros(nums1);
    }
}
