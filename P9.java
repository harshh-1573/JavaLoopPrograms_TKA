package com.tka.demo2;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Mango and Apple");
            } else if (i % 3 == 0) {
                System.out.println("Mango");
            } else if (i % 5 == 0) {
                System.out.println("Apple");
            } else {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
