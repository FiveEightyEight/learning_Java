package com.robertabreu;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static Contacts contacts = new Contacts();
    private static MobilePhone mobilePhone = new MobilePhone("LG G4", "610 297 1465");

    public static void main(String[] args) {
        char smiley = '\u263A';
        boolean quit = false;
        boolean restart = false;
        int choice;
        showInstructions();

        while(!quit) {
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            switch (choice) {

                case 0:
                    System.out.println("Exiting...");
                    System.out.println("Goodbye. " + smiley);
                    quit = true;
                    break;

                case 1:
                    contacts.printContacts();
                    break;

                case 2:
                    addContact();
                    break;

                case 3:
                    modifyContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    findContact();
                    break;

                case 6:
                    showInstructions();
                    break;

            }
        }

        //
        // **** LECTURE SOLUTION:                    ****
        //
        quit = false;
        restart = true;
        startPhone();
        printPhoneActions();



    while (!quit) {
//            printPhoneActions();
        System.out.print("Enter choice: ");
        choice = input.nextInt();
        switch (choice) {

            case 0:
                printPhoneActions();
                break;

            case 1:
                mobilePhone.printContacts();
                break;

            case 2:
                addPhoneContact();
                break;

            case 3:
                modifyPhoneContact();
                break;

            case 4:
                removePhoneContact();
                break;

            case 5:
                queryPhoneContact();
                break;

            case 6:
                quit = true;
                break;

            case 7:
                System.out.println("\nExiting...");
                quit = true;
                break;
        }

    }




            System.out.println("Goodbye. " + smiley +
            "\nStay on the lookout for update .1!" +
                    "\nFeaturing extended modification options.");





    }

    private static void showInstructions(){
        System.out.println("\nChoices: ");
        System.out.println("\t\t 0 - Quit.");
        System.out.println("\t\t 1 - Print list of contacts.");
        System.out.println("\t\t 2 - Add contact.");
        System.out.println("\t\t 3 - Modify contact.");
        System.out.println("\t\t 4 - Remove contact.");
        System.out.println("\t\t 5 - Find contact.");
        System.out.println("\t\t 6 - Show options.");
    }


    private static void addContact(){
        System.out.print("\nEnter new contact name: ");
        input.nextLine();
        String contactName = input.nextLine();
        System.out.print("Enter contact phone number: ");
        String cNumber = input.nextLine();
        contacts.addContact(contactName, cNumber);
    }

    private static void modifyContact(){
        System.out.print("\nEnter name of contact you would like to modify (CaSe Sensitive): ");
        input.nextLine();
        String contactName = input.nextLine();
        if(contacts.doesContactExist(contactName)){
            System.out.println("\nCurrent information:");
            contacts.getNameNumber(contactName);
            int choice;
            String nName;
            String nNumber;

            System.out.println("\nWhat would you like to change?");
            System.out.println("\t\t 0 - Exit.");
            System.out.println("\t\t 1 - Number.");
            System.out.println("\t\t 2 - Name.");
            System.out.println("\t\t 3 - Name & Number.");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice){

                case 0:
                    System.out.println("No changes made.");
                    break;

                case 1:
                    System.out.print("Enter new number: ");
                    input.nextLine();
                    nNumber = input.nextLine();
                    contacts.modifyContactNumber(contactName, nNumber);

                    break;

                case 2:
                    System.out.print("Enter name change: ");
                    input.nextLine();
                    nName = input.nextLine();
                    contacts.modifyContactName(contactName, nName);

                    break;

                case 3:
                    System.out.print("Enter name change: ");
                    input.nextLine();
                    nName = input.nextLine();
                    System.out.print("Enter new number: ");
                    nNumber = input.nextLine();
                    contacts.modifyBoth(contactName, nName, nNumber);

                    break;
            }
        }else {
            System.out.println("\nError: Contact does not exist!");
        }
    }

    private static void removeContact(){
        System.out.println("\nEnter the name of the contact you would like to remove.");
        System.out.println("NOTE: This will also delete the contact number.");
        System.out.print("Contact Name (CaSe Sensitive): ");
        input.nextLine();
        String contactName = input.nextLine();
        if(contacts.doesContactExist(contactName)){
            contacts.removeContact(contactName);
        } else {
            System.out.println("\nContact does not exist.");
            System.out.println("Make sure you have the correct spelling");
        }

    }

    private static void findContact(){
        System.out.println("\n\tFind Contact\n");
        System.out.print("Enter Name (CaSe Sensitive): ");
        input.nextLine();
        String contactName = input.nextLine();
        if(contacts.doesContactExist(contactName)){
            contacts.getNameNumber(contactName);
        } else {
            System.out.println("\nError: Contact does not exist!");
        }
    }



    //
    // **** LECTURE SOLUTION:                    ****
    //



    private static void startPhone(){
        System.out.println("\nBooting up....");
        System.out.println("Java Phone Version .09");
        System.out.println("Now with more mocha.");
    }
    private static void printPhoneActions(){
        System.out.print("\nAvailable Options\n\nType: ");
        System.out.println("\n\t 0 - Menu" +
                           "\n\t 1 - Print Contacts" +
                           "\n\t 2 - Add New Contact" +
                           "\n\t 3 - Modify Contact" +
                           "\n\t 4 - Remove Existing Contact" +
                           "\n\t 5 - Query Contact" +
                           "\n\t 6 - Restart" +
                           "\n\t 7 - Shutdown"
        );
//        System.out.print("Your choice: ");

    }

    private static void addPhoneContact(){
        System.out.println("\n\tAdding Contact\n");
        System.out.print("Enter Contact's Name: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.print("Enter Contact's Number: ");
        String number = input.nextLine();
        if(mobilePhone.addNewContact(Contact.createContact(name, number))){
            System.out.println("Success!");
        }
        /**
         * Tim's method:
         * Contact newContact = Contact.createContact(name, number);
         * if(mobilePhone.addNewContact(newContact){
         * System.out.println("New Contact, " + name + ", Added" + ". Phone = " + number);
         * } else{
         * System.out.println("Cannot add, " + name + " to the contact list.");
         * }
         */

    }

    private static void modifyPhoneContact(){
        System.out.println("\n\tModify Contact\n");
        System.out.print("Enter Name: ");
        input.nextLine();
        String name = input.nextLine();
        if(mobilePhone.queryContact(name) != null) {
        System.out.println("Contact found!");
            System.out.print("Enter updated contact name: ");
            String nuName = input.nextLine();
            System.out.print("Enter updated contact number: ");
            String nuNumber = input.nextLine();
            Contact nuContact = Contact.createContact(nuName, nuNumber);
            if (mobilePhone.updateContact(mobilePhone.queryContact(name), nuContact)) {
                System.out.println("Modification Successful!");
            } else {
                System.out.println("Please Check Spelling.");
            }
        }else {
            System.out.println("Contact not found.");
            System.out.println("Please verify that contact exists.");
        }

    }

    private static void removePhoneContact(){
        System.out.println("\n\tRemove Contact\n");
        System.out.print("Enter Name: ");
        input.nextLine();
        String name = input.nextLine();
        if(mobilePhone.queryContact(name) != null) {
            System.out.println("Contact found!");
            mobilePhone.removeContact(mobilePhone.queryContact(name));
        }
        else{
            System.out.println("Contact not found.");
            System.out.println("Please verify that contact exists.");
        }

    }

    private static void queryPhoneContact(){
        System.out.println("\n\tQuery Contact\n");
        System.out.print("Enter Name: ");
        input.nextLine();
        String name = input.nextLine();
        if(mobilePhone.queryContact(name) != null){
            System.out.println("\nContact found!" +
                    "\nName: " + mobilePhone.queryContact(name).getName() +
                    "\nPhone: " + mobilePhone.queryContact(name).getPhoneNumber());
        }else {
            System.out.println("Contact not found.");
            System.out.println("Please verify that contact exists.");
        }

    }

}
