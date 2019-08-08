package com.robertabreu;

import java.util.ArrayList;

/**
 * Created by robertabreu on 1/31/16.
 */
public class Contacts {
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> number = new ArrayList<String>();

    private int findContact(String contactName){
        return name.indexOf(contactName);
    }

    private int findNumber(String cNumber){
        return number.indexOf(cNumber);
    }

    public boolean doesContactExist(String contactName){
        int contact = findContact(contactName);
        if(contact >= 0){
            return true;
        }
        return false;
    }


    public void getNameNumber(String contactName){
        int position = findContact(contactName);
        System.out.println("\t" + name.get(position) + ": " + number.get(position));
    }

    public void printContacts(){
        for(int i = 0; i < name.size(); i++){
            System.out.println(i+1 + ". " + name.get(i) + ": " + number.get(i));
        }
    }

    public void addContact(String contactName, String cNumber){
        int exists = findContact(contactName);
        if (exists < 0) {
            name.add(contactName);
            number.add(cNumber);
            System.out.println("Added " + contactName + " to phone book");
            System.out.println(contactName+ "'s phone number: " +cNumber);
        } else {
         System.out.println(contactName + " is already a contact.");
        }
    }

    public void modifyContactName(String contactName, String nName){
        int position = findContact(contactName);
        System.out.println(contactName + "'s name changed to " + nName);
        name.set(position, nName);

    }
    public void modifyContactNumber(String contactName, String nNumber){
        int position = findContact(contactName);
        System.out.println(contactName + "'s number changed to " + nNumber);
        number.set(position, nNumber);
    }

    public void modifyBoth(String contactName, String nName, String nNumber){
        int position = findContact(contactName);
        System.out.println(contactName + "'s name changed to " + nName);
        System.out.println(contactName + "'s number changed to " + nNumber);
        name.set(position, nName);
        number.set(position, nNumber);
    }

    public void removeContact(String contactName){
        int position = findContact(contactName);
        if(position >= 0) {
            removeContact(position);
        }else {
            System.out.println("Unable to remove contact.");
        }
    }

    private void removeContact(int position){
        System.out.println("Removed " + name.get(position)+ ": "+ number.get(position) + " from contact list.");
        name.remove(position);
        number.remove(position);
    }





}
