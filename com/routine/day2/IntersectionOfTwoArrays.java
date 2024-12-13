package com.routine.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Given two integer arrays nums1 and nums2, return an array of their
intersection. Each element in the result must be unique, and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 */
public class IntersectionOfTwoArrays {

    public int[] intersection (int[] a, int[] b) {
        int          lenA = a.length;
        int          lenB = b.length;
        Set<Integer> set  = new HashSet<>();
        for (int i = 0; i < lenA; i++) {
            if ( i < lenA ) {
                set.add(a[i]);
            }
        }
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < lenB; i++) {
            if ( set.contains(b[i]) ) {
                result.add(b[i]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main (String[] args) {
        IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();
        System.out.println(
            Arrays.toString(solution.intersection(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 })));
    }
}
