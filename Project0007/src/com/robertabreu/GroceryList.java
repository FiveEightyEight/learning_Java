package com.robertabreu;

import java.util.ArrayList;

/**
 * Created by robertabreu on 1/30/16.
 */

/*
    .add() == adds something to the ArrayList.

    .size() == .length

    .get(#) / arrayName.get(#) == arrayName[#] == [#]

    .set() == changes the item at a position
    example:
    public void setArrayPosition(int position, String newItem){
        arrayName.set(position, newItem);
        System.out.println("Position " + position + " is now " + newItem);
    }
    .remove(#) == removes an item a position #

    .contains(#) == will return a boolean on whether or not the array contains #

 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void modifyGroceryList(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryList(position, newItem, currentItem);
        }

    }
    private void modifyGroceryList(int position, String newItem, String currentItem) {
        groceryList.set(position, newItem);
        System.out.println("Old item " + currentItem +
                " replaced with new item added at position " + (position+1) + ": " + newItem);
    }

    public void removeGroceryList(String item) {
        int position = findItem(item);
        if(position >= 0){
            removeGroceryList(position);
        }else {
            System.out.println("\tItem not on list.");
        }

    }
    private void removeGroceryList(int position) {
        System.out.println(groceryList.get(position) + " has been removed from list.");
        groceryList.remove(position);
        /* String temp = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(temp + " removed from list.");
        */
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public String findItem2(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return searchItem;
        }
        return null;
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }
//    public String findItem(String searchItem) {
////        boolean exists = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem);
//        if(position >= 0) {
//            return groceryList.get(position);
//        }
//            return null;
//    }


}
