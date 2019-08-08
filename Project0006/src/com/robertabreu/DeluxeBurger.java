package com.robertabreu;

/**
 * Created by robertabreu on 1/26/16.
 */
public class DeluxeBurger extends Hamburger {
    private boolean chips;
    private double addChips = 0.50;
    private boolean drink;
    private double addDrink = .95;

    public DeluxeBurger(String bun) {
        super(bun, false, false, false, false);
        this.drink = true;
        this.chips = true;
    }

    public boolean isChips() {
        return chips;
    }

    public double getAddChips() {
        return addChips;
    }

    public boolean isDrink() {
        return drink;
    }

    public double getAddDrink() {
        return addDrink;
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
        if(isChips()) {
            hBurgerTotal += getAddChips();
            System.out.println("Deluxe Chips: $" + getAddChips());
        }
        if(isDrink()) {
            hBurgerTotal += getAddDrink();
            System.out.println("Deluxe Drink: $" + getAddDrink());
        }

        System.out.println(getBun() + " Deluxe Hamburger total: $" + hBurgerTotal + "\n");
        return hBurgerTotal;
    }
}
