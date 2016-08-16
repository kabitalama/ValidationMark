/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.arraymarksheet;

import java.util.Scanner;

/**
 *
 * @author Kavi
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String students[] = {"Jamuna", "Jamyan", "Rupa", "Binita", "Ashish"};
        String subjects[] = {"Java", "PHP", "SQL"};
        int total = 0;
        double percentage = 0;

        int marks[][] = new int[students.length][subjects.length];
        for (int i = 0; i < students.length; i++) {
            
            System.out.println(students[i]);

            for (int j = 0; j < subjects.length; j++) {
                    
                System.out.println("Enter the Marks of " + subjects[j]);
                marks[i][j] = input.nextInt();
                while(!(marks[i][j]>=0 && marks[i][j]<=100)){
                     System.out.println("Invalid input");
                     marks[i][j]=input.nextInt();
                }
                total += marks[i][j];

            }

            System.out.println("The Total of " + students[i] + "mark is = " + total);
            percentage = (total / subjects.length);
            System.out.println("The percentage of is:" + percentage + "%");
            total = 0;
        }

    }

}

