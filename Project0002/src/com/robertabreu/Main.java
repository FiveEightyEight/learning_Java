package com.robertabreu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int number = 10;
//        int checkEven = number / 2;
//        double checkRemainder = number % 2;
//
//        System.out.println("number = " + number + " | checkEven = " + checkEven + " | checkRemainder = " + checkRemainder);

//        boolean checkNumber = isEvenNumber(5);
//
//        if(checkNumber){
//            System.out.println("Number is even");
//        } else {
//            System.out.println("Number is odd");
//        }


        int number = 5;
        int finishNumber = 20;
        int evenNumberCounter = 1;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("\nEven number " + number);
            System.out.println(evenNumberCounter + " even number(s) found.");
            number++;
            evenNumberCounter++;
            if (evenNumberCounter == 6){
                break;
            }
        }
    }
// my method
//    public static boolean isEvenNumber(int eOo) {
//        int checkEven = eOo % 2;
//        if (checkEven == 0) {
//            return true;
//        } else{
//            return false;
//        }
//    }

    //solution
public static boolean isEvenNumber(int eOo) {
    if ((eOo %2) == 0) {
        return true;
    } else{
        return false;
    }
}


}
/*
// my method
        int counter = 0;

        switch (counter) {
            case 0:
                System.out.println("\nIs 4 a prime number?");
                System.out.println(isPrime(4));
                counter++;


            case 1:
                System.out.println("\nIs 87 a prime number?");
                System.out.println(isPrime(87));
                counter++;

            case 2:
                System.out.println("\nIs 93 a prime number?");
                System.out.println(isPrime(93));
                counter++;

            case 3:
                System.out.println("Reached max");
                break;
        }

// solution

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if(isPrime(i)){
                System.out.println("Number " + i + " is a prime number");
                count++;
            }
            if(count == 3) {
                System.out.print("Exiting ...");
                break;
            }
        }

    }






    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }





}
*/
/*
        for (int amount = 8; amount >= 2; amount--) {
            System.out.println("10,000 at " + amount + "% interest = "
                    + calculateInterest(10000.00, amount));
            System.out.println("amount = " + amount);
        }


    }


    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100.00));
    }

/*









        /* char switchValue = 'E';

        switch (switchValue){
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.println("Value was D");
                break;
            case 'E':
                System.out.println("Value was E");
                break;
            default:
                System.out.println("Value not found");
                break;
        }
        */



