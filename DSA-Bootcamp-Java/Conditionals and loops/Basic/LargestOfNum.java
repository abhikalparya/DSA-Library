package com.abhikalp;

import java.util.Scanner;

public class LargestOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input=0, large=0, counter=0;

        System.out.print("Enter a series of values (0 to quit): ");
        while ((input = in.nextInt()) != 0) {
            if (input > large){
                large = input;
            }
        }
        System.out.println("Largest number is: " + large);

    }
}
