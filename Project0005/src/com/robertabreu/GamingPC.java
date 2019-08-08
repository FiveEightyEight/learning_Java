package com.robertabreu;

/**
 * Created by robertabreu on 1/23/16.
 */
public class GamingPC {
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private int power;

    public GamingPC(Mouse mouse, Keyboard keyboard, Monitor monitor) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.power =  0;
    }

    public void powerOn(int x){
        powerPcOn(x);
        monitor.monitorPowerOn(x);

    }

    public void powerOff(int x){
        powerPcOff(x);
        monitor.monitorPowerOff(x);
    }

    private void powerPcOn(int x){
        if(x == 1){
            this.power = x;
            System.out.println("PC powering on");
        } else {
            System.out.println("PC: Nothing happened");
        }
    }

    private void powerPcOff(int x){
        if(x == 0){
            this.power = x;
            System.out.println("PC shutting down");
        } else {
            System.out.println("PC: Nothing happened");
        }
    }

    public void adjMonitorRes(int x, int y){
        monitor.newResolution(x, y);
    }

    public void changeKeyLang(String lang) {
        keyboard.changeLang(lang);
    }

    public void changeKeyColor(String color) {
        keyboard.changeColor(color);
    }

    public void newResolution(int x, int y) {
        monitor.newResolution(x, y);
    }

    public void inceaseDpi(int dpi) {
        mouse.increaseDpi(dpi);
    }

    public void decreaseDpi(int dpi) {
        mouse.decreaseDpi(dpi);
    }

    private int getPower() {
        return power;
    }

}
