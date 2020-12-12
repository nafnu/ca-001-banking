package com.jetbrains;
import java.util.Scanner;

public class BankEmployee extends Bank {

    public static Scanner infoE = new Scanner(System.in);
    public static String pinEmp;


    public BankEmployee (String _pin) {
            this.pinEmp = _pin;
    }

    public static BankEmployee AddEmployeeForm(){

        System.out.print("\nPIN for login as employee: \t");
        System.out.print("\n-Or type * to return to the main menu- \t");
        pinEmp = infoE.next();

        SecurityEmployee.reviewLoginEmployee();

        BankEmployee bankEmployee = new BankEmployee (pinEmp);

        // You might validate here..

        return bankEmployee;
    }

    public static String getPinEmp(){
        return pinEmp;
    }

}


