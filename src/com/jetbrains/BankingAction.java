//21520 Nathalie Flores
//21520@student.dorset-college.ie


package com.jetbrains;

public class BankingAction {

    public static void AddCustomer(Customer customer) {

        System.out.println("Creating " + customer.name);
        System.out.println("Creating " + customer.surname);
        // you can add in all the other parameters for a customer

        FileManager.AddCustomerToFile(customer);

        String savingsFile,  currentFile;
        savingsFile =  GenerateAccountName( customer) + ".savings.txt";
        currentFile = GenerateAccountName( customer) + ".current.txt";

        FileManager.CreateCustomerAccount(savingsFile);
        FileManager.CreateCustomerAccount(currentFile);
        //Then you write the customer details out to the file

    }

    public static String GenerateAccountName(Customer customer) {
        /// up to you to write the overall logic
        String fullName = customer.name + customer.surname;
        return customer.name + customer.surname+ "-" + fullName.length();
    }


    public static void CreateTransaction(Transactions transaction) {
        if (transaction.customer != null) {
            System.out.println(" value: " + transaction.amount + " account: " + transaction.customer.getAccount() + " type: " + transaction.typeTransaction + " ");

            FileManager.AddTransactionToFile(transaction);
        }
    }


    public static void ListTransactionHistory(String account2, int type)) {
        FileManager.listTransactions(account, type);
       }

    public static void Lodge() {

    }

    public static void Withdraw() {

    }


    public static void listCustomers() {
            FileManager.ListCustomers();
    }




    private static  void DeleteCustomer() {


    }

    private static Transactions CreateTransactionLodgeForm() {

        System.out.println("Transaction lodge form goes here");

        TransactionLodge btl = new TransactionLodge();

        return btl;
    }



    private static Transactions CreateTransactionWithdrawForm() {

        System.out.println("Transaction withdraw form goes here");

        TransactionWithdraw btl = new TransactionWithdraw();

        return btl;
    }
}
