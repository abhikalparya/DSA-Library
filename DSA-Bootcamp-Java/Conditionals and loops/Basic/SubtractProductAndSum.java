package com.abhikalp;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number:");
        int n = in.nextInt();
        int sum = 0;
        int mul = 1;

        while(n>0){
            int rem = n % 10;
            sum += rem;
            mul *= rem;
            n = n / 10;
        }
        int diff = mul - sum;
        System.out.println("Difference of Product and Sum: " + diff);
    }
}
