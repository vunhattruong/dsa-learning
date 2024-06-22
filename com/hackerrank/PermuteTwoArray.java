package com.hackerrank;

import java.util.*;

public class PermuteTwoArray {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        Collections.sort(A);
        Collections.sort(B);
        int right = B.size() - 1;

        for (int left = 0; left < A.size(); left++) {
            if (A.get(left) + B.get(right) < k) {
                return "NO";
            }
            right--;
        }
        return "YES";
    }

    public static String caesarCipher(String s, int k) {
        String  specialCharacters = "!@#$%^&*()-+";
        // Write your code here
        int[] arrayDescript = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (specialCharacters.indexOf(s.charAt(i)) >= 0) {
                arrayDescript[i] = s.charAt(i);
            } else {
                arrayDescript[i] = s.charAt(i) + 2 > 'z' ? s.charAt(i) + 2 - 26 : s.charAt(i) + 2;
            }
        }
        StringBuilder decryptedMessage = new StringBuilder();
        for (int value : arrayDescript) {
            decryptedMessage.append((char) value);
        }
        return decryptedMessage.toString();
    }

    public static String caesarCipher2(String s, int k) {
        // Normalize the shift value
        k = k % 26;

        StringBuilder encrypted = new StringBuilder();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                // Shift within 'a' to 'z'
                char shifted = (char) (c + k);
                if (shifted > 'z') {
                    shifted = (char) (shifted - 26);
                }
                encrypted.append(shifted);
            } else if (Character.isUpperCase(c)) {
                // Shift within 'A' to 'Z'
                char shifted = (char) (c + k);
                if (shifted > 'Z') {
                    shifted = (char) (shifted - 26);
                }
                encrypted.append(shifted);
            } else {
                // Leave non-letter characters unchanged
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }

    public static void main (String[] args) {
        System.out.println(caesarCipher2("middle-Outz", 2));
    }
}
