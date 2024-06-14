package org.example;

import java.util.Scanner;

public class EcoClub {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int s1=0,s2=1,s3=0;
        if(n==1)
        {
            System.out.print(s1);
        }else if(n==2)
        {
            System.out.print(s2);
        }else
        {
            for(int i=3;i<=n;i++)
            {
                s3=s1+s2;
                s1=s2;
                s2=s3;
            }
            System.out.print(s3);
        }
    }
    }

