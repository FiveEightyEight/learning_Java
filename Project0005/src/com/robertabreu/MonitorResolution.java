package com.robertabreu;

/**
 * Created by robertabreu on 1/23/16.
 */
public class MonitorResolution {
    private int x;
    private int y;

    public MonitorResolution(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void newResolution(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("New monitor resolution set to " + x + "x" + y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
