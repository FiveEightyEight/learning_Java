package com.robertabreu;
// valueOf boxing
// intValue/doubleValue unboxing

/*
BUGS:
When adding dup customers the system doesn't tell you that a dup exists

in the process of adding the remove customer function, check branch.java
 */

import java.util.Scanner;


public class Main {
    //    private static Branch branchOne = new Branch("ol' Bank");
    private static Bank bank = new Bank("Big Bank");
    private static Scanner input = new Scanner(System.in);
    private static char c = '\u00A9';

    public static void main(String[] args) {

        System.out.println("Bank Systems" + c + " v 1.0");
        boolean quit = false;
        int choice;
        printInstructions();

        while (!quit) {
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            switch (choice) {

                case 0:
                    printInstructions();
                    break;

                case 1:
                    addBranch();
                    break;

                case 2:
                    addCustomer();
                    break;

                case 3:
                    addTransaction();
                    break;

                case 4:
                    removeCustomer();
                    break;

                case 5:
                    branchCustomers();
                    break;

                case 6:
                    bank.showAllCustomersAllBranches();
                    break;

                case 7:
                    quit = true;
                    break;

            }
        }


    }

    public static void printInstructions() {
        System.out.println(bank.getName() + c + " Menu: ");
        System.out.println("\t\t0 - Print Menu.");
        System.out.println("\t\t1 - Add a branch.");
        System.out.println("\t\t2 - Add a customer.");
        System.out.println("\t\t3 - Add a transaction.");
        System.out.println("\t\t4 - Remove a customer.");
        System.out.println("\t\t5 - Show customers of select branch");
        System.out.println("\t\t6 - Show all customers of bank");
        System.out.println("\t\t7 - Quit.");
    }

    public static void addBranch() {
        System.out.print("Enter Name of Branch: ");
        input.nextLine();
        String branchName = input.nextLine();
        bank.createBankBranch(branchName);
    }

    public static void addCustomer() {
        if (bank.availableBranches()) {
            System.out.println("\nCustomers are divided into branches.");
            System.out.print("Enter Branch Name: ");
            input.nextLine();
            String branch = input.nextLine();
            if (bank.queryBranch(branch) != null) {
                System.out.println("Customer will be added to " + bank.queryBranch(branch).getBranchName());
                System.out.print("Enter Customer Name: ");
                String customerName = input.next();
                System.out.print("Enter Transaction Amount: ");
                double transaction = input.nextDouble();
                bank.addCustomer(bank.queryBranch(branch), customerName, transaction);
            } else {
                System.out.println(branch + " not found, try again");
                addCustomer();
            }
        } else {
            System.out.println("\nPlease create a branch first.");
            addBranch();
        }

    }

    public static void addTransaction() {
        if (bank.availableBranches()) {
            System.out.println("\nChoose the branch the customer is in.");
            System.out.print("Enter Branch Name: ");
            input.nextLine();
            String branch = input.nextLine();
            if (bank.queryBranch(branch) != null) {
                System.out.println("Customers in " + bank.queryBranch(branch).getBranchName() + " are now accessible: ");
                bank.queryBranch(branch).customerNames();
                System.out.print("Enter Customer Name: ");
                String customerName = input.next();
                System.out.print("Enter Transaction Amount: ");
                double transaction = input.nextDouble();
                bank.addBankTransaction(bank.queryBranch(branch), customerName, transaction);

            } else {
                System.out.println(branch + " not found, try again");
            }
        } else {
            System.out.println("Please create a branch first.");
            addBranch();
        }


    }

    public static void removeCustomer() {
        System.out.println("\nChoose the branch the customer is in.");
        System.out.print("Enter Branch Name: ");
        input.nextLine();
        String branch = input.nextLine();
        if (bank.queryBranch(branch) != null) {
            System.out.println("Customers in " + bank.queryBranch(branch).getBranchName() + " are now accessible: ");
            bank.queryBranch(branch).customerNames();
            System.out.println("\nWarning, this customer will be removed!");
            System.out.print("Enter Customer Name: ");
            String customerName = input.next();
            bank.removeCustomer(bank.queryBranch(branch), customerName);
        } else {
            System.out.println(branch + " not found, try again");
        }

    }

    public static void branchCustomers() {
        boolean run = false;
        int choice = 0;
        if (bank.availableBranches()) {
            System.out.println("\nSee All Customer's In a Branch.");
            System.out.print("Enter Branch Name: ");
            input.nextLine();
            String branchName = input.nextLine();
            if (bank.queryBranch(branchName) != null) {
                while (!run) {
                    System.out.println(bank.getName() + c + " Customer Info Menu: ");
                    System.out.println("\t\t0 - Show All Customers in " + branchName);
                    System.out.println("\t\t1 - Show All Customers and Transaction Information in " + branchName);
                    System.out.println("\t\t2 - Quit to Main Menu.");
                    System.out.print("Enter choice: ");
                    choice = input.nextInt();
                    switch (choice) {
                        case 0:
                            bank.branchCustomersNameOnly(bank.queryBranch(branchName));
                            run = true;
                            break;

                        case 1:
                            bank.branchCustomers(bank.queryBranch(branchName));
                            run = true;
                            break;

                        case 2:
                            run = true;
                            break;
                    }
                }
            } else {
                System.out.println(branchName + " not found, try again");
            }
        } else {
            System.out.println("Please create a branch first.");
            addBranch();
        }

    }


//    private static void conductTransaction(){
//        System.out.print("What customer would you like to add another transaction for? ");
//        input.nextLine();
//        String customerName= input.nextLine();
//        System.out.println("\nChecking files...");
//        Customer customer = branchOne.queryCustomer(customerName);
//        if(customer != null) {
//            System.out.println(customerName + " found!");
//            System.out.print("Enter transaction amount: ");
//            double nuTransaction = input.nextDouble();
//           branchOne.transaction(customer, nuTransaction);
//        }else {
//            System.out.println("Customer not found in branch" +
//            "\n");
//        }
//    }


}


//Trying to access customer information from branch .get(position).getName();
































































/*
        newMain.add(new MainInt(1));
        newMain.add(new MainInt(2));

        for (int i = 0; i < newMain.size(); i++){
//            int code = newMain.get(i).getInteger();
            System.out.println("newMain = " + newMain.get(i).getInteger());
        }

        ArrayList<Integer> intArray = new ArrayList<Integer>();

        for(int i = 0; i <=20; i++){
            intArray.add(Integer.valueOf(i * 3));
        }

        for(int i = 0; i< intArray.size(); i++){
            System.out.println("intArray Position: " + i +
                    " Value: " + intArray.get(i).intValue()

            );
        }

 */