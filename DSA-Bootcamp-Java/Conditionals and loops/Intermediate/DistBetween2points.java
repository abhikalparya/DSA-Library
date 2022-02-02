package com.abhikalp;

import java.util.Scanner;

public class DistBetween2points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,x2,y1,y2;
        double dis;

        System.out.print("Enter x1 and x2:");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        System.out.print("Enter y1 and y2:");
        y1 = sc.nextInt();
        y2 = sc.nextInt();

        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+") ===> "+dis);
    }
}
