package com.abhikalp;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        int p,t;
        double r, si;

        Scanner sc = new Scanner(System.in);

        System.out.print("Principle Amount: ");
        p = sc.nextInt();

        System.out.print("Time: ");
        t = sc.nextInt();

        System.out.print("Rate: ");
        r = sc.nextDouble();

        si = p * r * t;
        System.out.println("Simple Interest is " + si);
    }
}
