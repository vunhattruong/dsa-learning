package com.leetcode.array;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right;
        int sum = 0;
        int size = nums.length;
        int minLength = Integer.MAX_VALUE;

        for ( right = 0; right < size; right++ ) {
            sum = sum + nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }
        if ( minLength == Integer.MAX_VALUE ) {
            return 0;
        }
        return minLength;
    }
    public static void main(String[] args) {
        MinimumSizeSubarraySum minSubarraySum = new MinimumSizeSubarraySum();
        System.out.println(minSubarraySum.minSubArrayLen(5, new int[]{2, 3, 4, 5, 1, 2}));
        System.out.println(minSubarraySum.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}
