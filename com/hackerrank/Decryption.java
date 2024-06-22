package com.hackerrank;

public class Decryption {
    public static String decrypt (String word) {
        StringBuilder decryptedMessage = new StringBuilder();

        // Initialize the cumulative sum with the first character's ASCII value
        int cumulativeSum = word.charAt(0);

        // Calculate the first decrypted character
        int firstDecryptedChar = cumulativeSum - 1;
        if (firstDecryptedChar < 'a') {
            firstDecryptedChar += 26;
        }
        decryptedMessage.append((char) firstDecryptedChar);

        // Iterate through the rest of the characters in the encrypted message
        for (int i = 1; i < word.length(); i++) {
            int encryptedChar = word.charAt(i);
            int decryptedChar = encryptedChar - cumulativeSum;

            // Ensure the character falls within the range 'a' to 'z'
            while (decryptedChar < 'a') {
                decryptedChar += 26;
            }

            decryptedMessage.append((char) decryptedChar);

            // Update the cumulative sum to include the new decrypted character
            cumulativeSum += decryptedChar;
        }

        return decryptedMessage.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        String encryptedMessage = "dnotq";
        System.out.println(decrypt(encryptedMessage));  // Output should be "crime"
    }
}
