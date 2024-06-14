package org.example;

import java.util.Scanner;

public class LucasSequence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=0,c=1;
        System.out.print(a+" "+b+" "+c);
        for (int i=3;i<n;i++)
        {
            int sum=a=b+c;
            System.out.print(" "+sum);
            a=b;
            b=c;
            c=sum;
        }
    }
}
