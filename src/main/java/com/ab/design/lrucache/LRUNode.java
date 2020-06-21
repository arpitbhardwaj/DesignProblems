package com.ab.design.lrucache;

/**
 * @author Arpit Bhardwaj
 *
 * LRUNode implemented using doubly circular linked list nodes
 */

public class LRUNode {
    public int key;
    public String value;
    public LRUNode next;
    public LRUNode before;

    public LRUNode(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
        this.before = null;
    }

    @Override
    public String toString() {
        return "LRUNode{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
