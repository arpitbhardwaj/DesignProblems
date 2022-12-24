package com.ab.design.algorithm.consistenthashing;

/**
 * @author Arpit Bhardwaj
 *
 * copy/clone/replica of ServerNode
 */
public class VirtualNode<T extends Node> implements Node {
    final T physicalNode;
    final int replicaIndex;

    public VirtualNode(T physicalNode, int replicaIndex) {
        this.physicalNode = physicalNode;
        this.replicaIndex = replicaIndex;
    }

    @Override
    public String getKey() {
        return physicalNode.getKey() + "-" + replicaIndex;
    }

    public boolean isVirtualNodeOf(T vNode) {
        return physicalNode.getKey().equals(vNode.getKey());
    }

    public T getPhysicalNode() {
        return physicalNode;
    }

    @Override
    public String toString() {
        return getKey();
    }
}
