package com.jetbrains;
import java.util.Scanner;
import static com.jetbrains.Customer.pinToReview;



public abstract class Security {

    public static Scanner sc = new Scanner(System.in);  // Create a Scanner object

    public static String cancel = "*";


    public  abstract  boolean reviewLoginEmployee(String pinEmp);

    public abstract boolean reviewLoginCustomer(String pin);
}
