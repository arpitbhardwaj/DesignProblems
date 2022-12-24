package com.ab.design.algorithm.consistenthashing;

import java.util.*;

/**
 * @author Arpit Bhardwaj
 */
public class HashRing<T extends Node>{

    private MD5HashFunction hashFunction;
    private SortedMap<Long, VirtualNode<T>> ring ;

    public HashRing(Collection<T> nodes, int replicaCount) {
        this.ring = new TreeMap<>();
        this.hashFunction = new MD5HashFunction();
        if (nodes != null) {
            for (T node : nodes) {
                addNode(node, replicaCount);
            }
        }
    }

    //add physic node replicas to the hash ring
    public void addNode(T node, int replicaCount) {
        for (int i = 0; i < replicaCount; i++) {
            VirtualNode<T> vNode = new VirtualNode<>(node, i);
            ring.put(hashFunction.hash(vNode.getKey()), vNode);
        }
    }

    //remove the physical node from the hash ring
    public void removeNode(T node) {
        //rehash the keys mapped to this node to the first node towards clock wise
        //TODO
        //remove the node
        Iterator<Long> it = ring.keySet().iterator();
        while (it.hasNext()) {
            Long key = it.next();
            VirtualNode<T> virtualNode = ring.get(key);
            if (virtualNode.isVirtualNodeOf(node)) {
                it.remove();
            }
        }
    }

    //map the specified key to the nearest server node instance in the hash ring
    public T addKey(String key) {
        if (!ring.isEmpty()) {
            Long hashVal = hashFunction.hash(key);
            SortedMap<Long,VirtualNode<T>> tailMap = ring.tailMap(hashVal);
            Long nodeHashVal = !tailMap.isEmpty() ? tailMap.firstKey() : ring.firstKey();
            return ring.get(nodeHashVal).getPhysicalNode();
        }
        return null;
    }

    public void print() {
        System.out.println("-------------Printing Hash Ring------------");
        for (Map.Entry<Long, VirtualNode<T>> entry: ring.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
