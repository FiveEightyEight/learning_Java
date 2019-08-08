package com.robertabreu;

/**
 * Created by robertabreu on 1/23/16.
 */
public class Monitor {
    private String brand;
    private String color;
    private MonitorResolution resolution;
    private int power;

    public Monitor(String brand, String color, MonitorResolution resolution) {
        this.brand = brand;
        this.color = color;
        this.resolution = resolution;
        this.power = 0;
    }

    public void monitorPowerOn(int x) {
            if(x == 1){
                this.power = x;
                System.out.println("Monitor powering on");
            } else {
                System.out.println("Monitor: Nothing happened");
            }
        }
    public void monitorPowerOff(int x){
        if(x == 0){
            this.power = x;
            System.out.println("Monitor shutting down");
        } else {
            System.out.println("Monitor: Nothing happened");
        }
    }


    public void newResolution(int x, int y) {
        resolution.newResolution(x, y);
    }
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public MonitorResolution getResolution() {
        return resolution;
    }

    public int getPower() {
        return power;
    }
}
