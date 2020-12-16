package com.jetbrains;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BankEmployee extends Bank {

    public static Scanner infoE = new Scanner(System.in);
    public static String pinEmp;


    public static String getPinEmp(){

        System.out.print("\nType PIN for login as employee: \t");
        pinEmp = infoE.next();

        return pinEmp;
    }



}


