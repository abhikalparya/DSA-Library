package com.abhikalp;

import java.util.Scanner;

public class USDconversion {
    public static void main(String[] args) {
        double curr, usd;

        Scanner input = new Scanner(System.in);

        System.out.print("Currency in rupees:");
        curr = input.nextDouble();

        usd = curr / 75;
        System.out.println("Currency in USD is " + usd);
    }
}
