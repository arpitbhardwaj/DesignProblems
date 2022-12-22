package com.ab.design.algorithm.consistenthashing;

import java.util.Collection;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Arpit Bhardwaj
 */
public class HashRing<T extends Node>{

    private MD5HashFunction hashFunction;
    private SortedMap<Long, VirtualNode<T>> ring ;

    public HashRing(Collection<T> pNodes, int vNodeCount) {
        this.ring = new TreeMap<>();
        this.hashFunction = new MD5HashFunction();
        if (pNodes != null) {
            for (T pNode : pNodes) {
                addNode(pNode, vNodeCount);
            }
        }
    }

    //add physic node to the hash ring with some virtual nodes
    public void addNode(T pNode, int vNodeCount) {
        if (vNodeCount < 0) throw new IllegalArgumentException("illegal virtual node counts :" + vNodeCount);
        int existingReplicas = getExistingReplicas(pNode);
        for (int i = 0; i < vNodeCount; i++) {
            VirtualNode<T> vNode = new VirtualNode<>(pNode, i + existingReplicas);
            ring.put(hashFunction.hash(vNode.getKey()), vNode);
        }
    }

    //remove the physical node from the hash ring
    public void removeNode(T pNode) {
        Iterator<Long> it = ring.keySet().iterator();
        while (it.hasNext()) {
            Long key = it.next();
            VirtualNode<T> virtualNode = ring.get(key);
            if (virtualNode.isVirtualNodeOf(pNode)) {
                it.remove();
            }
        }
    }

    //with a specified key, route the nearest server node instance in the hash ring
    public T addKey(String key) {
        if (!ring.isEmpty()) {
            Long hashVal = hashFunction.hash(key);
            SortedMap<Long,VirtualNode<T>> tailMap = ring.tailMap(hashVal);
            Long nodeHashVal = !tailMap.isEmpty() ? tailMap.firstKey() : ring.firstKey();
            return ring.get(nodeHashVal).getPhysicalNode();
        }
        return null;
    }

    public int getExistingReplicas(T pNode) {
        int replicas = 0;
        for (VirtualNode<T> vNode : ring.values()) {
            if (vNode.isVirtualNodeOf(pNode)) {
                replicas++;
            }
        }
        return replicas;
    }
}
