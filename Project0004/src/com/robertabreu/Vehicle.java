package com.robertabreu;

/**
 * Created by robertabreu on 1/23/16.
 */
public class Vehicle {
    private String mType;
    private String mColor;
    private int mEngine;
    private int mSpeed;

    public Vehicle (String type, String color, int engine) {
        this.mType = type;
        this.mColor = color;
        this.mEngine = engine;
        this.mSpeed = 0;
    }

    public void setType(String type) {
        this.mType = type;
    }

    public String getType() {
        return mType;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        this.mColor = color;
    }

    public int getEngine() {
        return mEngine;
    }

    public void setmEngine(int engine) {
        this.mEngine = engine;
    }

    public void setSpeed(int speed) {
        this.mSpeed = speed;
    }

    public int getSpeed() {
        return mSpeed;
    }

    public void currentSpeed() {
        System.out.println("Current speed " + mSpeed);
    }

    public void speed(int speed) {
        int currentSpeed = getSpeed();
        speed += currentSpeed;
        setSpeed(speed);
    }

    public void move() {
        System.out.println("Vehicle is in motion");
    }


    public void steering() {
        System.out.println("Vehicle is steering");
    }

    public void turnOn() {
        System.out.println("Vehicle is now on");
    }

    public void turnOff() {
        System.out.println("Vehicle is now off");

    }
}
