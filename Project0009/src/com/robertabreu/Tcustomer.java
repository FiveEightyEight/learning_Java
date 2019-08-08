package com.robertabreu;

import java.util.ArrayList;

/**
 * Created by robertabreu on 2/26/16.
 */
public class Tcustomer {
    private String name;
    private ArrayList<Double> transaction;

    public Tcustomer(String name, double initialAmount) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double transaction){
        this.transaction.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}
