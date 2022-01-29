package com.abhikalp;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        int temp, r, sum=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = input.nextInt();

        temp = n;

        while(n>0){
            r = n % 10;
            sum = sum + (r * r* r);
            n = n / 10;
        }

        if(temp == sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not armstrong Number");
        }
    }
}
