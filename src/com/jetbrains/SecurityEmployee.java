package com.jetbrains;

public class SecurityEmployee extends Security {

    public static boolean reviewLoginEmployee(){
        boolean exit = false;
        int switchCaseE;


        do{
            System.out.println("\n.....Analyzing info.......\n");

                if (BankEmployee.getPinEmp().equalsIgnoreCase("A1234")){
                    switchCaseE = 1;
                } else
                    switchCaseE = 2;

            switch (switchCaseE) {

                case 1:
                    System.out.println("\nYour Employee PIN is correct \n");
                    exit = true;
                    break;
                case 2:
                    System.out.println("\nYour Employee PIN number is Incorrect \t");
                    System.out.println("Please type again your valid PIN number \t");
                    System.out.println("OR for return to Main menu press * \t");
                    String cancelE = sc.next();
                    if ((cancelE.equals(cancel)) || (BankEmployee.getPinEmp().equalsIgnoreCase("A1234"))){
                        MenuBuilder.MainMenu();
                        exit = true;
                    }else
                    exit = false;
                    break;
            }

            } while(!exit);
        return false;
        }

    @Override
    public boolean reviewLoginEmployee(String pinEmp) {
        return true;
    }
}



