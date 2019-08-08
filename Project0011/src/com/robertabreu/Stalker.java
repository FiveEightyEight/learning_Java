package com.robertabreu;

/**
 * Created by robertabreu on 3/9/16.
 */
public class Stalker {
    private String name;
    private double health;
    private double damage;

    public Stalker(String name) {
        this.name = name;
    }

    public Stalker(String name, double health, double damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return this.name + "\nHealth: " + this.health + "\nDamage: " + this.damage;
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
