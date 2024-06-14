package org.example;

import java.util.Scanner;

public class NewspaperAgency {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int totalNoSold=scanner.nextInt();
        int costPerCopy=scanner.nextInt();
        int costSpentPerCopy=scanner.nextInt();
        int profit=(totalNoSold*costPerCopy)-(totalNoSold*costSpentPerCopy)-100;
        System.out.println("The profit obtained is "+profit);
    }
}
