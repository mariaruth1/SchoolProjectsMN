package org.Exercise4;

import java.util.HashMap;

public class GoogleMaps {

    //A matrix (two-dimensional array) may be used to store distances between towns. By using the city names as index values, the distance between two cities can be looked up in the matrix.
    //The problem is that the matrix only uses integer values for the indexes.
    //Use a HashMap<String, Integer> to translate the city names into the corresponding index values, by using the city names as key values.
    //Implement the method:
    //public int getDistance(string town1, string town2);

    private int[][] distanceMatrix;
    private HashMap<String, Integer> townIndexFinder = new HashMap<>();

    private String[] townsToUse = {"Esbjerg", "Varde", "Bramming", "Hjerting"};

    public GoogleMaps() {
        populateTownIndexMap();
        populateMatrix();
    }

    public int getDistance(String townFrom, String townTo){
        int townFromIndex = townIndexFinder.get(townFrom);
        int townToIndex = townIndexFinder.get(townTo);
        return distanceMatrix[townFromIndex][townToIndex];
    }



    private void populateTownIndexMap(){
        for (int i = 0; i < townsToUse.length-1; i++) {
            townIndexFinder.put(townsToUse[i], i);
        }
    }

    private void populateMatrix(){
        distanceMatrix = new int[][]{
                {0, 27, 26, 14},
                {27, 0, 25, 17},
                {26, 25, 0, 14},
                {14, 17, 24, 0}
        };
    }

    public int[][] getDistanceMatrix() {
        return distanceMatrix;
    }

    public void setDistanceMatrix(int[][] distanceMatrix) {
        this.distanceMatrix = distanceMatrix;
    }

    public HashMap<String, Integer> getTownIndexFinder() {
        return townIndexFinder;
    }

    public void setTownIndexFinder(HashMap<String, Integer> townIndexFinder) {
        this.townIndexFinder = townIndexFinder;
    }
}
