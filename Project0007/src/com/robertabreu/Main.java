package com.robertabreu;


/*
import java.util.ArrayList;
import java.util.Arrays;
*/
import java.util.Scanner;


public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);



    }
}
    /*
    private static Scanner input = new Scanner(System.in);
    private static GroceryList myList = new GroceryList();

    public static void main(String[] arg){
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){

                case 0:
                    printInstructions();
                    break;

                case 1:
                    myList.printGroceryList();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    modifyItem();
                    break;

                case 4:
                    removeItem();
                    break;

                case 5:
                    searchForItem();
                    break;

                case 6:
                    timesWay();
                    break;

                case 7:
                    processArrayList();
                    break;

                case 8:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To search using Tim's method");
        System.out.println("\t 7 - ");
        System.out.println("\t 8 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        myList.addGroceryItem(input.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item to be replaced: ");
        String itemNo = input.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = input.nextLine();
        myList.modifyGroceryList(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = input.nextLine();
        myList.removeGroceryList(itemNo);
    }

    public static void searchForItem() {
        System.out.print("Enter item you are searching for: ");
        String item = input.nextLine();
        if(myList.findItem2(item) != null){
            System.out.println("Found " + item + " in our grocery list.");
        } else
            System.out.println(item + " not found in our grocery list.");
    }

    public static void timesWay(){
        System.out.print("Enter item you are searching for: ");
        String item = input.nextLine();
        if(myList.onFile(item)){
            System.out.println("Found " + item + " in our grocery list.");
        } else
            System.out.println(item + " not found in our grocery list.");
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(myList.getGroceryList());

        //  OR  //

        ArrayList<String> nextArray = new ArrayList<String>(myList.getGroceryList()); // if you already know the array you would like to copy

        // If you want to convert an ArrayList into a regular array
        String[] myArray = new String[myList.getGroceryList().size()];
        myArray = myList.getGroceryList().toArray(myArray);
    }
}
    /*
    public static void searchForItem() {
        System.out.print("Enter item you are searching for: ");
        String item = input.nextLine();
        if(myList.findItem(item) != null){
            System.out.println("Found " + item + " in our grocery list.");
        } else
            System.out.println(item + " not found in our grocery list.");
    }
    */















        // Arrays and Sorting
        /*
        System.out.println("Enter Array Length");
        int arrayLength = input.nextInt();

        int[] mainIntArray = getIntIntegers(arrayLength);
        printIntArray(mainIntArray);
        System.out.print("Would you like to sort?\n " +
                "Y / N: ");
        String charEntered = input.next();
        if(charEntered.equalsIgnoreCase("y")){
            mainIntArray = sortIntArray(mainIntArray);
            printIntArray(mainIntArray);
        } else {
            System.out.println("User entered: "+ "'" + charEntered + "'. System will not sort.");
        }

        System.out.println("Continue with decimal array? ");
        charEntered = input.next();
        if(charEntered.equalsIgnoreCase("y")) {
            System.out.println("Enter Decimal Array Length");
            arrayLength = input.nextInt();


            double[] mainArray = getIntegers(arrayLength);
            for (int i = 0; i < mainArray.length; i++) {
                System.out.println("Position " + i + " = " + mainArray[i]);
            }


            mainArray = sortIntegers(mainArray);
            System.out.println("\nSorting: ");
            printArray(mainArray);
        } else {
            System.out.println("Ending");
        }




    }

    public static int[] getIntIntegers(int arrayLength) {
        int[] newArray = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " digits.");
        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = input.nextInt();
        }
        return newArray;
    }

    public static void printIntArray(int[] array){
        System.out.println("Array length: " + array.length);
        for(int i = 0; i < array.length; i ++){
            System.out.println("Element: " + i + " is " + array[i]);
        }
    }

    public static int[] sortIntArray(int[] array) {
        int[]sIntArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nSorting... ");
        while (flag){
            flag = false;
            for(int i = 0; i < sIntArray.length-1; i++){
                if(sIntArray[i] < sIntArray[i+1]){
                    temp = sIntArray[i];
                    sIntArray[i] = sIntArray[i+1];
                    sIntArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sIntArray;
    }
















    public static double[] getIntegers(int arrayLength) {
        double[] theArray = new double[arrayLength];
        System.out.println("Enter " + theArray.length + " desired numbers \r");
        for (int i = 0; i < theArray.length; i++) {
            theArray[i] = input.nextInt();
        }
        return theArray;
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Position " + i + " = " + array[i]);
        }
    }

//    //my broken method
//    public static double[] sortIntegers(double[] array) {
//        double[] tempArray = array;
//        for (int i = 0; i < tempArray.length; i++)
//            for (int y = tempArray.length; y > 0; y--)
//                if (tempArray[i] < tempArray[y]) {
//                    double tempValue = tempArray[y];
//                    tempArray[y] = tempArray[i];
//                    tempArray[i] = tempValue;
//                }
//        return array;
//    }


    // tim's method / I tried to chime in halfway
//    public static double[] sortIntegers(double[] array) {
//        double[] sortedArray = new double[array.length];
//        int countDown = array.length;
//        for(int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }for(int y = 0; y < array.length; y++){
//            if(array[y] < sortedArray[countDown]){
//                double tempValue = sortedArray[countDown];
//                sortedArray[countDown] = array[y];
//                array[y] = tempValue;
//            }
//        }
//        return sortedArray;
//    }

    // tim's actual method
    public static double[] sortIntegers(double[] array) {
//        double[] sortedArray = new double[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        double[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        double temp;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nSorting... ");
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length-1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}



















        System.out.print("Enter Array Length: ");
        int arrayLength = input.nextInt();
        double[] newArray = getNumbers(arrayLength);

        System.out.println("Average is equal to = " + getAverage(newArray));
    }

    public static double[] getNumbers(int numbers){
        System.out.println("Please enter " + numbers + " numbers. \r");
        double[] valuesEntered = new double[numbers];

        for(int i = 0; i < valuesEntered.length; i++) {
            valuesEntered[i] = input.nextInt();
        }
        return valuesEntered;
    }

    public static double getAverage(double[] array) {
        double total = 0;
        for(int i = 0; i < array.length; i++){
            total += array[i];
        } System.out.println("Array total: " + total + " dived by length of array: " + array.length);
        return total / array.length;
    }


}
*/

/*
        double centimeters = calcFeetAndInchesToCentimeters(3, 0);
        if(centimeters >= 0) {
            System.out.println("Centimeters = " + centimeters);
        }

        centimeters = calcFeetAndInchesToCentimeters(156);
        if(centimeters >= 0) {
            System.out.println("Centimeters = " + centimeters);
        }


    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double centimeters = 0;
        if((feet >= 0) && (inches >= 0) && (inches < 12)){
            return  centimeters = (inches + (feet * 12)) * 2.54;
        } else if ((inches < 0) || (inches >= 12)) {
            System.out.println("Invalid entry: inches.");
            return -1;
        } else {
            System.out.println("Invalid entry: feet.");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = (int) inches / 12;
            inches %= (int) inches / 12;
            System.out.println(feet + " feet, " + inches + " inches" );
           return calcFeetAndInchesToCentimeters(feet, inches);
        }
        else
        System.out.println("Invalid entry for inches.");
            return -1;
    }
 */