package com.leetcode.easy;

public class ClosestNumberToZero {
    public int findClosestNumber(int[] nums) {
        int result = Integer.MAX_VALUE;
        for (int num : nums) {
            if ( Math.abs(num) < Math.abs(result) || num == Math.abs(result) ) {
                result = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ClosestNumberToZero c = new ClosestNumberToZero();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(c.findClosestNumber(nums));
    }
}
