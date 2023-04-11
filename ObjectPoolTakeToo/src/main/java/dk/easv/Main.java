package dk.easv;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(4);
        es.submit(new LoadFromDatabase(es));
        es.submit(new LoadFromDatabase(es));
        es.submit(new LoadFromDatabase(es));
        es.submit(new LoadFromDatabase(es));

    }
}
