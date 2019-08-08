package com.robertabreu;

/**
 * Created by robertabreu on 2/27/17.
 */
public class Bank {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void bankAccount(String accountNumber, double balance, String customerName, String customerEmail,String customerPhone){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail (String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone (String customerPhone) {
        this.customerPhone = customerPhone;
    }


    public double getBalance(){
        return this.balance;
    }
}
