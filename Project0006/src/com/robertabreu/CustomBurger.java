package com.robertabreu;

/**
 * Created by robertabreu on 1/26/16.
 */
public class CustomBurger {
    private String name;
    private String bun;
    private String meat;
    private double price;

    private String condiment1;
    private double condiment1Price;

    private String condiment2;
    private double condiment2Price;

    private String condiment3;
    private double condiment3Price;

    private String condiment4;
    private double condiment4Price;


    public CustomBurger(String name, String bun, String meat, double price) {
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.price = price;
    }

    public double addCondiment1(String condiment, double price){
        this.condiment1 = condiment;
        this.condiment1Price = price;
        return price;
    }

    public double addCondiment2(String condiment, double price){
        this.condiment2 = condiment;
        this.condiment2Price = price;
        return price;
    }

    public double addCondiment3(String condiment, double price){
        this.condiment3 = condiment;
        this.condiment3Price = price;
        return price;
    }

    public double addCondiment4(String condiment, double price){
        this.condiment4 = condiment;
        this.condiment4Price = price;
        return price;
    }

    public double itemizeBurger(){
        System.out.println(this.name + " Burger on " + this.bun +
                " with " + this.meat + " meat. Base price: $" + this.price);
        double burgerTotal = getPrice();
        if(condiment1 != null){
            System.out.println("Added " + condiment1 + ": $" + condiment1Price);
            burgerTotal += condiment1Price;
        }
        if(condiment2 != null){
            System.out.println("Added " + condiment2 + ": $" + condiment2Price);
            burgerTotal += condiment2Price;
        }
        if(condiment3 != null){
            System.out.println("Added " + condiment3 + ": $" + condiment3Price);
            burgerTotal += condiment3Price;
        }
        if(condiment4 != null){
            System.out.println("Added " + condiment4 + ": $" + condiment4Price);
            burgerTotal += condiment4Price;
        }
        return burgerTotal;
    }

    public String getName() {
        return name;
    }

    public String getBun() {
        return bun;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getCondiment1() {
        return condiment1;
    }

    public double getCondiment1Price() {
        return condiment1Price;
    }

    public String getCondiment2() {
        return condiment2;
    }

    public double getCondiment2Price() {
        return condiment2Price;
    }

    public String getCondiment3() {
        return condiment3;
    }

    public double getCondiment3Price() {
        return condiment3Price;
    }

    public String getCondiment4() {
        return condiment4;
    }

    public double getCondiment4Price() {
        return condiment4Price;
    }
}
