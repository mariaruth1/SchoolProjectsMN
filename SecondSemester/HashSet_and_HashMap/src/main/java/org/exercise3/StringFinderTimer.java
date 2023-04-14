package org.exercise3;
import java.time.LocalTime;
import java.util.*;

public class StringFinderTimer {

    private List<String> stringArrayList;
    private Hashtable<Integer, String> stringHashtable;
    private HashMap<Integer, String> stringHashMap;
    private HashSet<String> stringHashSet;

    public StringFinderTimer(List<String> stringArrayList,
                             Hashtable<Integer, String> stringHashtable,
                             HashMap<Integer, String> stringHashMap,
                             HashSet<String> stringHashSet) {

        this.stringArrayList = stringArrayList;
        this.stringHashtable = stringHashtable;
        this.stringHashMap = stringHashMap;
        this.stringHashSet = stringHashSet;
    }

    public StringFinderTimer(){
        this.stringArrayList = new ArrayList<>();
        this.stringHashtable = new Hashtable<>();
        this.stringHashMap = new HashMap<>();
        this.stringHashSet = new HashSet<>();
    }

    public void populateCollections(int size){
        String string = "hello";
            for (int i = 1; i < size+1; i++) {
                stringArrayList.add(string + i);
                stringHashtable.put(i, string + i);
                stringHashMap.put(i, string + i);
                stringHashSet.add(string + i);
            }
    }

    public void findStringInCollection(String stringToFind){
        findStringInArrayList(stringToFind);
        findStringInHashMap(stringToFind);
        findStringInHashTable(stringToFind);
        findStringInHashSet(stringToFind);
    }

    private void findStringInArrayList(String stringToFind){
        long startTime = getCurrentTime();
        for (String string: stringArrayList){
            if (string.equals(stringToFind))
                System.out.println("String found in ArrayList in "+(getCurrentTime() - startTime)+"ms");
        }
    }

    private void findStringInHashMap(String stringToFind){
        long startTime = getCurrentTime();
        for (String string : stringHashMap.values()) {
            if (string.equals(stringToFind))
                System.out.println("String found in HashMap in "+(getCurrentTime() - startTime)+"ms");
        }
    }

    private void findStringInHashTable(String stringToFind){
        long startTime = getCurrentTime();
        for (String string : stringHashtable.values()) {
            if (string.equals(stringToFind))
                System.out.println("String found in HashTable in " + (getCurrentTime() - startTime) + "ms");
        }
    }

    private void findStringInHashSet(String stringToFind){
        long startTime = getCurrentTime();
        for (String string : stringHashSet) {
            if (string.equals(stringToFind))
                System.out.println("String found in HashSet in "+(getCurrentTime() - startTime)+"ms");
        }
    }

    private long getCurrentTime(){
        return System.currentTimeMillis();
    }


    //Write a Java application that measures how long time (ms) it takes to find a String value
// in 2.000.000, 5.000.000 and 10.000.000, 20.000.000 items
// in an ArrayList, Hashtable, HashMap and a HashSet.


    public List<String> getStringArrayList() {
        return stringArrayList;
    }

    public void setStringArrayList(List<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

    public Hashtable<Integer, String> getStringHashtable() {
        return stringHashtable;
    }

    public void setStringHashtable(Hashtable<Integer, String> stringHashtable) {
        this.stringHashtable = stringHashtable;
    }

    public HashMap<Integer, String> getStringHashMap() {
        return stringHashMap;
    }

    public void setStringHashMap(HashMap<Integer, String> stringHashMap) {
        this.stringHashMap = stringHashMap;
    }

    public HashSet<String> getStringHashSet() {
        return stringHashSet;
    }

    public void setStringHashSet(HashSet<String> stringHashSet) {
        this.stringHashSet = stringHashSet;
    }
}
