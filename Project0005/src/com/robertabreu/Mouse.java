package com.robertabreu;

/**
 * Created by robertabreu on 1/23/16.
 */
public class Mouse {
    private String brand;
    private String color;
    private int dpi;
    private int power;

    public Mouse(String brand, String color, int dpi) {
        this.brand = brand;
        this.color = color;
        this.dpi = dpi;
        this.power = 0;
    }

    public void increaseDpi(int dpi){
        int currentDpi = getDpi();
        if (currentDpi + dpi > 2000) {
            System.out.println("Cannot increase Dpi any further");
        }else {
            this.dpi = dpi + currentDpi;
            System.out.println("Dpi increased by " + dpi);
            System.out.println("Current dpi: " + getDpi());
        }
    }

    public void decreaseDpi(int dpi){
        int currentDpi = getDpi();
        if (currentDpi - dpi < 0) {
            System.out.println("Cannot decrease Dpi any further");
        }else {
            this.dpi = currentDpi - dpi;
            System.out.println("Dpi decreased by " + dpi);
            System.out.println("Current dpi: " + getDpi());
        }
    }

    public int getDpi() {
        return dpi;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
