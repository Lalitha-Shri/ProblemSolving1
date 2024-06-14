package org.example;

import java.util.Scanner;

public class ReverseTraingle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1 - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}