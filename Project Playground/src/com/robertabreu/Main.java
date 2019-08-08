package com.robertabreu;

public class Main {

    public static void main(String[] args) {
	// write your code here



//        System.out.print(factorial(4));
        String one = "jasmine";

        System.out.println(one.charAt(1));
        System.out.println(one.length());

        int theSum = sumOfNum(4);

        System.out.println("Number of vowels = " + vowels(one));

        System.out.print(theSum);


    }

//    static int factorial(int n) {
//
//
//        for(int i = n -1; i > 0; i--) {
//            n *= i;
//        }
//        return n;
//    }

    static int sumOfNum(int n){
        int x = n;
        for(int i = 0; i < n; i++){
            x += i;
        }
        return x;
    }

    static int vowels(String string){
        int vowels = 0;
        for(int i = 0; i <= string.length() - 1; i++){
            char letter= string.charAt(i);
                if(letter == 'a' || letter == 'o' || letter == 'i' || letter == 'e' || letter == 'u' ){
                    vowels += 1;
                }

        }
        return vowels;
    }


}
