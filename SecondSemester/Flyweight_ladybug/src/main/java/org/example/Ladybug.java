package org.example;

import javafx.scene.image.Image;

public class Ladybug {
    private Image img;
    private int size;

    //x and y for placement on canvas?

    public Ladybug(){}
    public Ladybug(Image img, int size) {
        this.img = img;
        this.size = size;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
