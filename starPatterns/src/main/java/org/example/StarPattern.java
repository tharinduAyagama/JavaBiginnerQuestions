package org.example;

public class StarPattern {

    public void printPattern(int rows) {

        for (int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

