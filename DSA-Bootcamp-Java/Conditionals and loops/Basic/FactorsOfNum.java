package com.abhikalp;

import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number:");
        int num = in.nextInt();
        System.out.println("All factors of " + num + " are:");

        for(int i=1; i<=num; i++){
            if(num%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
