package com.abhikalp;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        double num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        num1 = input.nextDouble();

        System.out.print("Enter number 2: ");
        num2 = input.nextDouble();

        if(num1 > num2){
            System.out.println("Number 1 is largest");
        }
        else if(num2 > num1){
            System.out.println("Number 2 is largest");
        }
        else{
            System.out.println("They both are same");
        }
    }
}
