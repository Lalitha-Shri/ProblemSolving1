package org.example;

import java.util.Scanner;

public class SquareNumberPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        for(int i=1;i<=n1;i++)
        {
            for(int j=1;j<=n2;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
