package com.jetbrains;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BankEmployee extends Bank {

    public static Scanner infoE = new Scanner(System.in);
    public static String pinEmp;
    public static String nameEmp;



    public static String AddEmployeeForm(){

        System.out.print("\nType PIN for login as employee: \t");
        pinEmp = infoE.next();

         // You might validate here..
        SecurityEmployee.reviewLoginEmployee();

        return pinEmp;
    }

    public void setNameEmp(String nameEmp) {
        this.nameEmp = nameEmp;
    }

    public static String getNameEmp(){
        return nameEmp;
    }

    public void setPinEmp(String pinEmp) {
        this.pinEmp = pinEmp;
    }

    public static String getPinEmp(){
        return pinEmp;
    }


}


