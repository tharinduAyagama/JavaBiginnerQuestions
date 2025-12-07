package org.example;

import java.util.Scanner;

public class Main {
    private static LargestNumber finder;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LargestNumber finder = new LargestNumber();
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();


        int largest = finder.findLargest(num1, num2, num3);

        System.out.println("The largest number is: "+largest );
    }
}
