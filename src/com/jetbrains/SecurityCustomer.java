package com.jetbrains;
import java.util.Scanner;

public abstract class SecurityCustomer extends Security implements loginCustomer {

    public static Scanner sc = new Scanner(System.in);  // Create a Scanner object

    public static String pinSystem = Customer.pinCode();
    public static String cancel = "*";
    public static String pinCompare;

    public static void reviewLoginCustomer() {
        boolean exit = false;
        int switchCase;

        do {
            System.out.println("\n.....Analyzing info.......\n");

            pinCompare = Customer.pinToReview;

            if (pinCompare.equals(pinSystem))
                switchCase = 1;
            else
                switchCase = 2;

            switch (switchCase) {

                case 1:
                    System.out.println("\nYour PIN number is correct \t");
                    System.out.println("\nPlease wait a moment to display customers´ menu \t");
                    exit = true;
                    break;
                case 2:
                    System.out.println("\nYour PIN number is Incorrect \t");
                    System.out.println("Please type your valid PIN number \t");
                    System.out.println("OR for return to Main menu press * \t");
                    String cancelCustomer = sc.next();
                    exit = (cancelCustomer.equals(cancel) || cancelCustomer.equals(pinSystem));
                    break;
            }


        } while (!exit);
    }
}

    interface loginCustomer{
        static void reviewLoginCustomer() {

        }
    }






