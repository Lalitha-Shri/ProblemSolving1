package org.example;

import java.util.Scanner;

public class MidPointOfLine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();

        float m1=(x1+x2)/2f;
        float m2=(y1+y2)/2f;
        System.out.println("Binoys house is located at ("+m1+","+m2+")");



    }
}
