package com.robertabreu;

/**
 * Created by robertabreu on 1/23/16.
 */
public class ChairHeight {
    private int height;
    private String position;

    public ChairHeight() {
        this.height = 0;
        this.position = "Low";
    }

    public void adjustChair(int height, String position) {
        this.height = height;
        this.position = position;
        System.out.println("Chair adjusted to " + height + " height " + " at position: '"
                + position + "'.");
    }

    public int getHeight() {
        return height;
    }

    public String getPosition() {
        return position;
    }
}
