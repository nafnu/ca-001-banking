//21520 Nathalie Flores
//21520@student.dorset-college.ie



package com.jetbrains;
import java.util.Scanner;

import static com.jetbrains.AppConstants.*;


public class Bank {

    //public static Scanner info = new Scanner(System.in);


    public Bank() {

        int userChoice = MenuBuilder.MainMenu();
        boolean exit = false;

        do {

            switch (userChoice) {
                case EMPLOYEE:
                    String pin = BankEmployee.getPinEmp();
                    SecurityEmployee sb = new SecurityEmployee();
                    boolean isAuthenticated = sb.login(pin);

                    if (isAuthenticated) {

                        int bankEmployeeAction = MenuBuilder.EmployeeMenu();

                        switch (bankEmployeeAction) {
                            case CUSTOMER_CREATE:
                                Customer newCustomer = Customer.AddCustomerForm();
                                BankingAction.AddCustomer(newCustomer);
                                MenuBuilder.EmployeeMenu();
                                break;

                            case 2: break;

                            case TRANSACTION_CREATE:

                                int transactionChoice = MenuBuilder.transactionMenu();

                                switch (transactionChoice) {
                                    case TRANSACTION_LODGE:
                                        Transactions btl = createTransactionLodgeForm();
                                        BankingAction.CreateTransaction(btl);
                                        break;
                                    case TRANSACTION_WITHDRAW:
                                        Transactions btw = createTransactionWithdrawForm();
                                        BankingAction.CreateTransaction(btw);
                                        break;
                                    default:
                                        System.out.println("Transaction choice invalid");
                                }

                        } while (transactionChoice != 2);

                                break;
                            case CUSTOMER_LIST:
                                System.out.println("Listing customers");
                                FileManager.ListCustomers();
                                break; // AppConstants.CUSTOMER_LIST

                        }

                    } else {
                        System.out.println("Authentication error");
                        MenuBuilder.EmployeeMenu();
                        return;
                    }

                    break;
                case 2:
                    System.out.println("\nPlease enter the following information requested.\t");
                    Customer.AddCustomerForm();
                    MenuBuilder.CustomerMenu();
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

    private static Transactions createTransactionLodgeForm() {

        System.out.println("Transaction lodge form goes here");
        TransactionLodge btl = new TransactionLodge();
        return btl;

    }

    private static Transactions createTransactionWithdrawForm() {

        System.out.println("Transaction lodge form goes here");
        TransactionWithdraw btw = new TransactionWithdraw();
        return btw;

    }

}


