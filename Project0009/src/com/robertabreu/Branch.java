package com.robertabreu;

import java.util.ArrayList;

/**
 * Created by robertabreu on 2/9/16.
 */
public class Branch {
    private String branchName;
    private ArrayList<Customer> customer;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customer = new ArrayList<Customer>();
    }

    // creates a branch
    public static Branch createBranch(String branchName){
        return new Branch(branchName);
    }

    public String getBranchName() {
        return branchName;
    }


    private int findCustomer(Customer customer) {
        return this.customer.indexOf(customer);
    }

    public void addCustomer(Customer customer) {
        int exists = findCustomer(customer);

        if (exists >= 0) {
            System.out.println("Customer already exists.");
        }
        this.customer.add(customer);
        System.out.println(customer.getName() + " added to " + getBranchName() +
                "\nWith the initial transaction of " + customer.getTransactions() + "\n");
    }

    public void addCustomerFromBank(String name, double transaction){
        Customer customer = queryCustomer(name);
        if( customer == null) {
            Customer nuCustomer = Customer.newCustomer(name, transaction);
            this.customer.add(nuCustomer);
            System.out.println(nuCustomer.getName() + " added to " + getBranchName() +
                    "\nWith the initial transaction of " + nuCustomer.getTransactions() + "\n");
        } else {
            System.out.println("Customer already exists.");
        }
    }

    public void removeCustomer(String name){
        int position = retrieveCustomer(name);
        if(position >= 0) {
            removeCustomer(position);
        }
        else {
            System.out.println("Unable to find customer");
        }

    }

    private void removeCustomer(int position){
        System.out.println("Removed " + customer.get(position).getName()
                + " from " + getBranchName() + "'s files.");
        this.customer.remove(position);
    }

    public void printBranch() {
        for (int i = 0; i < this.customer.size(); i++) {
            System.out.println("Position:" + i + "(" + (i+1) +") = " + this.customer.get(i).getName() +
                    " Transactions: " + this.customer.get(i).getTransactions()
                    + "\nTransaction History (Length): " + this.customer.get(i).getTransactions().size());
//            Customer currentCustomer = this.customer.get(i);
            double total = bankTotals(this.customer.get(i));
            System.out.println("Account total: " + total);
        }
    }

    public void printBranchCustomers(){
        for(int i = 0; i < this.customer.size(); i++){
            System.out.println((i+1)+": " + this.customer.get(i).getName());
        }
    }

    // Sums up the customer's bank account
    private double bankTotals(Customer customer){
        double total = 0.0;
        for(int i = 0; i < customer.getTransactions().size(); i++){
            total += customer.getTransactions().get(i);
        }
        return total;
    }

    private int retrieveCustomer(String name) {
        for (int i = 0; i < this.customer.size(); i++) {
            Customer customer = this.customer.get(i);
            if (customer.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Customer queryCustomer(String name) {
        int position = retrieveCustomer(name);
        if (position >= 0) {
            Customer customer = this.customer.get(position);
            return customer;
        }
        return null;
    }

    public void transaction(Customer customer, double transaction){
        int position = findCustomer(customer);
        if (position < 0){
            System.out.println("Something went wrong, could not find customer.");
        }
        this.customer.get(position).addTransaction(transaction);
        System.out.println("A transaction of " + transaction + " was added to "
                + this.customer.get(position).getName() + "'s bank account.");
    }

    // this will print out all the names of the customers in this branch
    public void customerNames(){
        for(int i = 0; i < this.customer.size(); i++){
            System.out.println((i+1) + ": " + this.customer.get(i).getName());
        }
    }


}

