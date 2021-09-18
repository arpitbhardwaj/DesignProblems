package com.ab.design.lrucache;

import java.util.HashMap;

/**
 * @author Arpit Bhardwaj
 */
public class LRUCache {

    private int capacity;
    private LRUNode head;
    private HashMap<Integer, LRUNode> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new LRUNode(Integer.MAX_VALUE,"#");
        this.head.next = this.head;
        this.head.before = this.head;
    }

    public String get(int key) {
        LRUNode node = this.cache.get(key);
        if (node != null) {
            moveToHead(node);
            return node.value;
        } else {
            return null;
        }
    }

    public void set(int key, String value) {
        LRUNode node = cache.get(key);
        if (node != null) {
            moveToHead(node);
            node.value = value;
        } else {
            LRUNode newLRUNode;
            if (cache.size() >= capacity){
                //remove previous node of head
                System.out.println("Removing LRU Key : " + head.before.key);
                newLRUNode = remove(head.before.key);
                newLRUNode.key = key;
                newLRUNode.value = value;
            }else{
                newLRUNode = new LRUNode(key,value);
            }
            linkToHead(newLRUNode);
            cache.put(key, newLRUNode);
        }
    }

    public void reset(){
        cache.clear();
        head.next = head;
        head.before = head;
    }

    private LRUNode remove(int key) {
        //unlink from DLL
        LRUNode node = cache.get(key);
        unlink(node);

        //remove from hash
        cache.remove(key);

        //return to reuse
        return node;
    }

    public void print(){
        LRUNode cursor = head;
        while (cursor.next != head){
            System.out.print(cursor.next.value + " ");
            cursor = cursor.next;
        }
        System.out.println();
    }

    private void moveToHead(LRUNode node) {
        //unlink from current position
        unlink(node);
        //link to head position
        linkToHead(node);
    }

    private void unlink(LRUNode node) {
        //unlink from current position
        LRUNode nextLRUNode = node.next;
        LRUNode prevLRUNode = node.before;

        prevLRUNode.next = nextLRUNode;
        nextLRUNode.before = prevLRUNode;
    }

    private void linkToHead(LRUNode node) {
        //link to head position
        LRUNode headNextNode = head.next;
        node.next = headNextNode;
        node.before = head;

        headNextNode.before = node;
        head.next = node;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.set(2,"Raju");
        cache.print();

        cache.set(1,"Shyam");
        cache.print();

        System.out.println(cache.get(2));
        cache.print();

        cache.set(4, "Meena");
        cache.print();

        System.out.println(cache.get(2));
        cache.print();

        cache.set(5, "Tina");
        cache.print();
    }
}
