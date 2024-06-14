package org.example;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int copy=num;
        int sum=0,digit;
        while (num>0)
        {
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println(sum);
        if(copy%sum==0)
        {
            System.out.println("It is a Harshad Number");
        }
        else
        {
            System.out.println("It is not a Harshad Number");
        }
    }
}
