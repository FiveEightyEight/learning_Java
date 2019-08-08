package com.robertabreu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        calFeetAndInToCent(3,5);
        calFeetAndInToCent(3 * 12 + 5);
    }



    public static double calFeetAndInToCent(double feet, double inches) {
        double centimeters = (feet * 12.0) * 2.54;
        centimeters += (inches * 2.54);
        System.out.println(feet + " & " + inches + " is equal to " + centimeters + " centimeters.");
        return centimeters;
    }

    public static double calFeetAndInToCent(double inches){
        double feet = (int) (inches / 12.0);
        double remainingInches = inches - (feet * 12.0);
        System.out.println("Total inches " + inches + ", remaining inches " + remainingInches
        + ". total feet " + feet + ".");
        calFeetAndInToCent(feet, remainingInches);
        return 0.0;
    }











}
        /*

        double inches = calFeetAndInToCent(5, 10);
        calFeetAndInToCent(inches);


    }


    public static double calFeetAndInToCent(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)){
            System.out.println(feet + " feet " + inches + " inches equals to a");
            double totalInches = inches + (feet * 12);
            System.out.println("total of " + totalInches + " inches.");
            return totalInches;
        } else
        {
            System.out.println("Error: Please check data entered.");
            return -1;
        }
    }

    public static double calFeetAndInToCent(double inches) {
        if (inches >= 0){
            double inchToCent = inches * 2.54;
            System.out.println(inches + " inches is = " + inchToCent
                    + " centimeters");
            return inchToCent;

        } else {
            System.out.println("Error: Inches is < 0");
            return -1;
        }
        */









        /*
        // Method overloading

        calculateScore("tim", 500);
        calculateScore(750);
        calculateScore();

    }




    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + ", score was " +score);
        return score * 1000;
    }



    public static int calculateScore(int score) {
        System.out.println("Unknown Player, score was " +score);
        return score * 1000;
    }


    public static int calculateScore(){
        System.out.println("No player, no score");
        return -1;
    }










}
*/

        /*
/*
        // int has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2137483647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " +myTotal);

        // byte has a width of 8
        byte myByteValue = 127;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64
        long myLongValue = 100L;

*/
/*

        byte byteOne = 8;

        short shortOne = 16;

        int intOne = 32;

        long longOne = 50000L + 10L * (byteOne + shortOne + intOne);

        System.out.println("longOne = " + longOne);
*/
/*
        int myIntValue = 5 / 3;
        float myFloatValue =  5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
*/
/*

        double poundToKilo = 0.45359237d;

        int pounds = 200;

        System.out.println("pounds = " + (pounds * poundToKilo));
*/
/*
        char myChar = '\u00Ae';
        char myChar2 = '\u00A9';
        boolean alwaysTrue = true;

    if (alwaysTrue) {

        System.out.println(myChar + " " + myChar2);
    }
*/
/*
        Object real = "word";

        String myString = (String) real;
        System.out.println(real);
*/
        /*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Birth Year (ex. 1992): ");
        short bYear = input.nextShort();

        if (bYear <= 1998) {
            System.out.println("Welcome " + name);


        } else {

            System.out.println("Sorry " + name + " you are too young to enter.");
            System.out.println("Birth year entered: " + bYear);
        }

        while (bYear <= 1910){
            System.out.println("YOU'RE OLD!!");
            bYear += 2;
        }
        */
      /*  double firstD = 20d;
        double secondD = 80d;
        double thirdD = (firstD + secondD) * 25d;
        double remainderD = thirdD % 2300d;

        if(remainderD <= 200) {
            System.out.println("Total was over the limit");
        }
    */

/*
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        //calculateScore(true, 10000, 8, 200);

        String playerName = "Robert";
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition(playerName, playerPosition);

        playerName = "Richard";
        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition(playerName, playerPosition);

        playerName = "Roy";
        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition(playerName, playerPosition);

        playerName = "Roosevelt";
        playerPosition = calculateHighScorePosition(5);
        displayHighScorePosition(playerName, playerPosition);
        */

/*
        int playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Robert", playerPosition);


        playerPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Richard", playerPosition);


        playerPosition = calculateHighScorePosition(100);
        displayHighScorePosition("Roy", playerPosition);


        playerPosition = calculateHighScorePosition(5);
        displayHighScorePosition("Roosevelt", playerPosition);



    }

    public static int calculateScore(boolean gameOver, int score,
                                      int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
       }





    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition
                + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        } else if ((playerScore >= 500) && (playerScore < 1000)) {
            return 2;
        } else if ((playerScore >= 100) && (playerScore< 500)) {
            return 3;
        } else {
            return 4;
        }
*/







