package org.example;

import java.util.*;

public class PersonManager {
    private Deque<Person> persons = new ArrayDeque<>();
    private static PersonManager instance = null;

    public static PersonManager getInstance() {
        if(instance == null){
            instance = new PersonManager();
        } return instance;
    }

    private PersonManager(){}

    public Deque<Person> getPersons() {
        return persons;
    }

    public void setPersons(Deque<Person> persons) {
        this.persons = persons;
    }

    public void addPersons(Person... p){
        Collections.addAll(persons, p);
    }

    public Person getNextPerson(){
        return persons.removeFirst();
// gets next person and removes him/her from the List
    }

    public Person whoIsNext(){
        return persons.peekFirst();
// Looks at next person without removing from the List
    }

}
