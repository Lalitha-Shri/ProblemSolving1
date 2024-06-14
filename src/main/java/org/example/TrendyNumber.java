package org.example;

import java.util.Scanner;

public class TrendyNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int numCopy=num;
        int count=0;
        while (num>0)
        {
            count++;
            num=num/10;
        }
        int mid=(numCopy%100)/10;
//        System.out.println(mid);
//        System.out.println(count);
        if(count==3 && mid%3==0)
        {
            System.out.println("Trendy Number");
        }
        else {
            System.out.println("Not A Trendy Number");
        }
    }
}
