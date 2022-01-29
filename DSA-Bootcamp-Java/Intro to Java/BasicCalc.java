package com.abhikalp;

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        double num1,num2,result=0;
        String sign;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        num1 = input.nextDouble();

        System.out.print("Enter number 2: ");
        num2 = input.nextDouble();

        System.out.print("Enter any of the one operator(+, -, *, /): ");
        sign = input.next();

        if(sign.equals("+")){
            result = num1 + num2;
        }
        else if(sign.equals("-")){
            result = num1 - num2;
        }
        else if(sign.equals("*")){
            result = num1 * num2;
        }
        else if(sign.equals("/")){
            result = num1 / num2;
        }
        else{
            System.out.println("Invalid input");
        }

        System.out.println("The result is " + result);
    }
}
