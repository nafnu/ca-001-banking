package com.jetbrains;
import java.util.Scanner;


public class Customer extends Bank{

    public static String name;
    public static String surname;
    public static String accountToReview;
    public static String email;
    public static String pinToReview;
    public static char ch1;
    public static char ch2;
    public static Scanner info = new Scanner(System.in);


    public Customer() {
       this.name = name;
       this.surname = surname;
       this.email = email;
    }


    public static Customer AddCustomerForm() {


        System.out.print("\nPlease enter the first name\t");
        name = info.next().toLowerCase() + info.nextLine();

        System.out.print("Please enter the last name\t");
        surname = info.next().toLowerCase() + info.nextLine();

        System.out.print("Please enter your account number \t");
        accountToReview = info.next().toLowerCase() + info.nextLine();

        System.out.print("Please enter your PIN \t");
        pinToReview = info.next();

        ch1 = name.charAt(0);
        ch2 = surname.charAt(0);


        // You might validate here..
        SecurityCustomer.reviewLoginCustomer();


        Customer customer = new Customer ();
        // And if happy /// create the customer

        return customer;

    }
    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /*public String getAccountToReview() {
        return accountToReview;
    }

    public void setAccountToReview(Account accountToReview) {
        this.accountToReview = accountToReview;
    }*/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static String pinCode(){

        String orderInAlphabet1 = NameOdInAl(name);
        String orderInAlphabet = SurOdInAl(surname);

        return (orderInAlphabet1+orderInAlphabet);
    }


    public static int sumLength(){

        int l1 = name.length();
        int l2 = surname.length();

        return (l1 + l2);
    }


    public static String NameOdInAl(String m) {
        char [] orig =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String [] value =  {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26"};

        String od1 = new String(orig,0, 26);

        char od2 = name.charAt(0);

        for (int i =0; i < od1.length(); i++){
            if (orig[i]== od2)
                m = value[i];
        }
        return m;
    }

    public static String SurOdInAl(String n) {
        char [] orig =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String [] value =  {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26"};

        String od1 = new String(orig,0, 26);

        char od2 = surname.charAt(0);

        for (int i =0; i < od1.length(); i++){
            if (orig[i]== od2)
                n = value[i];
        }
        return n;
    }
}

