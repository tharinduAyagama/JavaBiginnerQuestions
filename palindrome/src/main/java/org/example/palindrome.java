package org.example;

public class palindrome {
    public boolean isPalindrome(String word) {
        String original = word.toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }
}



