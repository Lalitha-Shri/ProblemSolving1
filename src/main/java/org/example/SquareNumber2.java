package org.example;

import java.util.Scanner;

public class SquareNumber2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        for(int i=1;i<=n1;i++)
        {
            for(int j=1;j<=n2;j++) {
                if (i % 2 != 0 && j % 2 != 0) {
                    System.out.print("1 ");
                } else if(i%2==0 && j%2==0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();

    }
    }

}
