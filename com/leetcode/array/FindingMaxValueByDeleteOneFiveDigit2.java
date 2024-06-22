package com.leetcode.array;

public class FindingMaxValueByDeleteOneFiveDigit2 {
    public int findMaxValue (int N) {
        String        newNumber     = String.valueOf(N);
        char          digitToDelete = '5';
        int maxValue   = Integer.MIN_VALUE;

        StringBuilder stringBuilder = new StringBuilder(newNumber);
        for (int index = 0; index < newNumber.length(); index++) {
            if (digitToDelete == newNumber.charAt(index)) {
                stringBuilder.deleteCharAt(index);
                String newNumberString = stringBuilder.toString();
                if (newNumberString.isEmpty() || newNumberString.equals("-")) {
                    newNumberString = "0";
                }
                int newNumberInt = Integer.parseInt(newNumberString);
                maxValue = Math.max(maxValue, newNumberInt);
                stringBuilder.insert(index, digitToDelete);
            }
        }
        return maxValue;
    }

    public static void main (String[] args) {
        FindingMaxValueByDeleteOneFiveDigit2 value = new FindingMaxValueByDeleteOneFiveDigit2();
        System.out.println(value.findMaxValue(0));
    }
}
