package org.exercise3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {



    public static void main(String[] args) {
        StringFinderTimer stringFinderTimer = new StringFinderTimer();
        int size = 11_111_111;
        stringFinderTimer.populateCollections(size);
        stringFinderTimer.findStringInCollection("hello"+size);
    }
}