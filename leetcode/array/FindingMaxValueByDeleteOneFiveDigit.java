package com.leetcode.array;

public class FindingMaxValueByDeleteOneFiveDigit {
    public int findMaxValue (int N) {
        String        newNumber     = String.valueOf(N);
        char          digitToDelete = '5';
        int           newGuess2     = 0;
        StringBuilder builder1      = new StringBuilder(newNumber);
        StringBuilder builder2      = new StringBuilder(newNumber);

        int newGuess1         = Integer.parseInt(builder1.deleteCharAt(newNumber.indexOf(digitToDelete)).toString());
        int indexOfOtherDigit = newNumber.indexOf(digitToDelete, newNumber.indexOf(digitToDelete) + 1);
        if ( newGuess1 == 0 ) {
            newGuess2 = 0;
        }
        if ( indexOfOtherDigit > 0 ) {
            newGuess2 = Integer.parseInt(
                builder2.deleteCharAt(indexOfOtherDigit).toString());
        }
        return newGuess1 > newGuess2 ? newGuess1 : newGuess2;
    }

    public static void main (String[] args) {
        FindingMaxValueByDeleteOneFiveDigit value = new FindingMaxValueByDeleteOneFiveDigit();
        System.out.println(value.findMaxValue(12345));
    }
}
