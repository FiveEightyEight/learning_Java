package com.robertabreu;

/**
 * Created by robertabreu on 1/26/16.
 */
public class Hamburger {
    private String bun;
    private boolean lettuce;
    private double addLettuce = 0.50;
    private boolean tomato;
    private double addTomato = 0.75;
    private boolean cheese;
    private double addCheese = 1.25;
    private boolean onion;
    private double addOnion = 0.50;
    private static final double BASE_BURGER_PRICE = 3.00;
    private double burgerTotal;

    public Hamburger(String bun, boolean lettuce, boolean tomato, boolean cheese, boolean onion) {
        this.bun = bun;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.cheese = cheese;
        this.onion = onion;
    }

    public String getBun() {
        return bun;
    }

    public double getBurgerTotal() {
        return burgerTotal;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public double getAddLettuce() {
        return addLettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public double getAddTomato() {
        return addTomato;
    }

    public boolean isCheese() {
        return cheese;
    }

    public double getAddCheese() {
        return addCheese;
    }

    public boolean isOnion() {
        return onion;
    }

    public double getAddOnion() {
        return addOnion;
    }

    public double getBASE_BURGER_PRICE() {
        return BASE_BURGER_PRICE;
    }


public double total() {
    this.burgerTotal = getBASE_BURGER_PRICE();
    System.out.println("Base burger price: $" + getBASE_BURGER_PRICE());
    if(lettuce) {
        this.burgerTotal += addLettuce;
        System.out.println("Added Lettuce: $" + addLettuce);
    }
    if(tomato) {
        this.burgerTotal += addTomato;
        System.out.println("Added Tomato: $" + addTomato);
    }
    if(cheese) {
        this.burgerTotal += addCheese;
        System.out.println("Added Cheese: $" + addCheese);
    }
    if(onion) {
        this.burgerTotal += addOnion;
        System.out.println("Added Onion: $" + addOnion);
    }

    System.out.println(this.bun + " Hamburger total: $" + this.burgerTotal + "\n");
    return burgerTotal;
}


}
