package com.robertabreu;

/**
 * Created by robertabreu on 1/23/16.
 */
public class SmartBulb {
    private String brand;
    private String color;
    private int power;

    public SmartBulb(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.power = 0;
    }


    public void bulbColor(String color){
        this.color = color;
        System.out.println("Lightbulb color changed to " + color);
    }

    public void bulbPowerOn(int x) {
        if(x == 1){
            this.power = x;
            System.out.println("Smart bulb powering on");
        } else {
            System.out.println("Smart bulb: Nothing happened");
        }
    }
    public void bulbPowerOff(int x){
        if(x == 0){
            this.power = x;
            System.out.println("Smart bulb shutting down");
        } else {
            System.out.println("Smart bulb: Nothing happened");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }
}
