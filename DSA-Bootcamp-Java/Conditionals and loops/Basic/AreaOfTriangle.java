package com.abhikalp;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Base: ");
        int b = in.nextInt();
        System.out.print("Height: ");
        int h = in.nextInt();

        double a = 0.5 * b * h;
        System.out.println("Area: " + a);
    }
}
