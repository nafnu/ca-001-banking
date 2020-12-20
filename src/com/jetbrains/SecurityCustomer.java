//21520 Nathalie Flores
//21520@student.dorset-college.ie


package com.jetbrains;
import static com.jetbrains.Customer.pin;

public class SecurityCustomer extends Security {


    public boolean getCredentials(String name, String surname, String accountNumber) {

        return false;
    }
    public boolean login(String pinNumber) {

        return false;
    }

    /* My procedure to review the pinCustomer

    public static boolean reviewLoginCustomer() {
        boolean exit = false;
        int switchCase;

        do {
            System.out.println("\n.....Analyzing info.......\n");

            if (pin==(Customer.getFirstPinCustomer())) {
                switchCase = 1;
            } else
                switchCase = 2;

            switch (switchCase) {

                case 1:
                    System.out.println("\nYour PIN number is correct \n");
                    exit = true;
                    break;
                case 2:
                    System.out.println("\nYour PIN number is Incorrect \t");
                    System.out.println("Please type your valid PIN number \t");
                    System.out.println("Return to MAIN MENU press * \t");
                    String cancelC = sc.next();
                    if ((cancelC.equals(cancel)) || (cancelC.equals(Customer.getPinCustomer()))){
                        MenuBuilder.MainMenu();
                        exit = true;
                    }else
                    exit = false;
                    break;
            }
        } while (!exit);

        return false;
    }

    @Override
    public boolean reviewLoginEmployee(String pinEmp) {
        return false;
    }

    @Override
    public boolean reviewLoginCustomer(String pinToReview) {
        return true;
    }*/
}








