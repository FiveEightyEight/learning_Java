package com.robertabreu;

/**
 * Created by robertabreu on 1/21/16.
 */
public class Account {
    private String customerName;
    private String accountNumber;
    private String eMail;
    private String phoneNumber;
    private double accountBalance;

    public Account() {
        this("default", "00000001", "default@ufcbank.com", "0000000000", 200.00d);
    }


    public Account(String customerName, String accountNumber, String eMail,
                   String phoneNumber, double accountBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;

    }

    public Account(String customerName, String eMail, String phoneNumber) {
        this(customerName, "999999", eMail, phoneNumber, 250.00);
    }


    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setAccountNumber(String accNumber) {
        this.accountNumber = accNumber;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPhoneNumber(String phNumber) {
        this.phoneNumber = phNumber;
    }

    public void setAccountBalance(double accBalance) {
        this.accountBalance = accBalance;
        if (this.accountBalance == 0.0) {
            System.out.println("To avoid unwanted fees, please deposit money");
        }
    }




    public String getCustomerName() {
        return this.customerName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String geteMail() {
        return this.eMail;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public double deposit(double deposit) {
        this.accountBalance += deposit;
        System.out.println("\nDeposited " + deposit + " in account " + this.accountNumber);
        System.out.println("Current balance: " + this.accountBalance);
        return this.accountBalance;

    }


    public double withdraw(double withdraw){
        if (withdraw > accountBalance) {
        System.out.println("\nInsufficient funds!");
            System.out.println("Current balance: " + this.accountBalance);
            System.out.println("Amount trying to withdraw: " + withdraw);
        } else {
            this.accountBalance -= withdraw;
            System.out.println("\nWithdrew " + withdraw + ".");
            System.out.println("Current balance: " + this.accountBalance);
        } return this.accountBalance;
    }


}
// original code / pre-constructor

/*
    private String customerName;
    private String accountNumber;
    private String eMail;
    private String phoneNumber;
    private double accountBalance;



    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setAccountNumber(String accNumber) {
        this.accountNumber = accNumber;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPhoneNumber(String phNumber) {
        this.phoneNumber = phNumber;
    }

    public void setAccountBalance(double accBalance) {
        this.accountBalance = accBalance;
        if (this.accountBalance == 0.0) {
            System.out.println("To avoid unwanted fees, please deposit money");
        }
    }




    public String getCustomerName() {
        return this.customerName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String geteMail() {
        return this.eMail;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public double deposit(double deposit) {
        this.accountBalance += deposit;
        System.out.println("\nDeposited " + deposit + " in account " + this.accountNumber);
        System.out.println("Current balance: " + this.accountBalance);
        return this.accountBalance;

    }


    public double withdraw(double withdraw){
        if (withdraw > accountBalance) {
        System.out.println("\nInsufficient funds!");
            System.out.println("Current balance: " + this.accountBalance);
            System.out.println("Amount trying to withdraw: " + withdraw);
        } else {
            this.accountBalance -= withdraw;
            System.out.println("\nWithdrew " + withdraw + ".");
            System.out.println("Current balance: " + this.accountBalance);
        } return this.accountBalance;
    }


}
 */