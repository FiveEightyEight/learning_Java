
package com.robertabreu;

import java.util.ArrayList;

public class Main {
public static Customer anotherCustomer = new Customer();
    public static void main(String[] args) {

        Customer customer = new Customer("Robert", 200);

        System.out.println("Customer balance for " + anotherCustomer.getName() + " = " + anotherCustomer.getBalance());

        anotherCustomer.setName("Bob");
        anotherCustomer.setBalance(200.34);
        System.out.println("Customer balance for " + customer.getName() + " = " + customer.getBalance());
        System.out.println("Customer balance for " + anotherCustomer.getName() + " = " + anotherCustomer.getBalance());
        anotherCustomer.setBalance(500);

        System.out.println("Customer balance for " + customer.getName() + " = " + customer.getBalance());
        System.out.println("Customer balance for " + anotherCustomer.getName() + " = " + anotherCustomer.getBalance());

        ArrayList<Customer> cusArray = new ArrayList<Customer>();

        cusArray.add(new Customer("Robert", 200));
        cusArray.add(1, new Customer("Bob", 300));
        cusArray.add(new Customer("Bill", 100));

        for(int i = 0; i < cusArray.size(); i++){
            System.out.println(i +": " + cusArray.get(i).getName());
        }

        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(3);
        array.add(2);
        array.add(1);
                for(int i = 0; i < array.size(); i++){
            System.out.println(i +": " + array.get(i));
        }
        System.out.println("\nAdding [ array.add(2, 6); ]");

        array.add(2, 6);

        for(int i = 0; i < array.size(); i++){
            System.out.println(i +": " + array.get(i));
        }
    }
}
