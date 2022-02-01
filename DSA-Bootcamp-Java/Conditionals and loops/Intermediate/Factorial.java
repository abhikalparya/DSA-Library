package com.abhikalp;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number:");
        int num = in.nextInt();
        int fac = 1;

        while(num != 0){
            fac *= num;
            num--;
        }

        System.out.println("Factorial of the number is " + fac);
    }
}
