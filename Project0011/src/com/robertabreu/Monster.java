package com.robertabreu;

import java.util.ArrayList;

/**
 * Created by robertabreu on 3/9/16.
 */
public class Monster implements IPlayer {
    private String name;
    private double health;
    private double damage;

    public Monster(String name) {
        this.name = name;
    }

    public Monster(String name, double health, double damage) {
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

    private void setName(String name) {
        this.name = name;
    }

    private void setHealth(double health) {
        this.health = health;
    }

    private void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public ArrayList defaultStats(ArrayList monsters, int position) {
        ArrayList<Monster> defaultMonster = new ArrayList<Monster>();
        for(int i = 0; i < monsters.size(); i++){
            monsters.get(position);
        }

        return null;
    }

    @Override
    public ArrayList combatLog() {
        return null;
    }
}
