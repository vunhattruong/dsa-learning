package com.routine.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the
range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]

Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n

Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count
as extra space.
 */
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers (int[] nums) {
        List<Integer> result = new ArrayList<>(nums.length);
        Set<Integer>  set    = new HashSet<>(nums.length);
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if ( !set.contains(i) ) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main (String[] args) {
        FindAllNumbersDisappearedInAnArray solution = new FindAllNumbersDisappearedInAnArray();
        System.out.println(solution.findDisappearedNumbers(new int[] { 1, 1 }));
        System.out.println(solution.findDisappearedNumbers(new int[] { 2, 4 }));
        System.out.println(solution.findDisappearedNumbers(new int[] { 4,3,2,7,8,2,3,1 }));
        System.out.println(solution.findDisappearedNumbers(new int[] { 1 }));
    }
}
