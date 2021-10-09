package com.ab.design.misc;

import java.util.*;

/**
 * @author Arpit Bhardwaj
 * Design a data structure that supports the following operations in Θ(1) time.
 * insert(x),remove(x),getRandom(),search(x)
 * use hashing to support first 3 operations and ArrayList together with hashing to support 4th
 */
public class RandomizedDataStructure<T> {

    private List<T> list;//to store elements
    private Map<T,Integer> map;//keys are elements and values are indexes

    public RandomizedDataStructure() {
        this.list = new ArrayList<>();
        this.map = new HashMap<>();
    }

    public boolean insert(T x){
        if (map.containsKey(x)){
            return false;
        }
        int index = list.size();
        list.add(x);
        map.put(x,index);
        return true;
    }

    public boolean remove(T x){
        if(!map.containsKey(x)){
            return false;
        }
        int n = list.size();
        int swapIndex = map.get(x);
        Collections.swap(list,swapIndex,n-1);
        T swapItem = list.get(swapIndex);
        map.put(swapItem,swapIndex);
        list.remove(n-1);
        map.remove(x);
        return true;
    }

    public int search(T x){
        if (!map.containsKey(x)){
            return -1;
        }
        return map.get(x);
    }

    public T getRandom(){
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }

    public static void main(String[] args) {
        RandomizedDataStructure<Integer> specialDS = new RandomizedDataStructure<>();
        specialDS.insert(20);
        specialDS.insert(10);
        specialDS.insert(40);
        System.out.println(specialDS.search(10));
        System.out.println(specialDS.search(50));
        specialDS.remove(10);
        specialDS.insert(50);
        System.out.println(specialDS.search(50));
        System.out.println(specialDS.getRandom());
    }
}
