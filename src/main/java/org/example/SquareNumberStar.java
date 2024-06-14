package org.example;

import java.util.Scanner;

public class SquareNumberStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        for (int i = 1; i <= n1; i++) {
            int k=1;
            for (int j = 1; j <= n2; j++) {
                if(j%2==0) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(k);
                    k++;
                }
            }
            System.out.println();
        }
    }
}
