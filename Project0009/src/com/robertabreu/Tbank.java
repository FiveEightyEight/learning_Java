package com.robertabreu;

import java.util.ArrayList;

/**
 * Created by robertabreu on 2/26/16.
 */
public class Tbank {
    private String name;
    private ArrayList<Tbranch> branch;

    public Tbank(String name) {
        this.name = name;
        this.branch = new ArrayList<Tbranch>();
    }

    public boolean addBranch(String branchName){
        Tbranch branch = findBranch(branchName);
        if(branch == null){
            this.branch.add(new Tbranch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Tbranch branch = findBranch(branchName);

        if(branch != null) {
            return branch.addCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double amount){
        Tbranch branch = findBranch(branchName);

        if(branch != null){
            return branch.addTransaction(customerName, amount);
        }
        return false;
    }

    private Tbranch findBranch(String branchName){
        for(int i = 0; i < this.branch.size(); i++){
            Tbranch branch = this.branch.get(i);
            if(branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomer(String branchName, boolean showTransaction){
        Tbranch branch = findBranch(branchName);

        if(branch != null){
            System.out.println("Customer Details for branch: " + branch.getName());
            ArrayList<Tcustomer> listCustomer = branch.getCustomer();
            for(int i = 0; i < listCustomer.size(); i++){
                Tcustomer currentCustomer = listCustomer.get(i);
                System.out.println("Customer [" + (i+1) + "]: " + currentCustomer.getName());
                if(showTransaction){
                    ArrayList<Double> listTransaction = currentCustomer.getTransaction();
                    for(int t = 0; t < listTransaction.size(); t++){
                        System.out.println("Transaction [" + (t+1) + "]: " + listTransaction.get(t));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }


}
