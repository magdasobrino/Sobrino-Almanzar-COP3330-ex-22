/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */
import java.util.Scanner;
public class Exercise22 {
    public static void main(String[] args) {

        int first, second, third;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the first number:");
        first = scnr.nextInt();

        System.out.println("Enter the second number:");
        second = scnr.nextInt();

        System.out.println("Enter the third number:");
        third = scnr.nextInt();

        if(!(first == second && first == third)){

            int max = first;

            if(second > max){
                max = second;
            }

            if(third > max){
                max = third;
            }

            System.out.println("The largest number is " + max + ".");
        }

        System.exit(0);
    }//end of main

}//end of program
