package com.robertabreu;

import java.util.ArrayList;

/**
 * Created by robertabreu on 2/9/16.
 */

    // add a new branch
    // add a new customer to a branch with initial transaction
    // add transaction to a branch's customer
    // show a list of customers for a branch
public class Bank {
    private String name;
    private ArrayList<Branch> branch;

    public Bank(String name){
        this.name = name;
        this.branch = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    private int findBranch(Branch branch){
        return this.branch.indexOf(branch);
    }

    public boolean createBankBranch(String name){
        int position = branchExist(name);
        if(position >= 0){
            System.out.println("Branch already exists.");
            return false;
        }
        System.out.println("Creating Branch...");
        Branch nuBranch = Branch.createBranch(name);
        branch.add(nuBranch);
        System.out.println(nuBranch.getBranchName() + " added to " + getName());
     return true;
    }



    public int branchExist(String name){
        for(int i = 0; i < this.branch.size(); i++){
            Branch branch = this.branch.get(i);
            if(branch.getBranchName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Branch queryBranch(String name){
        int position = branchExist(name);
        if(position >= 0){
            Branch branch = this.branch.get(position);
            return branch;
        }
        return null;
    }

    public boolean addCustomer(Branch branch, String name, double transaction){
        if (branch.queryCustomer(name) == null){
            branch.addCustomerFromBank(name, transaction);
            return true;
        }
        else{
            System.out.println("Customer already exists in " + branch.getBranchName());
            return false;
        }
    }

    public boolean removeCustomer(Branch branch, String name){
        if (branch.queryCustomer(name) != null) {
            branch.removeCustomer(name);
            return  true;
        }
        else{
            System.out.println("Customer does not exist in " + branch.getBranchName());
            return false;
        }
    }

    public boolean addBankTransaction(Branch branch, String name, double transaction){
        Customer customer = branch.queryCustomer(name);
        if (customer != null){
            branch.transaction(customer, transaction);
            return true;
        }
        System.out.println("This customer does not exist in " + branch.getBranchName());
        return false;
    }

    public void branchCustomers(Branch branch){
        System.out.println("\n" + getName() + " Customers under the " + branch.getBranchName() + " branch.");
        branch.printBranch();
    }

    public void branchCustomersNameOnly(Branch branch){
        System.out.println("\n" + getName() + " Customers under the " + branch.getBranchName() + " branch.");
        branch.printBranchCustomers();
    }

    public void showAllCustomersAllBranches(){
        System.out.println("\n" + getName() + " Customers: ");
        for(int i = 0; i < this.branch.size(); i++){
            Branch branch = this.branch.get(i);
            System.out.println("Branch: " + branch.getBranchName());
            branch.printBranch();
        }
    }

    public boolean availableBranches(){
            return (branch.size() > 0);
    }


}