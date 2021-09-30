package com.ab.design.algorithm.lru;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class LeetCodeLRUCache {
    class Pair{
        int key;
        int value;
        Pair(int key, int value){
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
    LinkedList<Pair> ageList;
    Map<Integer,Pair> cache;
    int capacity;
    public LeetCodeLRUCache(int capacity) {
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
        LeetCodeLRUCache lRUCache = new LeetCodeLRUCache(2);
        lRUCache.put(1, 1);                     // cache is {1=1}
        lRUCache.put(2, 2);                     // cache is {1=1, 2=2}
        System.out.println(lRUCache.get(1));    // return 1
        lRUCache.put(3, 3);                     // LRU key was 2, evicts key 2, cache is {3=3, 1=1}

        System.out.println(lRUCache.get(2));    // returns -1 (not found)
        lRUCache.put(4, 4);                     // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(lRUCache.get(1));    // return -1 (not found)
        System.out.println(lRUCache.get(3));    // return 3
        System.out.println(lRUCache.get(4));    // return 4
    }
}

