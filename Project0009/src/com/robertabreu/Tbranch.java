package com.robertabreu;

import java.util.ArrayList;

/**
 * Created by robertabreu on 2/26/16.
 */
public class Tbranch {
    private String name;
    private ArrayList<Tcustomer> customer;

    public Tbranch(String name) {
        this.name = name;
        this.customer = new ArrayList<Tcustomer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Tcustomer> getCustomer() {
        return customer;
    }

    public boolean addCustomer(String name, double initialAmount){
        Tcustomer customer = findCustomer(name);

        if(customer == null){
            this.customer.add(new Tcustomer(name, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String name, double amount){
        Tcustomer customer = findCustomer(name);

        if(customer != null){
            customer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Tcustomer findCustomer(String name){
        for(int i = 0; i < this.customer.size(); i++){
            Tcustomer foundCustomer = this.customer.get(i);
            if(foundCustomer.getName().equals(name)){
                return foundCustomer;
            }
        }
        return null;
    }
}
