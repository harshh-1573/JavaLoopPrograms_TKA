package com.tka.demo2;

public class P7 {
    public static void main(String[] args) {
        for (int i = 555; i <= 999; i++) {
            if (i % 4 == 0 && i % 7 == 0) {
                System.out.println(i * i * i);
            }
        }
    }
}
