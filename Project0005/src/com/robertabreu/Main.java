package com.robertabreu;

public class Main {


    public static void main(String[] args) {
	// write your code here
        GamingChair chair = new GamingChair("Black", new ChairHeight());
        SmartBulb smartBulb = new SmartBulb("Phillips", "Red");
        GamingPC pc = new GamingPC(new Mouse("Logitech", "Black", 0), new Keyboard("Logitech", "Black", "English"), new Monitor("Acer", "Black", new MonitorResolution(1920, 1080)));
        GamingRoom room = new GamingRoom(pc, smartBulb, chair);


        
        room.powerOnAll(1);
        room.bulbSettings("Red");
        room.adjustChair(5, "Up");
        room.powerOffAll(3);
        room.monitorRes(2780, 3980);
        room.powerOffAll(0);



    }
}

/*
Room: Gamming room
Gaming pc
    can be switched on and off
    has keyboard
    monitor
    mouse

gaming chair
    can move up and down
    has color

has a light:
    can be switched on and off
    can change color


 */