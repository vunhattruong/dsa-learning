package com.hackerrank;

import java.util.*;

public class UniqueElement {
    public int lonelyinteger(List<Integer> a) {
        // Write your code here
        int                   count     = 0;
        for (int i = 0; i < a.size(); i++) {
            count ^= a.get(i);
        }
        return count;
    }
    public static void main(String[] args) {
        UniqueElement uniqueElement = new UniqueElement();
        List<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(1);
        System.out.println(uniqueElement.lonelyinteger(a));
    }
}
