package com.robertabreu;

import java.util.ArrayList;

/**
 * Created by robertabreu on 2/9/16.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double firstTransaction) {
        this.name = name;
        this.transactions.add(firstTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }

    public static Customer newCustomer(String name, double firstTransaction){
        return new Customer(name, firstTransaction);
    }


}
