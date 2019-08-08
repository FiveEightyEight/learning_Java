package com.robertabreu;

/**
 * Created by robertabreu on 1/23/16.
 */
public class Keyboard {
    private String brand;
    private String color;
    private String language;
    private int power;

    public Keyboard(String brand, String color, String language) {
        this.brand = brand;
        this.color = color;
        this.language = language;
        this.power = 0;
    }

    public void changeLang(String lang) {
        this.language = lang;
        System.out.println("Keyboard language changed to: " + lang);
    }

    public void changeColor(String color) {
        this.color = color;
        System.out.println("Keyboard color changed to: " + color);
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getLanguage() {
        return language;
    }
}
