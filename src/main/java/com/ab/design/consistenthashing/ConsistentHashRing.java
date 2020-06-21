package com.ab.design.consistenthashing;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Arpit Bhardwaj
 */
public class ConsistentHashRing implements HashRing {

    private int replicas;
    private HashFunction hashFunction;
    private SortedMap<Integer,Server> hashRing;

    public ConsistentHashRing(int replicas, HashFunction hashFunction) {
        this.replicas = replicas;
        this.hashFunction = hashFunction;
        this.hashRing = new TreeMap<>();
    }

    @Override
    public boolean addServer(Server server) {
        return false;
    }

    @Override
    public boolean removeServer(Server server) {
        return false;
    }

    @Override
    public Server getServer(String key) {
        if (hashRing.size() == 0){
            return null;
        }

        int hash = hashFunction.createHash(key);
        if (hashRing.containsKey(hash)){
            return hashRing.get(hash);
        }else{

        }
        return null;
    }

    @Override
    public boolean put(String key, String value) {
        Server server = getServer(key);

        if (server != null){
            server.addEntry(new Entry(key,value));
            return true;
        }
        return false;
    }

    @Override
    public Entry get(String key) {
        Server server = getServer(key);
        if (server != null){
            return server.getEntry(key);
        }
        return null;
    }
}
