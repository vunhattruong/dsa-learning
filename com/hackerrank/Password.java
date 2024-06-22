package com.hackerrank;

public class Password {
    public static int minimumNumber (int n, String password) {
        // Return the minimum number of characters to make the password strong
        char[]  chars             = password.toCharArray();
        String  numbers           = "0123456789";
        String  lowerCase         = "abcdefghijklmnopqrstuvwxyz";
        String  upperCase         = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String  specialCharacters = "!@#$%^&*()-+";
        int     missingType       = 0;
        boolean isLetter          = false;
        boolean isDigit           = false;
        boolean isLowerCase       = false;
        boolean isUpperCase       = false;

        for (int i = 0; i < chars.length; i++) {
            if ( numbers.indexOf(chars[i]) >= 0 ) {
                isLetter = true;
            }
            else if ( specialCharacters.indexOf(chars[i]) >= 0 ) {
                isDigit = true;
            }
            else if ( lowerCase.indexOf(chars[i]) >= 0 ) {
                isLowerCase = true;
            }
            else if ( upperCase.indexOf(chars[i]) >= 0 ) {
                isUpperCase = true;
            }
        }
        if ( !isLetter ) {
            missingType++;
        }
        if ( !isDigit ) {
            missingType++;
        }
        if ( !isLowerCase ) {
            missingType++;
        }
        if ( !isUpperCase ) {
            missingType++;
        }
        int charactersNeededForLength = Math.max(0, 6 - n);

        return Math.max(missingType, charactersNeededForLength);
    }

    public static void main (String[] args) {
        System.out.println(Password.minimumNumber(9, "#HackerRank"));
    }
}
