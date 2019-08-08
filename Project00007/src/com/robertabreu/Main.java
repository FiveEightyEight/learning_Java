package com.robertabreu;

class Car{
    public boolean engine;
    public int cylinders;
    public int wheels;
    public int doors;
    public boolean isManual;
    public String name;
    public int speed;

    public Car(int cylinders, int wheels, int doors, boolean isManual, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.name = name;
        this.speed = 0;
    }

    public String startEngine() {
        return "No vehicle to start";
    }

    public int accelerate(int gas){
        System.out.println("No car selected");
        return -1;
    }

    public int brake(int breakAmount){
        System.out.println("No car to break");
        return -1;
    }


    public boolean isEngine(){
        return this.engine;
    }

    public int getCylinders(){
        return this.cylinders;
    }
    public int getWheels(){
        return this.wheels;
    }

    public int getDoors(){
        return this.doors;
    }

    public boolean isManual(){
        return this.isManual;
    }

    public String getName(){
        return this.name;
    }

    public int getSpeed(){
        return this.speed;
    }

}

class Honda extends Car{

    public Honda(){
        super(4, 4, 4, false, "Civic");
    }
    public String startEngine() {
        return "Civic engine started";
    }

    public int accelerate(int gas){
        this.speed += gas;
        System.out.println("Civic is speeding up. Current speed: " + this.speed);
        return this.speed;
    }

    public int brake(int breakAmount){
        this.speed -= breakAmount;
        System.out.println("Civic is breaking. Current speed: " + this.speed);
        return this.speed;
    }

}


class Toyota extends Car{
    public Toyota(){
        super(4, 4, 2, true, "Corolla");
    }
    public String startEngine() {
        return "Corolla engine starting. Holding break.";
    }
    public int accelerate(int gas){
        this.speed += gas;
        System.out.println("Corolla is speeding up. Current speed: " + this.speed);
        return this.speed;
    }
    public int brake(int breakAmount){
        this.speed -= breakAmount;
        System.out.println("Corolla is breaking. Current speed: " + this.speed);
        return this.speed;
    }
}



class Ford extends Car{
    public Ford() {
        super(8, 6, 4, false, "F150");
    }

    public String startEngine() {
        return "F150 engine starting. Holding break. Truck bed fully loaded";
    }

    public int accelerate(int gas){
        this.speed += gas;
        System.out.println("F150 is speeding up. Current speed: " + this.speed);
        return this.speed;
    }
    public int brake(int breakAmount){
        this.speed -= breakAmount;
        System.out.println("F150 is breaking. Current speed: " + this.speed);
        return this.speed;
    }
}

class NoCar extends Car{
    public NoCar() {
        super(4, 4, 4, true, "Uknown");
    }
}



public class Main {

    public static void main(String[] args) {


        for(int i = 1; i < 6; i++){
            Car newCar = randomCar();

            System.out.println("\nTry #" + i + "\nCar selected: " + newCar.getName());
            System.out.println(newCar.startEngine());

            newCar.accelerate(50);
            newCar.brake(20);
        }




    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 4 ) +1;

        switch(randomNumber){
            case 1:
                System.out.println("Number generated: " + randomNumber);
                return new Honda();

            case 2:
                System.out.println("Number generated: " + randomNumber);
                return new Toyota();

            case 3:
                System.out.println("Number generated: " + randomNumber);
                return new Ford();

            case 4:
                System.out.println("Number generated: " + randomNumber);
                return new NoCar();
            default:
                System.out.println("Number generated: " + randomNumber);
        }
        return null;
    }
}














/*
class Movie {
    public String title;

    public Movie(String title) {
        this.title = title;
    }

    public String plot(){
        return "There is no plot";
    }


    public String getTitle(){
    return this.title;}
}



class Aliens extends Movie{

    public Aliens() {
        super("Aliens");
    }

    public String plot(){
        return "Aliens kill many humans";
    }

    public String trollPlot(){
        return "fucka u";
    }
}

class Predators extends Movie{

    public Predators() {
        super("Predators");
    }

    public String plot(){
        return "Predators hunt humans";
    }
}

class AliensVsPredators extends Movie{

    public AliensVsPredators(){
        super("Aliens Vs Predators");
    }

    public String plot(){
        return "Predators hunt Aliens";
    }
}

class StarWars extends Movie{

    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "The Empire gets owned";
    }
}

class Forgettable extends Movie{
    public Forgettable() {
        super("Forgettable");
    }


    // No plot method
}




public class Main {

    public static void main(String[] args) {

        Movie testMovie = new Aliens();
        System.out.println("the plot for " + testMovie.getTitle() + " is " + testMovie.plot() + "\n");

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getTitle() + "\n"
                    + "Plot: " + movie.plot() + "\n");
        }
    }



    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {

            case 1:
                return new Aliens();

            case 2:
                return new Predators();
            //break; is redundant
            case 3:                                          // because you are using return which stops the switch
                return new AliensVsPredators();

            case 4:
                return new StarWars();

            case 5:
                return new Forgettable();
//            default:              // THIS WORKS
//                return null;     //  AS WELL!!
        }
        return null;              // IF ABOVE EXAMPLE IS USED THIS 'return null;' is void
    }
}

*/








