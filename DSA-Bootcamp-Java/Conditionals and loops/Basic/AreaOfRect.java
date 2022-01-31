package com.abhikalp;

import java.util.Scanner;

public class AreaOfRect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Base: ");
        int b = in.nextInt();
        System.out.print("Height: ");
        int h = in.nextInt();

        int a = b * h;
        System.out.println("Area: " + a);
    }
}
