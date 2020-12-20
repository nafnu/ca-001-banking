//21520 Nathalie Flores
//21520@student.dorset-college.ie

package com.jetbrains;

public class TransactionLodge extends Transactions{

    public TransactionLodge(Customer c, double d, int _typeAccount)
    {
        customer = c;
        amount = d;
        typeAccount = _typeAccount;
        typeTransaction = "Lodge";
    }

}
