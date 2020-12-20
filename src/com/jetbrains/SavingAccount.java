//21520 Nathalie Flores
//21520@student.dorset-college.ie

package com.jetbrains;

public class SavingAccount extends Account {

    private double balance;


    public SavingsAccount(String account)
    {
        this.account = account;
        FileManager.createCustomerAccount(account, AppConstants.SAVING_ACCOUNT);
        balance = FileManager.total(account, AppConstants.SAVING_ACCOUNT );
    }



    public double getBalance() {
        return balance;
    }

    // method to set the balance
    public boolean setBalance(String type, double balance) {


        double newBalance = this.balance;

        if(type.equals("Lodge")) {
            newBalance += balance;
        } else {
            newBalance -= balance;
        }
        if(newBalance < 0) {
            return false;
        }

        this.balance = newBalance;

        return true;

    }


}
