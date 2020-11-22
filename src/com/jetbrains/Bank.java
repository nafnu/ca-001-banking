package com.jetbrains;
import java.util.Scanner;

public class Bank {

    private static final Scanner kb = new Scanner(System.in);



    /*public static void main(String[] args) { Testing coding*/
    public Bank(){


        boolean exit = false;
        int option;

        do {
            option = MainMenu();

            switch (option) {
                case 1:
                    System.out.println("\nPlease enter the PIN for login as an employee:\t");
                    break;
                case 2:
                    System.out.println("\nPlease enter the following information requested.\t");

                    break;
                case 3:
                    System.out.println("\nGood Bye!\t");
                    exit = true;
                    break;
                default:
                    System.out.println("Only numbers between 1 to 3 are the options available.");
            }
        } while (!exit);
    }


    public int MainMenu() {

        System.out.println("\n+++++++    MAIN MENU    +++++++\t");
        System.out.println("\nPlease select and enter the number of one of these options: \t");
        System.out.println("Option 1: I am a Bank Employee\t");
        System.out.println("Option 2: I am a Customer\t");
        System.out.println("Option 3: Exit program\t");
        return kb.nextInt();
    }

}


