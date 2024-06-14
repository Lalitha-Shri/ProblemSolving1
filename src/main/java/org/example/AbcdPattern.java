package org.example;

import java.util.Scanner;

public class AbcdPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ascii=65;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

            char c=(char)ascii;
                System.out.print(c);
            ascii++;
            }
            System.out.println();
    }
}}
