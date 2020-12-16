package com.jetbrains;
import java.util.Scanner;

public class Bank {

    //public static Scanner info = new Scanner(System.in);


    public Bank(){

        int userChoice;
        boolean exit = false;

        do {
            userChoice = MenuBuilder.MainMenu();

            switch (userChoice) {
                case 1:
                    System.out.println("\nPlease enter the following information requested. \t");
                    SecurityEmployee.reviewLoginEmployee();
                    MenuBuilder.EmployeeMenu();
                    break;
                case 2:
                    System.out.println("\nPlease enter the following information requested.\t");
                    Customer.AddCustomerForm();
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


}


