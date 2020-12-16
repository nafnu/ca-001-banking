package com.jetbrains;
import static com.jetbrains.Customer.pinToReview;

public class SecurityCustomer extends Security {


    public boolean login(String pinNumber) {
        return false;
    }

    public boolean getCredentials(String name, String surname, String accountNumber) {

        return false;
    }

    public static void reviewLoginCustomer() {
        boolean exit = false;
        int switchCase;

        do {
            System.out.println("\n.....Analyzing info.......\n");

            if (pinToReview.equals(Customer.pinCode()))
                switchCase = 1;
            else
                switchCase = 2;

            switch (switchCase) {

                case 1:
                    System.out.println("\nYour PIN number is correct \n");
                    exit = true;
                    MenuBuilder.CustomerMenu();
                    break;
                case 2:
                    System.out.println("\nYour PIN number is Incorrect \t");
                    System.out.println("Please type your valid PIN number \t");
                    System.out.println("Return to MAIN MENU PRESS * \t");
                    String cancelCustomer = sc.next();
                    if ((cancelCustomer.equals(cancel)) || (cancelCustomer.equals(Customer.pinCode()))){
                        MenuBuilder.MainMenu();
                        exit = true;
                    }else
                    exit = false;
                    break;
            }


        } while (!exit);
    }

    @Override
    public boolean reviewLoginEmployee(String pinEmp) {
        return false;
    }
}








