package com.robertabreu;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by robertabreu on 2/27/16.
 */
public class Demo {
    public static void main(String[] args) {


        LinkedList<String> placesToVisit = new LinkedList<String>();

//        placesToVisit.add("Boston");
//        placesToVisit.add("New York");
//        placesToVisit.add("Philadelphia");
//        placesToVisit.add("Baltimore");
//        placesToVisit.add("Washington D.C.");
//
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "New Haven");

        printList(placesToVisit);
        addInOrder(placesToVisit, "Boston");
        addInOrder(placesToVisit, "New York");
        addInOrder(placesToVisit, "Philadelphia");
        addInOrder(placesToVisit, "Baltimore");
        addInOrder(placesToVisit, "Washington D.C.");
        addInOrder(placesToVisit, "New Haven");
        addInOrder(placesToVisit, "Tampa");
        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
    /**
        for(int i = 0; i < linkedList.size(); i++){
        System.out.println((i+1)+ ": " + linkedList.get(i));
    }
     */
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Currently visiting " + i.next());
        }
        System.out.println("Done.");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> orderedList = linkedList.listIterator();

        while(orderedList.hasNext()){
            int comparison = orderedList.next().compareTo(newCity);

            if(comparison == 0){
                // City already exists
                System.out.println(newCity + " is already a destination.");
                return false;
            } else if (comparison > 0) {
                // newCity belongs ahead of current comparison.
                orderedList.previous();
                orderedList.add(newCity);
                return true;
            } else if (comparison < 0) {
                // continue checking
            }

        }
        orderedList.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();


        if(cities.isEmpty()){
        System.out.println("No Cities in list.");
            return;
        } else {
            System.out.println("Now Visiting: " + listIterator.next());
            printMenu();
        }

        while(!quit){
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice){

                case 0:
                    System.out.println("Leaving Vacation.");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                            goingForward = true;
                        }
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Moving to next destination: " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of our trip. No more destinations in list.");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward){
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                            goingForward = false;
                        }
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Moving to previous destination: " + listIterator.previous());
                    } else {
                        System.out.println("At the beginning of list.");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }


    private static void printMenu(){
        System.out.println("Visit Menu");
        System.out.println("\t\t0 - End Vacation.");
        System.out.println("\t\t1 - Move to next destination.");
        System.out.println("\t\t2 - Move to previous destination.");
        System.out.println("\t\t3 - Show Menu.");
    }











}
