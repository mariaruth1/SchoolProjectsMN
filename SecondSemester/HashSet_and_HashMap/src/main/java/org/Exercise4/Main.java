package org.Exercise4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {

    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();

        System.out.println(googleMaps.getDistance("Esbjerg", "Bramming"));
    }
}