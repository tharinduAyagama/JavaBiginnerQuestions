package org.example;

public class palindrome {
    public boolean isPalindrome(String word) {
        String original = word.toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }

    public boolean isPalindromeUsingTwoArrays(String word) {

        int length = word.length();

        char[] originalArray = new char[length];
        char[] reverseArray = new char[length];

        for (int i = 0; i < length; i++) {
            originalArray[i] = word.charAt(i);
        }

        for (int i = 0; i < length; i++) {
            reverseArray[i] = originalArray[length - 1 - i];
        }

        for (int i = 0; i < length; i++) {
            if (originalArray[i] == reverseArray[i]) {
                return true;
            }
        }
        return false;
    }
}



