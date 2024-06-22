package com.leetcode.array;

/*
Find Numbers with Even Number of Digits
Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore, only 12 and 7896 contain an even number of digits.

Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.
 */
public class FindNumberOfDigit {

    public int countDigit (int number) {
        int count = 0;
        while ( number != 0 ) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public int findNumbers (int[] nums) {
        int countDigit = 0;
        for (int i = 0; i < nums.length; i++) {
            int digitNum = countDigit(nums[i]);
            if ( digitNum % 2 == 0 ) {
                countDigit++;
            }
        }
        return countDigit;
    }

    public static void main (String[] args) {
        int[] nums = { 555,901,482,1771 };
        System.out.println(new FindNumberOfDigit().findNumbers(nums));
    }
}
