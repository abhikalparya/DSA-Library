package com.abhikalp;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input=0, sum=0, counter=0;

        System.out.print("Enter a series of values (0 to quit): ");
        while ((input = in.nextInt()) != 0) {
            if (input != 0)
                sum = input + sum;
            counter++;
        }
        if (counter > 0) {
            System.out.println("The sum is: " + sum);
        }
        else {
            System.out.println("No data was entered.");
        }
    }
}
