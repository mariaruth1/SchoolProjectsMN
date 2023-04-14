package org.exercise1;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        customerManager.addCustomerToMap(new Customer(24237446, "Norrie Damiral", "23 Erie Park", "ndamiral0@altervista.org"));
        customerManager.addCustomerToMap(new Customer(11751160, "Etti Matusiak", "564 Corben Way", "ematusiak1@jimdo.com"));
        customerManager.addCustomerToMap(new Customer(86317248, "Ingra Andrez", "4676 4th Terrace", "iandrez2@360.cn"));
        customerManager.addCustomerToMap(new Customer(50375859, "Andreana Yellowlea", "4198 Raven Avenue", "ayellowlea3@icq.com"));
        customerManager.addCustomerToMap(new Customer(50375959, "Leonie Facher", "342 Grayhawk Avenue", "lfacher4@yahoo.com"));

        /*for(Map.Entry<Integer, Customer> entry: customerManager.getCustomerHashMap().entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/

        //Now output the contents of your HashSet using an Iterator and a while loop:
        //
        Iterator<Customer> it = customerManager.getCustomerHashMap().iterator();
        while (it.hasNext()) {
            Customer customer = it.next();
            System.out.println(customer);

        }
    }
}