//21520 Nathalie Flores
//21520@student.dorset-college.ie


package com.jetbrains;
import java.util.Scanner;


public class Customer extends Bank {

    public static String name, surname, account, email, pin;
    public static char ch1, ch2;
    CurrentAccount	ca;
    SavingsAccount	sa;
    public static Scanner info = new Scanner(System.in);

    public Customer(String _name, String _surname, String _email) {
        name = _name;
        surname = _surname;
        email = _email;
        account = pinValidation(false);
        pin = pinValidation(true);

        ca = new CurrentAccount(account);
        sa = new SavingsAccount(account);

    }

    private String pinValidation(boolean _pin) {
        int iFirst = 1, iLast = 1;

        char[] letterArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.println();
        for (int i = 0; i < letterArray.length; i++) {
            if (Character.toLowerCase(name.charAt(0)) == letterArray[i]) {
                iFirst += i;
            }
            if (Character.toLowerCase(surname.charAt(0)) == letterArray[i]) {
                iLast += i;
            }

        }

        if (!_pin) {
            return String.format("%c%c-%s-%02d-%02d", Character.toLowerCase(name.charAt(0)), Character.toLowerCase(surname.charAt(0)),
                    (name.length() + surname.length()), iFirst, iLast);
        } else {
            return String.format("%02d%02d", iFirst, iLast);
        }

    }

    public static Customer AddCustomerForm() {


        System.out.print("\nPlease enter the first name\t");
        name = info.next().toLowerCase();

        System.out.print("Please enter the last name\t");
        surname = info.next().toLowerCase();

        System.out.print("Please enter your account number \t");
        account2 = info.next().toLowerCase() + info.nextLine();

        System.out.print("Please enter your email \t");
        email = info.next().toLowerCase() + info.nextLine();

        System.out.print("Please enter your PIN \t");
        pin = info.next();

        //SecurityCustomer.reviewLoginCustomer();

        Customer customer = new Customer(name, surname, email);
        FileManager.AddCustomerToFile(customer);
        // And if happy /// create the customer

        return customer;

    }


    public static int sumLength() {
        int l1 = name.length() + surname.length();
        return l1;
    }

    public static String getInitials() {
        String initialsName = String.valueOf(ch1);
        String initialsSurname = String.valueOf(ch2);
        return initialsName + initialsSurname;
    }

    public void setAccount(String _account) {
        account2 = _account;
    }
    public String getAccount() {
        return account2;
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(CurrentAccount _currentAccount) {
        currentAccount = _currentAccount;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount _savingsAccount) {
        savingsAccount = _savingsAccount;
    }


/* My own old procedure to ge the pin number. It is inefficient because I do duplicate operations for the first and last name.

    public static String NameOdInAl(String m) {
        char [] orig =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String [] value =  {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"};

        String od1 = new String(orig,0, 27);

        char od2 = name.charAt(0);

        for (int i =0; i < od1.length(); i++){
            if (orig[i]== od2)
                m = value[i];
        }
        return m;
    }

    public static String SurOdInAl(String n) {
        char [] orig =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String [] value =  {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26", "27"};

        String od1 = new String(orig,0, 27);

        char od2 = surname.charAt(0);

        for (int i =0; i < od1.length(); i++){
            if (orig[i]== od2)
                n = value[i];
        }
        return n;
    }

 */

}

