package com.robertabreu;

/**
 * Created by robertabreu on 1/26/16.
 */
public class DeluxeCustomBurger extends CustomBurger {


    public DeluxeCustomBurger() {
        super("Deluxe", "White", "Hamburger", 13);
        super.addCondiment1("Drink", 2);
        super.addCondiment2("Chips", .75);
    }



    @Override
    public double addCondiment1(String condiment, double price) {
        System.out.println("CANNOT ADD ADDITIONAL ITEM TO DELUXE BURGER");
        return -1;
    }

    @Override
    public double addCondiment2(String condiment, double price) {
        System.out.println("CANNOT ADD ADDITIONAL ITEM TO DELUXE BURGER");
        return -1;
    }

    @Override
    public double addCondiment3(String condiment, double price) {
        System.out.println("CANNOT ADD ADDITIONAL ITEM TO DELUXE BURGER");
        return 1;
    }

    @Override
    public double addCondiment4(String condiment, double price) {
        System.out.println("CANNOT ADD ADDITIONAL ITEM TO DELUXE BURGER");
        return -1;
    }
}