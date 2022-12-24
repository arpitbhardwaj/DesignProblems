package com.ab.design.algorithm.consistenthashing;

import java.util.Arrays;

public class ConsistentHashing {
    public static void main(String[] args) {

        ServerNode node1 = new ServerNode("IDC1","127.0.0.1",8080);
        ServerNode node2 = new ServerNode("IDC2","127.0.0.2",8081);
        ServerNode node3 = new ServerNode("IDC3","127.0.0.3",8082);
        ServerNode node4 = new ServerNode("IDC4","127.0.0.4",8084);

        HashRing<ServerNode> hashRing = new HashRing<>(Arrays.asList(node1,node2,node3,node4),2);
        hashRing.print();

        String key1 = "19216801";
        String key2 = "18216802";
        String key3 = "17216803";
        String key4 = "13216804";
        String key5 = "12216805";

        addKeys(hashRing,key1,key2,key3,key4,key5);

        ServerNode node5 = new ServerNode("IDC5","127.0.0.5",8085);
        System.out.println("-------------putting new server " + node5.getKey() + "------------");
        hashRing.addNode(node5,2);
        addKeys(hashRing,key1,key2,key3,key4,key5);

        System.out.println("-------------removing existing server " + node3.getKey() + "------------");
        hashRing.removeNode(node3);
        addKeys(hashRing,key1,key2,key3,key4,key5);

        hashRing.print();
    }

    private static void addKeys(HashRing<ServerNode> hashRing, String ... keys){
        System.out.println("-------------Adding keys to the distributed servers------------");
        for (String key: keys) {
            System.out.println("Key: " + key + " is added to server " + hashRing.addKey(key));
        }
    }
}
