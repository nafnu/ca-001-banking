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
        System.out.println("Creating Transaction......");
    }



    public static void ListTransactionHistory() {

    }

    public static void Lodge() {

    }

    public static void Withdraw() {

    }


    public static void listCustomers() {

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
