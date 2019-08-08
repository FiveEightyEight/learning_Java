package com.robertabreu;

/**
 * Created by robertabreu on 1/26/16.
 */
public class HealthyBurger extends Hamburger {
    private boolean cucumber;
    private double addCucumber = 0.55;
    private boolean jalapenos;
    private double addJalapenos = 0.85;

    public HealthyBurger(boolean lettuce, boolean tomato, boolean cheese, boolean onion, boolean cucumber, boolean jalapenos) {
        super("Brown Rye", lettuce, tomato, cheese, onion);
        this.cucumber = cucumber;
        this.jalapenos = jalapenos;
    }

    public boolean isCucumber() {
        return cucumber;
    }

    public double getAddCucumber() {
        return addCucumber;
    }

    public boolean isJalapenos() {
        return jalapenos;
    }

    public double getAddJalapenos() {
        return addJalapenos;
    }

    public double total() {
        double hBurgerTotal = getBASE_BURGER_PRICE();
        System.out.println("Base burger price: $" + getBASE_BURGER_PRICE());
        if(isLettuce()) {
            hBurgerTotal += getAddLettuce();
            System.out.println("Added Lettuce: $" + getAddLettuce());
        }
        if(isTomato()) {
            hBurgerTotal += getAddTomato();
            System.out.println("Added Tomato: $" + getAddTomato());
        }
        if(isCheese()) {
            hBurgerTotal += getAddCheese();
            System.out.println("Added Cheese: $" + getAddCheese());
        }
        if(isOnion()) {
            hBurgerTotal += getAddOnion();
            System.out.println("Added Onion: $" + getAddOnion());
        }
        if(isCucumber()) {
            hBurgerTotal += getAddCucumber();
            System.out.println("Added Cucumber: $" + getAddCucumber());
        }
        if(isJalapenos()) {
            hBurgerTotal += getAddJalapenos();
            System.out.println("Added Jalapenos: $" + getAddJalapenos());
        }

        System.out.println(getBun() + " Healthy Hamburger total: $" + hBurgerTotal + "\n");
        return hBurgerTotal;
    }


}
