package com.jetbrains;
import java.util.Scanner;


public class Customer extends Bank{

    private static char ch1;
    private static char ch2;
    public static String name;
    public static String surname;

    public static void Pin() {

        Scanner kb = new Scanner(System.in);

        System.out.print("\nPlease enter the first name\t");
        name = kb.next().toLowerCase() + kb.nextLine();

        System.out.print("Please enter the last name\t");
        surname = kb.next().toLowerCase() + kb.nextLine();

        ch1 = name.charAt(0);
        ch2 = surname.charAt(0);

        int l1 = name.length();
        int l2 = surname.length();
        int l3 = l1 + l2;

        String orderInAlphabet = SurOdInAl(surname);
        String orderInAlphabet1 = NameOdInAl(name);

        System.out.println("\nThe account is:  " + ch1 + ch2 + "-" + l3 + "-" + orderInAlphabet1+ "-" + orderInAlphabet);

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

