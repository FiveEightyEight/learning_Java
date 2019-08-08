package com.robertabreu;

/**
 * Created by robertabreu on 1/31/16.
 */
import java.util.ArrayList;
public class MobilePhone {
    private String phoneName;
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneName, String myNumber){
        this.phoneName = phoneName;
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }



    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        System.out.println(contact.getName() + " added to " + this.phoneName);
        return true;
    }


    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", updated to " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        System.out.println(contact.getName() + ", was removed.");
        this.myContacts.remove(foundPosition);
        return true;
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i ++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            contact.getName();
        }
        return null;
    }

    public Contact queryContact(String contactName){
        int contactPosition = findContact(contactName);
        if(contactPosition >= 0) {
           Contact contact = this.myContacts.get(contactPosition);
            return contact;
        }
        return null;
    }

//    public boolean displayContactInfo(Contact contact){
//        int position = findContact(contact);
//        if(position >= 0) {
//            System.out.println(contact.getName() +
//                    ": " + contact.getPhoneNumber());
//            return true;
//        }
//        return false;
//    }













    public void printContacts(){
        if(this.myContacts.size() <= 0){
            System.out.println("Contact List is empty!" +
            "\nChoose option 2 to add a new contact.");
        } else{
            System.out.println("Contact List");
            for(int i = 0; i < this.myContacts.size(); i++) {
                System.out.println((i + 1) + ". " +
                        this.myContacts.get(i).getName() + ": " +
                        this.myContacts.get(i).getPhoneNumber()
                );
            }
        }

    }



}
