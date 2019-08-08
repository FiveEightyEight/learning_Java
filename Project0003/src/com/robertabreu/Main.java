package com.robertabreu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car porsche = new Car();
        Car ford = new Car();


        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        Account defaultAccount = new Account();
        Account accountFive = new Account("Robert Abreu", "1205-1988",
                "robert.abreu3@gmail.com", "(610) 297-1465", 1000.00);
        Account accountOne = new Account("Roy Abreu", "roy@gmail.com", "484-433-1437");

        VipCustomer accOne = new VipCustomer("Richard Abreu", 6000.00, "RichardA@ufcbank.com");
        VipCustomer accTwo = new VipCustomer("Roosevelt Abreu", "RooseveltA@ufcbank.com");
        VipCustomer accThree = new VipCustomer();


//        accountFive.setCustomerName("Robert Abreu");
//        accountFive.setAccountNumber("1205-1988");
//        accountFive.seteMail("robert.abreu3@gmail.com");
//        accountFive.setPhoneNumber("6102971465");
//        accountFive.setAccountBalance(1000.00d);

        accountFive.deposit(30d);
        accountFive.withdraw(600);
        accountFive.withdraw(300);
        accountFive.withdraw(100);
        accountFive.withdraw(30);
        System.out.println(accountFive.getCustomerName()+ " " + accountFive.getAccountBalance());

        System.out.println("\nAccount details: ");
        System.out.println("Name: " + accountFive.getCustomerName());
        System.out.println("Account Number: " + accountFive.getAccountNumber());
        System.out.println("Phone Number: " + accountFive.getPhoneNumber());
        System.out.println("Email: " + accountFive.geteMail());
        System.out.println("Account Balance: " + accountFive.getAccountBalance());

        System.out.println("\nAccount details: ");
        System.out.println("Name: " + defaultAccount.getCustomerName());
        System.out.println("Account Number: " + defaultAccount.getAccountNumber());
        System.out.println("Phone Number: " + defaultAccount.getPhoneNumber());
        System.out.println("Email: " + defaultAccount.geteMail());
        System.out.println("Account Balance: " + defaultAccount.getAccountBalance());

        System.out.println("\nAccount Number: " + accountOne.getAccountNumber());
        System.out.println("Account Balance: " + accountOne.getAccountBalance());

        System.out.println("\nAccount Email: " + accOne.getVipEmail());
        System.out.println("Account Credit Limit: " + accOne.getCreditLimit());

        System.out.println("\nAccount Email: " + accTwo.getVipEmail());
        System.out.println("Account Credit Limit: " + accTwo.getCreditLimit());

        System.out.println("\nAccount Email: " + accThree.getVipEmail());
        System.out.println("Account Credit Limit: " + accThree.getCreditLimit());

        System.out.print("\n What action would you like to take? ");
        String firstAction = input.nextLine();





    }



}
