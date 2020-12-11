package com.jetbrains;

import java.util.Scanner;

public class BankEmployee extends Bank {
/*
    static Scanner mp= new Scanner(System.in);


    String PinEmpConstant = "A1234";
    String Quit = "Q";
    boolean exit = false;

        do {
        System.out.println("\nPlease enter the PIN for login as employee:\t");
        System.out.println("--Or type Q to return to the main menu--");
        String PinEmp = mp.next();
        if (PinEmpConstant.equals(PinEmp)) {
            exit = true;
        }

        if (Quit.equals(PinEmp)) {
            exit = true;
        }
           } while(!exit);

        do{
        int option = Options();
        switch (option) {
            case 1:
                System.out.println("\n one\t");
                break;
            case 2:
                System.out.println("\ntwo\t");
                break;
            case 3:
                System.out.println("\nthree\t");
                break;
            case 4:
                System.out.println("\nfour\t");
                break;
            case 5:
                System.out.println("\nfive\t");
                break;
            case 6:
                System.out.println("\nsix\t");
                break;
            case 7:
                System.out.println("\nGood Bye!\t");
                exit = true;
                break;
            default:
                System.out.println("Only numbers between 1 to 7 are the options available.");
        }
    } while(!exit);


    public static int Options() {
        System.out.println("----------  Options: ------------");
        System.out.println("\n1. Create new customer \t");
        System.out.println("2. Delete customer ");
        System.out.println("3. Manage transactions of the customer ");
        System.out.println("4. Generate customer lists ");
        System.out.println("5. Review the general portfolio of all customers ");
        System.out.println("6. Return to the general menu");
        System.out.println("7. Quit ");
        int OP = mp.nextInt();
        return OP;
    }

}

        /*private final String firstName;
        private final String lastName;
        private final String socialSecurityNumber;

        public BankEmployee(String firstName, String lastName, String socialSecurityNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
        }

        @Override
        public String toString() {

            return String.format("%s %s : %s",this.firstName, this.lastName, this.socialSecurityNumber);
        }

     */
}

