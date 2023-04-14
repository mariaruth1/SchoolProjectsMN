package org.exercise1;

import java.util.HashSet;

public class CustomerManager {

    private HashSet<Customer> customerHashMap;

    public CustomerManager(HashSet<Customer> customerHashMap) {
        this.customerHashMap = customerHashMap;
    }

    public CustomerManager(){
        this.customerHashMap = new HashSet<>();
    }

    public HashSet<Customer> getCustomerHashMap() {
        return customerHashMap;
    }

    public void setCustomerHashMap(HashSet<Customer> customerHashMap) {
        this.customerHashMap = customerHashMap;
    }

    public void addCustomerToMap(Customer customer){
        customerHashMap.add(customer);
    }

    //Then write an application, which uses a HashMap to manage a list of customers.
    // The customer’s phone number should be uses as the look-up field in the hash table.
    //Be sure to add one of your customer objects twice in your HashMap (with another phone number).
    //Iterate through the HashMaps values as well as the keys using a for-each loop.
}
