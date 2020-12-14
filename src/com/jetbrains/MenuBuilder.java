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

    public static int EmployeeMenu() {   //bankingMenu
        int selectionE;
        Scanner kbE = new Scanner(System.in);
        System.out.println("\n---------- Employees´ Options: ------------\t");
        System.out.println("\n1. Create new customer \t");
        System.out.println("2. Delete customer \t");
        System.out.println("3. Generate customer lists \t");
        System.out.println("4. Create new account \t");
        System.out.println("5. Delete new account \t");
        System.out.println("6. Return to the Main Menu \t");
        System.out.println("7. Quit \t");
        selectionE = kbE.nextInt();
        return selectionE;
    }

       public static int CustomerMenu() {
        int selectionC;
        Scanner kbC = new Scanner(System.in);
        System.out.println("\n---------- Customers´ Transactions: ------------ \t");
        System.out.println("\n1 Lodge Money \t");
        System.out.println("2. Withdraw Money \t");
        System.out.println("3. Balance current account \t"); //ReadAccount-FileService
        System.out.println("4. Return to the Main Menu \t");
        System.out.println("5. Quit \t");
        selectionC = kbC.nextInt();
        return selectionC;
    }



}
