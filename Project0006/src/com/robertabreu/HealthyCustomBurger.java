package com.robertabreu;

/**
 * Created by robertabreu on 1/26/16.
 */
public class HealthyCustomBurger extends CustomBurger {
    private String condiment5;
    private double condiment5Price;

    private String condiment6;
    private double condiment6Price;

    public HealthyCustomBurger(String meat, double price) {
        super("Healthy", "Rye", meat, price);
    }

    public String getCondiment5() {
        return condiment5;
    }

    public double getCondiment5Price() {
        return condiment5Price;
    }

    public String getCondiment6() {
        return condiment6;
    }

    public double getCondiment6Price() {
        return condiment6Price;
    }

    public double addCondiment5(String condiment, double price){
        this.condiment5 = condiment;
        this.condiment5Price = price;
        return price;
    }

    public double addCondiment6(String condiment, double price){
        this.condiment6 = condiment;
        this.condiment6Price = price;
        return price;
    }


    // MY METHOD
    /*
    public double itemizeBurger(){
        System.out.println(getName() + " Burger on " +getBun() +
                " with " + getMeat() + " meat. Base price: $" + getPrice());
        double basePrice = getPrice();
        if(getCondiment1() != null){
            System.out.println("Added " + getCondiment1() + ": $" + getCondiment1Price());
            basePrice += getCondiment1Price();
        }
        if(getCondiment2() != null){
            System.out.println("Added " + getCondiment2() + ": $" + getCondiment2Price());
            basePrice += getCondiment2Price();
        }
        if(getCondiment3() != null){
            System.out.println("Added " + getCondiment3() + ": $" + getCondiment3Price());
            basePrice += getCondiment3Price();
        }
        if(getCondiment4() != null){
            System.out.println("Added " + getCondiment4() + ": $" + getCondiment4Price());
            basePrice += getCondiment4Price();
        }
        if(getCondiment5() != null){
            System.out.println("Added " + getCondiment5() + ": $" + getCondiment5Price());
            basePrice += getCondiment5Price();
        }
        if(getCondiment6() != null){
            System.out.println("Added " + getCondiment6() + ": $" + getCondiment6Price());
            basePrice += getCondiment6Price();
        }
        System.out.println(getName() + " Burger grand total $" + basePrice + "\n");
        return basePrice;
    }
    */

    // BETTER METHOD


    @Override
    public double itemizeBurger() {
        double healthyTotal =  super.itemizeBurger();
        if(getCondiment5() != null){
            System.out.println("Added " + getCondiment5() + ": $" + getCondiment5Price());
            healthyTotal += getCondiment5Price();
        }
        if(getCondiment6() != null){
            System.out.println("Added " + getCondiment6() + ": $" + getCondiment6Price());
            healthyTotal += getCondiment6Price();
        }
        return healthyTotal;
    }

    // System.out.println(getName() + " Burger grand total $" + healthyTotal + "\n");
}
