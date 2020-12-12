package com.jetbrains;

public abstract class SecurityCustomer extends Security implements loginCustomer {

    public static void reviewLoginCustomer() {
        boolean exit = false;
        int switchCase;

        do {
            System.out.println("\n.....Analyzing info.......\n");

            if (pinCompare.equals(pinSystem))
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






