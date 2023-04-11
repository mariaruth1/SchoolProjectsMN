package dk.easv;

import java.util.ArrayDeque;
import java.util.Queue;

public class ObjectPool {
    private static ObjectPool instance = null;
    private Queue<DummyDbConnection> reusable = new ArrayDeque<>();
    private Queue<DummyDbConnection> used = new ArrayDeque<>();

    public static ObjectPool getInstance(){
        if(instance == null){
            instance = new ObjectPool();
        } return instance;
    }
    private ObjectPool(){}

    public synchronized DummyDbConnection getConnectionFromPool(){
        DummyDbConnection dummyDbConnection;
        if(reusable.isEmpty()){
            if(used.size()<2){
                dummyDbConnection = new DummyDbConnection();
                used.add(dummyDbConnection);
            }
            else {
                throw new RuntimeException("No more connections, bitch");
            }
        }

        else {
            dummyDbConnection = reusable.poll();
            used.add(dummyDbConnection);
        }
        return dummyDbConnection;
    }

    public void releaseConnection(DummyDbConnection dummyDbConnection){
        if(used.contains(dummyDbConnection)) {
            used.remove(dummyDbConnection);
            reusable.add(dummyDbConnection);
        }
    }
}
