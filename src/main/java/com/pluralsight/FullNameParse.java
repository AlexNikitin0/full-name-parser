package com.pluralsight;
import java.util.Scanner;


public class FullNameParse {

    public static void main(String[] args) {

        //declare vars
        Scanner keyboard = new Scanner(System.in);
        String choice;
        String first;
        String middle;
        String last;

        System.out.print("Do you have a middle name? (Y/N): ");
        choice = keyboard.nextLine();

        if(choice.equalsIgnoreCase("y")){

            System.out.print("Enter your first name: ");
            first = keyboard.nextLine().trim();

            System.out.print("Enter your middle name: ");
            middle = keyboard.nextLine().trim();

            System.out.print("Enter your last name: ");
            last = keyboard.nextLine().trim();

            System.out.println("First name: " + first);
            System.out.println("Middle name: " + middle);
            System.out.println("Last name: " + last);



        }
        else if(choice.equalsIgnoreCase("N")){
            System.out.print("Enter your first name: ");
            first = keyboard.nextLine().trim();

            System.out.print("Enter your last name: ");
            last = keyboard.nextLine().trim();

            System.out.println("First name: " + first);
            System.out.println("Middle name: (none)");
            System.out.println("Last name: " + last);

        }

    }
}
