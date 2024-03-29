package com.robertabreu;

/**
 * Created by robertabreu on 3/2/17.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Uknown", 100.00, "uknown@uknown.com");
    }

    public VipCustomer(String name, String email){
        this(name, 500.00, email);

    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
