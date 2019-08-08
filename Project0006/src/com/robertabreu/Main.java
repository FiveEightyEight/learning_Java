package com.robertabreu;

public class Main {

    public static void main(String[] args) {


        Hamburger order = new Hamburger("Sesame seed", false, false, true, true);
        HealthyBurger order2 = new HealthyBurger(true, true, true, true, true, true);
        DeluxeBurger order3 = new DeluxeBurger("Sesame seed");


        order.total();
        order2.total();
        order3.total();

        CustomBurger burger = new CustomBurger("Boogie", "Sesame seed", "Donkey", 3.50);

        System.out.println(burger.getName() + " Burger grand total $" + burger.itemizeBurger() + "\n");

        CustomBurger burger2 = new CustomBurger("Dick", "White", "Human", 4.00);

        burger2.addCondiment1("Rice", 0.75);
        burger2.addCondiment2("Seaman", 30.75);
        burger2.addCondiment3("Marijuana", 95.80);
        burger2.addCondiment4("Baby Tears", 0.50);



        HealthyCustomBurger burger3 = new HealthyCustomBurger("Dog", 5.00);

        burger3.addCondiment1("Red Peppers", .75);
        burger3.addCondiment2("Ketchup", .05);
        burger3.addCondiment3("Lettuce", .25);
        burger3.addCondiment4("Cheese", .75);
        burger3.addCondiment5("Onions", .30);
        burger3.addCondiment6("Jalapenos", .90);

        System.out.println(burger2.getName() + " Burger grand total $" + burger2.itemizeBurger() + "\n");

        System.out.println(burger3.getName() + " Burger grand total $" + burger3.itemizeBurger() + "\n");


        DeluxeCustomBurger dBurger = new DeluxeCustomBurger();

        dBurger.addCondiment3("window", 30.0);


        System.out.println(dBurger.getName() + " Burger grand total $" + dBurger.itemizeBurger() + "\n");






    }
}
