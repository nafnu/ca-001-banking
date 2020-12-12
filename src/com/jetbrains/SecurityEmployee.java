package com.jetbrains;

import static com.jetbrains.AppConstants.PinEmpConstant;


public abstract class SecurityEmployee extends Security implements loginEmployee {

    public static void reviewLoginEmployee(){
        boolean exit = false;
        int switchCaseE;

        do{
            System.out.println("\n.....Analyzing info.......\n");

                if (PinEmpConstant.equals(pinEmp)){
                    switchCaseE = 1;
                } else
                    switchCaseE = 2;

            switch (switchCaseE) {

                case 1:
                    System.out.println("\nYour Employee PIN is correct \n");
                    exit = true;
                    MenuBuilder.EmployeeMenu();
                    break;
                case 2:
                    System.out.println("\nYour Employee PIN number is Incorrect \t");
                    System.out.println("Please type your valid PIN number \t");
                    System.out.println("OR for return to Main menu press * \t");
                    String cancelE = sc.next();
                    exit = (cancelE.equals(cancel) || PinEmpConstant.equals(pinEmp));
                    break;
            }

            } while(!exit);
        }

    }

interface loginEmployee{
    static void reviewLoginEmployee() {

    }
}
