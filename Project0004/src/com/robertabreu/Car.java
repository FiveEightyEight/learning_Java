package com.robertabreu;

/**
 * Created by robertabreu on 1/23/16.
 */
public class Car extends Vehicle {
    private int mWheels;
    private int mDoors;
    private int mGears;


    public Car(String color, int wheels, int doors) {
        super("Car", color, 1);
        this.mWheels = wheels;
        this.mDoors = doors;
        this.mGears = 0;

    }

    public void setWheels(int wheels) {
        this.mWheels = wheels;

    }

    public int getWheels(){
        return mWheels;
    }

    public void setmDoors(int doors) {
        this.mDoors = doors;
    }

    public int getDoors() {
        return mDoors;
    }

    public void setGears(int gears){
        this.mGears = gears;
    }

    public int getGears() {
        return mGears;
    }



    //Steering
    public void steerLeft() {
        super.steering();
        System.out.println("Steering left");
    }


    public void steerRight() {
        super.steering();
        System.out.println("Steering right");
    }





    public void forward() {
        super.move();
        System.out.println("Car is moving forward");

    }

    public void backwards() {
        super.move();
        System.out.println("Car is moving backwards");

    }





}
