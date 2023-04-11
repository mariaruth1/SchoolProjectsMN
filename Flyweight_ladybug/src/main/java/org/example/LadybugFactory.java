package org.example;

import javafx.scene.image.Image;
import java.util.HashMap;

public class LadybugFactory {
    private final HashMap<Integer, Ladybug> lbCache = new HashMap<>();
    private final String imageURL;

    public  LadybugFactory(String imageURL){
        this.imageURL = imageURL;
    }

    public Ladybug create(int size){
        Ladybug lb = lbCache.get(size);

        if(lb == null){
            Image img = new Image(imageURL, size, size, true, true);
            lb = new Ladybug(img, size);
            lbCache.put(size, lb);
        }
        System.out.println(lb.getSize());
        return lb;
    }
}
