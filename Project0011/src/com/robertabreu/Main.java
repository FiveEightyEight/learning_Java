package com.robertabreu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List monsterCombatLog = new ArrayList<Monster>();

    public static void main(String[] args) {

        Monster hydra = new Monster("Hydra");

        List monsters = new ArrayList();

        monsters.add(hydra);



    }



    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.print("Choose\n" +
        "\t\t1 - to enter a string\n" +
        "\t\t0 - to quit");

        while(!quit){
            System.out.print("Choice: ");
            int choice = input.nextInt();

            switch (choice){

                case 0:
                    quit = true;
                    break;

                case 1:
                    System.out.print("Enter a String: ");
                    String stringInput = input.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }





}
