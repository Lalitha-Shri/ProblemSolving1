package org.example;

import java.util.Scanner;

public class Fiveseries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=6;
        System.out.print(a+" ");
        for(int i=1;i<n;i++)
        {
            int sum=a+(5*i);
            System.out.print(sum+" ");
            a=sum;
        }

    }

}
