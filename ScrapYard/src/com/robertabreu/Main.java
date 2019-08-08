package com.robertabreu;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank robertAbreu = new Bank();

        VipCustomer robAbreu = new VipCustomer("Robert Abreu", "robert.abreu3@gmail.com");

        System.out.println(robAbreu.getName() + " has a credit lumit of: " + robAbreu.getCreditLimit());

        robertAbreu.bankAccount("1116", 500, "Robert Abreu", "robert.abreu3@gmail.com", "6102971465");

        boolean exit = false;
        byte choice;
        double amount;

        while(!exit) {
            System.out.println("Main Menu");
            System.out.println("\t1. Withdraw");
            System.out.println("\t2. Deposit");
            System.out.println("\tX. Exit");
            choice = input.nextByte();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter Amount To Withdraw");
                    amount = input.nextDouble();
                    input.nextLine();
                    withdraw(robertAbreu, amount);
                    break;
                case 2:
                    System.out.println("Enter Amount To Deposit");
                    amount = input.nextDouble();
                    input.nextLine();
                    deposit(robertAbreu, amount);
                    break;
                default:
                    System.out.println("Exiting");
                    exit = true;
                    break;
            }
        }
    }

    public static double withdraw(Bank accountName, double amount) {
        if (amount - accountName.getBalance() < 0) {
            System.out.println("Insufficient funds");
            return accountName.getBalance();
        }
//        if (amount > accountName.getBalance()){
//             System.out.println("Insufficient funds");
//            return accountName.getBalance();
//        } else if (amount <= 0){
//            System.out.println("Invalid entry");
//            return accountName.getBalance();
//        }
        System.out.println("Current Balance: " + accountName.getBalance());
        double nuBalance = accountName.getBalance() - amount;
        accountName.setBalance(nuBalance);
        System.out.println("New Balance: " + accountName.getBalance());
        return accountName.getBalance();
    }

    public static void deposit(Bank accountName, double amount){
        System.out.println("Current Balance: " + accountName.getBalance());
        accountName.setBalance(accountName.getBalance() + amount);
        System.out.println("New Balance: " + accountName.getBalance());
    }
}
/*
        int feet = 5;
        int inches = 76;
        double result = calFtAndIn2Cm(feet, inches);
        System.out.println(feet + "ft, " + inches + "in = " + result + " cm");

    }

    private static double calFtAndIn2Cm(int inches){
        if ((inches >= 0 && inches <= 11)){
            return calFtAndIn2Cm(0, inches);
        } else if (inches >= 12){
            int feet = inches / 12;
            inches %= 12;
            return calFtAndIn2Cm(feet, inches);
        }
        System.out.println("Invalid values entered");
        return -1;
    }

    private static double calFtAndIn2Cm(int feet, int inches){
        if ((feet >= 0) && (inches >= 0 && inches <= 12)){
            double convertToIn = (feet * 12) + inches;
            return convertToIn * 2.54;
        } else if (inches > 12 && feet >= 0) {
            inches += (feet * 12);
            return calFtAndIn2Cm(inches);
        }
        System.out.println("Invalid values entered");
            return -1;
    }


}
*/