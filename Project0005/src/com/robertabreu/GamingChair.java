package com.robertabreu;

/**
 * Created by robertabreu on 1/23/16.
 */
public class GamingChair {
    private String color;
    private ChairHeight height;

    public GamingChair(String color, ChairHeight height) {
        this.color = color;
        this.height = height;
    }

    public void adjustChair(int x, String chairHeight) {
        height.adjustChair(x, chairHeight);
    }

    public String getColor() {
        return color;
    }

    public ChairHeight getHeight() {
        return height;
    }
}
