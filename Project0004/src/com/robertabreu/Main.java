package com.robertabreu;




public class Main extends Object{

    public static void main(String[] args) {

        Dog bella = new Dog("Woofie", 10, 30, 2, 4, 1, 20,"Long curly");
        Honda civic = new Honda("Grey", 4, "Civic LX", "Automatic");

        civic.getType();
        System.out.println(civic.getModel() + " is a " + civic.getType());
        civic.turnOn();
        civic.reverse(2);
        System.out.println("Current gear: " + civic.getGears());
        civic.steerRight();
        civic.stop();

        civic.steerLeft();
        civic.drive(5);
        civic.steerRight();
        civic.currentSpeed();

        civic.accelerate(20);
        civic.currentSpeed();
        System.out.println("Current gear: " + civic.getGears());

        civic.accelerate(100);
        civic.currentSpeed();
        System.out.println("Current gear: " + civic.getGears());

        civic.decelerate(70);
        civic.currentSpeed();
        System.out.println("Current gear: " + civic.getGears());

        civic.reverse(10);

        civic.currentSpeed();
        civic.stop();
        civic.park();
        System.out.println("Current gear: " + civic.getGears());




    }
}
