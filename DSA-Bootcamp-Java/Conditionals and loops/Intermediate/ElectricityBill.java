package com.abhikalp;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        int unit;
        double rate=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the units consumed:");
        unit = input.nextInt();

        if(unit>=0 && unit<=200){
            rate = 0.5 * unit;
        }
        else if(unit>200 && unit<=400){
            rate = 100 + (0.65 * (unit-200));
        }
        else if(unit>400 && unit<=600){
            rate = 230 + (0.8 * (unit-400));
        }
        else if(unit>600){
            rate = 390 + (unit-600);
        }
        else {
            System.out.println("Invalid!");
        }
        System.out.println("Rate: " + rate);
    }
}
