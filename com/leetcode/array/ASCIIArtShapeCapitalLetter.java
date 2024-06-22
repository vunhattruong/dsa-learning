package com.leetcode.array;

public class ASCIIArtShapeCapitalLetter {
    public void capitalLetter(int N) {
        for (int i = 0; i < N - 1; i++) {
            System.out.println('L');
        }
        for (int i = 0; i < N; i++) {
            System.out.print('L');
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ASCIIArtShapeCapitalLetter c = new ASCIIArtShapeCapitalLetter();
        c.capitalLetter(-1);
    }
}
