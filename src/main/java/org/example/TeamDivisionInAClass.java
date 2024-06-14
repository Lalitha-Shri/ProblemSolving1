package org.example;

import java.util.Scanner;

public class TeamDivisionInAClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int totalStudent=scanner.nextInt();
        int totalTeam=scanner.nextInt();
        int numberOfStudentInTeam=totalStudent/totalTeam;
        int leftOutStudent=totalStudent%totalTeam;
        System.out.println("The number of students in each team is "+numberOfStudentInTeam +" and left out is "+leftOutStudent);

    }
}
