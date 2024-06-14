package org.example;

import java.util.Scanner;

public class ThreeSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=3;
        for(int i=1;i<=n;i++)
        {
            int product= (int) Math.pow(a,i);
            System.out.print(product+" ");

        }

    }

}
