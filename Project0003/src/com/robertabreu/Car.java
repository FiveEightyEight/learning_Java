package com.robertabreu;

/**
 * Created by robertabreu on 1/20/16.
 */
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("F150")) {
            this.model = model;
        }else {
            this.model = "Uknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}
