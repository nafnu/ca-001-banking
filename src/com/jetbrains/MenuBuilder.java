package com.jetbrains;
import java.util.Scanner;

public class MenuBuilder {

     public static int MainMenu() {        //StartMenu
        int selection;
        Scanner kb = new Scanner(System.in);
        System.out.println("\n+++++++    MAIN MENU    +++++++\t");
        System.out.println("\nPlease select and enter the number of one of these options: \t");
        System.out.println("Option 1: Bank Employee login\t");
        System.out.println("Option 2: Customer login\t");
        System.out.println("Option 3: Exit program\t");
        selection = kb.nextInt();
        return selection;
    }

    public int EmployeeMenu() {   //bankingMenu
        int selectionE;
        Scanner kbE = new Scanner(System.in);
        System.out.println("---------- Employees´ Options: ------------");
        System.out.println("\n1. Create new customer \t");
        System.out.println("2. Delete customer ");
        System.out.println("3. Generate customer lists ");
        System.out.println("4. Create new account");
        System.out.println("5. Delete new account");
        System.out.println("6. Return to the general menu");
        System.out.println("7. Quit ");
        selectionE = kbE.nextInt();
        return selectionE;
    }

       public int CustomerMenu() {
        int selectionC;
        Scanner kbC = new Scanner(System.in);
        System.out.println("---------- Customers´ Transactions: ------------");
        System.out.println("\n1 Lodge Money \t");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Balance current account "); //ReadAccount-FileService
        System.out.println("4. Return to the general menu");
        System.out.println("5. Quit ");
        selectionC = kbC.nextInt();
        return selectionC;
    }



}
