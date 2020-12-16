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

    public static void DeleteCustomer() {

    }

    public static void CreateTransaction(Transactions transaction) {
        System.out.println("Creating Transaction......");
    }

    public static void ListCustomers() {

    }

    public static void ListTransactionHistory() {

    }

    public static void Lodge() {

    }

    public static void Withdraw() {

    }
}
