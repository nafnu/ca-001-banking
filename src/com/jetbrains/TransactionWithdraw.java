//21520 Nathalie Flores
//21520@student.dorset-college.ie


package com.jetbrains;

public class TransactionWithdraw extends Transactions{


    public TransactionWithdraw(Customer c, double d, int _typeAccount)
    {
        customer = c;
        amount = d;
        typeAccount = _typeAccount;
        typeTransaction = "Withdraw";

    }
}
