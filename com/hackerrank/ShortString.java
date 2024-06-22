package com.hackerrank;

import java.util.*;

public class ShortString {
    public static String superReducedString (String s) {
        // Write your code here
        char[]      chars        = s.toCharArray();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if ( !stack.isEmpty() && stack.peek().equals(String.valueOf(chars[i])) ) {
                stack.pop();
            }
            else {
                stack.push(String.valueOf(chars[i]));
            }
        }
        if ( stack.isEmpty() ) {
            return "Empty String";
        }
        return String.join("", stack);
    }

    public static void main (String[] args) {
        ShortString s = new ShortString();
        System.out.println(s.superReducedString(
            "zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh"));
    }
}
