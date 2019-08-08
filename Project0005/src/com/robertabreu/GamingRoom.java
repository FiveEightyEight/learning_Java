package com.robertabreu;

/**
 * Created by robertabreu on 1/23/16.
 */
public class GamingRoom {
    private GamingPC pc;
    private SmartBulb light;
    private GamingChair chair;

    public GamingRoom(GamingPC pc, SmartBulb light, GamingChair chair) {
        this.pc = pc;
        this.light = light;
        this.chair = chair;
    }

    public void powerOnAll(int x){
        pc.powerOn(x);
        light.bulbPowerOn(x);
    }

    public void powerOffAll(int x) {
        pc.powerOff(x);
        light.bulbPowerOff(x);
    }

    public void bulbSettings(String color){
        light.bulbColor(color);
    }

    public void monitorRes(int x, int y) {
        pc.newResolution(x, y);
    }

    public void adjustChair(int x, String position){
        chair.adjustChair(x, position);
    }

    public GamingPC getPc() {
        return pc;
    }

    public SmartBulb getLight() {
        return light;
    }

    public GamingChair getChair() {
        return chair;
    }
}
