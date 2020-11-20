package com.jetbrains;
import java.util.Scanner;

public class Bank {

    private static final Scanner kb = new Scanner(System.in);
    private static String PinEmployee;

    /*public static void GeneralOption()*/public static void main(String[] args){
        boolean exit = false;
        int option = 0;

        while (!exit) {
            option = MainMenu();

            switch (option) {
                case 1:

                case 2:
                    System.out.println("\nPlease enter the fallowing information requested.\t");
                case 3:
                    System.out.println("\nGood Bye\t");
                    exit = true;
                default :
                    System.out.println("\nOnly numbers between 1 y 3\t");
            }
        }
      }


    public static int MainMenu(){

        System.out.println("\n+++++++    MAIN MENU    +++++++\t");
        System.out.println("\nPlease select and enter the number of one of these options: \t");
        System.out.println("Option 1: I am a Bank Employee\t");
        System.out.println("Option 2: I am a Customer\t");
        System.out.println("Option 3: Exit program\t");
        System.out.println("");
        return kb.nextInt();
    }


    CASE 1
    System.out.println("\nPlease enter the PIN for login as employee:\t");
    PinEmployee = kb.next();
    String PinEmployeeConstant = "A1234";

    boolean compare = true;

                    do {
        System.out.println("\nPlease enter the PIN for login as employee:\t");
    } while (!!PinEmployee.equals(PinEmployeeConstant));
}


