package com.abhikalp;

import java.util.Scanner;

public class AverageOfNnum {
    public static void main(String[] args) {
        int n, count = 1;
        float  x, avg, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n:");
        n = sc.nextInt();

        while (count <= n)
        {
            System.out.print("Enter the "+ count +" number:");
            x = sc.nextInt();
            sum += x;
            ++count;
        }
        avg = sum/n;
        System.out.println("The Average is"+avg);
    }
}
