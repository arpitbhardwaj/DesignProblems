package com.ab.design.algorithm.cache;

import java.util.*;

/**
 * @author Arpit Bhardwaj
 *
 * Least Frequently Used (LFU) is a caching algorithm
 * in which the least frequently used cache block is removed whenever the cache is overflowed.
 */
public class LFUCache {
    SortedMap<Integer, LinkedHashSet<Integer>> frequencies;
    Map<Integer, Pair> cache;
    int capacity;
    public LFUCache(int capacity) {
        this.frequencies = new TreeMap<>();//dll
        this.cache = new HashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            Pair p = cache.get(key);
            frequencies.get(p.frequency).remove(key);
            insert(key, p.frequency+1, p.value);
            return p.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Pair p = cache.get(key);
            p.value = value;
            cache.put(key,p);
            get(key);
        }else{
            Pair p = new Pair(key,value);
            if(cache.size() == capacity){
                Set<Integer> keys = frequencies.get(frequencies.firstKey());
                int keyToDelete = keys.iterator().next();
                cache.remove(keyToDelete);
                keys.remove(keyToDelete);
            }
            cache.put(key,p);
            insert(key,1,value);
        }
    }

    private void insert(int key, int frequency, int value) {
        frequencies.putIfAbsent(frequency, new LinkedHashSet<>());
        frequencies.get(frequency).add(key);
    }

    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(2);
        lfuCache.put(1, 1);                     // cache is {1=1}
        lfuCache.put(2, 2);                     // cache is {1=1, 2=2}
        System.out.println(lfuCache.get(1));    // return 1
        lfuCache.put(3, 3);                     // LRU key was 2, evicts key 2, cache is {3=3, 1=1}

        System.out.println(lfuCache.get(2));    // returns -1 (not found)
        System.out.println(lfuCache.get(3));
        lfuCache.put(4, 4);                     // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(lfuCache.get(1));    // return -1 (not found)
        System.out.println(lfuCache.get(3));    // return 3
        System.out.println(lfuCache.get(4));    // return 4
    }

    private class Pair{
        int key;
        int value;
        int frequency;
        Pair(int key, int value){
            this.key = key;
            this.value = value;
            this.frequency = 1;
        }

        @Override
        public String toString() {
            return "{key=" + key + ", value=" + value + "frequency=" + frequency + "}";
        }
    }
}
