package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;


import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class LadybugController implements Initializable {
    private Canvas canvas;
    private GraphicsContext gc;
    @FXML
    private Pane mainPane;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        canvas = new Canvas(800, 560);
        gc = canvas.getGraphicsContext2D();
        mainPane.getChildren().add(canvas);
    }

    public void clickLadybug(ActionEvent actionEvent) {
        Random rand = new Random();
        LadybugFactory fact = new LadybugFactory("/ladybug.png");

        for (int i=0; i<1000; i++){
            int size = getRandSize(rand);
            Ladybug lb = fact.create(size);
            gc.drawImage(lb.getImg(), rand.nextInt((int)canvas.getWidth()), rand.nextInt((int)canvas.getHeight()));
        }
    }

    private int getRandSize(Random rand) {
        return (rand.nextInt(2)+1)*15; //15, 30 or 45
    }
}
