package com.jetbrains;
import java.util.Scanner;



public abstract class Security {

    public static Scanner sc = new Scanner(System.in);  // Create a Scanner object
    public static String cancel = "*";


    /*My interfaces with security
    public  abstract  boolean reviewLoginEmployee(String pinEmp);
    public abstract boolean reviewLoginCustomer(String pin);*/

    //Lecturer interfaces
    public abstract boolean login(String pinNumber);
}
