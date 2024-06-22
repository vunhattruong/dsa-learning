package com.leetcode.array;

import java.util.Arrays;

public class SortColors {
    public void sortColors (int[] nums) {
        int left    = 0;
        int right   = nums.length - 1;
        int current = 0;

        while ( current <= right ) {
            if ( nums[current] == 0 ) {
                swap(nums, left, current);
                left++;
                current++;
            }
            else if ( nums[current] == 1 ) {
                current++;
            }
            else if ( nums[current] == 2 ) {
                swap(nums, current, right);
                right--;
            }
        }

    }

    private void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main (String[] args) {
        SortColors sortColors = new SortColors();
        int[]      nums       = { 2, 0, 1, 0, 2, 1, 0, 1, 0 };
        sortColors.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
