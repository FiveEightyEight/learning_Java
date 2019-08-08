package com.robertabreu;

/**
 * Created by robertabreu on 3/9/16.
 */
public class Swordsman {
    private String name;
    private double health;
    private double damage;

    public Swordsman(String name, double health, double damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }


    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getDamage() {
        return damage;
    }
}
