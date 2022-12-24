package com.ab.design.algorithm.cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author Arpit Bhardwaj
 *
 * Least Recently Used (LRU) is a caching algorithm
 * in which the least recently used cache block is removed whenever the cache is overflowed.
 */
class LRUCache {
    LinkedList<Pair> ageList;
    Map<Integer,Pair> cache;
    int capacity;
    public LRUCache(int capacity) {
        this.ageList = new LinkedList<>();//dll
        this.cache = new HashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            Pair p = cache.get(key);
            ageList.remove(p);
            ageList.addFirst(p);
            return p.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Pair p = cache.get(key);
            p.value = value;
            cache.put(key,p);
            ageList.remove(p);
            ageList.addFirst(p);
        }else{
            Pair p = new Pair(key,value);
            if(cache.size() == capacity){
                cache.remove(ageList.removeLast().key);
            }
            cache.put(key,p);
            ageList.addFirst(p);
        }
    }


    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1);                     // cache is {1=1}
        lRUCache.put(2, 2);                     // cache is {1=1, 2=2}
        //System.out.println(lRUCache.ageList);
        System.out.println(lRUCache.get(1));    // return 1
        lRUCache.put(3, 3);                     // LRU key was 2, evicts key 2, cache is {3=3, 1=1}
        //System.out.println(lRUCache.ageList);

        System.out.println(lRUCache.get(2));    // returns -1 (not found)
        System.out.println(lRUCache.get(3));
        lRUCache.put(4, 4);                     // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        //System.out.println(lRUCache.ageList);

        System.out.println(lRUCache.get(1));    // return -1 (not found)
        System.out.println(lRUCache.get(3));    // return 3
        System.out.println(lRUCache.get(4));
        //System.out.println(lRUCache.ageList);
    }

    private class Pair{
        int key;
        int value;
        Pair(int key, int value){
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{key=" + key + ", value=" + value + '}';
        }
    }
}

