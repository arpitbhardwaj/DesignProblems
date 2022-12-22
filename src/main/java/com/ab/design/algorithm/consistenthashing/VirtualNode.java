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
        this.replicaIndex = replicaIndex;
        this.physicalNode = physicalNode;
    }

    @Override
    public String getKey() {
        return physicalNode.getKey() + "-" + replicaIndex;
    }

    public boolean isVirtualNodeOf(T pNode) {
        return physicalNode.getKey().equals(pNode.getKey());
    }

    public T getPhysicalNode() {
        return physicalNode;
    }

}
