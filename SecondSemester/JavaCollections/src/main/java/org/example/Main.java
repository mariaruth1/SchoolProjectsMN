package org.example;

import java.sql.Date;
import java.util.Iterator;

public class Main {
    //In your main class, use an Iterator object instance to iterate through your person data structure.
    //
    //While iterating, remove an item from your data structure if it matches a specific criteria (name, id etc.)
    public static void main(String[] args) {
        Person p1 = new Person(13, "Maria", Date.valueOf("1988-04-13"));
        Person p2 = new Person(14, "Julia", Date.valueOf("1988-04-13"));
        Person p3 = new Person(15, "Wilhelm", Date.valueOf("1988-04-13"));
        Person p4 = new Person(16, "Uwe", Date.valueOf("1988-04-13"));
        Person p5 = new Person(17, "Peter", Date.valueOf("1988-04-13"));

        PersonManager.getInstance().addPersons(p1, p2, p3, p4, p5);
        System.out.println(PersonManager.getInstance().getPersons());


        Iterator<Person> personIterator = PersonManager.getInstance().getPersons().iterator();
        while (personIterator.hasNext()){
            if(personIterator.next().getName().equals("Peter"))
                personIterator.remove();
        }

        System.out.println(PersonManager.getInstance().getPersons());

    }
}