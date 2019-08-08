package com.robertabreu;

/**
 * Created by robertabreu on 1/23/16.
 */
public class Honda extends Car {
    private String mModel;
    private String mTransmission;

    public Honda(String color, int doors, String model, String transmission) {
        super(color, 4, doors);
        this.mModel = model;
        this.mTransmission = transmission;
    }

    public String getModel(){
        return mModel;
    }

    public void setModel(String model) {
        this.mModel = model;
    }

    public void setTransmission(String transmission) {
        this.mTransmission = transmission;
    }

    public String getTransmission() {
        System.out.println("Vehicle is " + mTransmission);
        return mTransmission;
    }

    public void park() {
        if(super.getSpeed() > 0) {
            System.out.println("Warning: Vehicle is in motion.");
            System.out.println("Cannot shift to Park");
        } else {
            System.out.println(mModel + " is now in Park");
        }

    }

    public void shiftGear(){
        if(super.getSpeed() >= 0 && super.getSpeed() <= 10){
            super.setGears(1);
        } else if(super.getSpeed()> 10 && super.getSpeed() <= 20) {
            super.setGears(2);
        } else if(super.getSpeed() > 20 && super.getSpeed() <= 35) {
            super.setGears(3);
        } else if (super.getSpeed()> 35 && super.getSpeed() <= 55) {
            super.setGears(4);
        } else {
            super.setGears(5);
        }
    }



    public void stop() {
        decelerate(super.getSpeed());
        shiftGear();
        System.out.println(mModel + " has come to a complete stop");
    }

    public void drive(int speed) {
        if(super.getSpeed() > 0) {
            System.out.println("Warning: Vehicle is in motion.");
            System.out.println("Cannot shift to Drive");
        } else {
            System.out.println(mModel + " is now in Drive");
            super.forward();
            accelerate(speed);
            //System.out.println("Speed: " + speed + "\n");
        }
        shiftGear();
    }

    public void reverse(int speed) {
        if(super.getSpeed() > 0) {
            System.out.println("Warning: Vehicle is in motion.");
            System.out.println("Cannot shift to Reverse.");
        } else {
            super.setSpeed(speed);
            System.out.println(mModel + " is now in Reverse");
            super.backwards();
            //System.out.println("Speed: " + speed + "\n");
        }
        shiftGear();
    }

    public void accelerate(int speed) {
        if (super.getSpeed() + speed >= 141) {
            System.out.println("Cannot accelerate past 140 Mph");
        } else {
            System.out.println("Accelerating by " + speed);
            super.speed(speed);
        }
        shiftGear();
    }

    public void decelerate(int speed) {
        if (super.getSpeed() == 0) {
            System.out.println(mModel + " is currently stationary.");
        } else if(super.getSpeed() - speed < 0) {
            System.out.println("Cannot decelerate more than the current speed");
        } else {
            System.out.println("Decelerating by " + speed);
            int currentSpeed = super.getSpeed() - speed;
            super.setSpeed(currentSpeed);
        }
        shiftGear();

    }


}
