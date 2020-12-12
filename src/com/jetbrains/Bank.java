package com.jetbrains;

public class Bank {


    public Bank(){

        int userChoice;
        boolean exit = false;


        do {
            userChoice = MenuBuilder.MainMenu();

            switch (userChoice) {
                case 1:
                    System.out.println("\nPlease enter the PIN for login as an employee:\t");
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


