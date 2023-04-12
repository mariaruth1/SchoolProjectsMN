package dk.easv;

import java.util.Random;

public class DummyDbConnection {

    private static int nextId = 1;
    private int id = nextId++;

    public void load() {
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

}
