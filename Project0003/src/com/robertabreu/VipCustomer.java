package com.robertabreu;

/**
 * Created by robertabreu on 1/21/16.
 */
public class VipCustomer {
    private String vipName;
    private double creditLimit;
    private String vipEmail;


    public VipCustomer(String name, double cLimit, String vEmail) {
        this.vipName = name;
        this.creditLimit = cLimit;
        this.vipEmail = vEmail;
    }

    public VipCustomer(String name, String vEmail) {
        this(name, 5000.00, vEmail);
    }

    public VipCustomer() {
        this("temp", 3000.00, "default@ufcbank.com");
    }



    public void setVipName(String name) {
        this.vipName = name;
    }

    public void setCreditLimit(double cLimit) {
        this.creditLimit = cLimit;
    }

    public void setVipEmail(String vEmail) {
        this.vipEmail = vEmail;
    }


    public String getVipEmail() {
        return vipEmail;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getVipName() {
        return vipName;
    }
}
