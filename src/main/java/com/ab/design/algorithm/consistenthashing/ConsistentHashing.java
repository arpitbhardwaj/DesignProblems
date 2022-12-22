package com.ab.design.algorithm.consistenthashing;

import java.util.Arrays;

public class ConsistentHashing {
    public static void main(String[] args) {

        //initialize 4 server node
        ServerNode node1 = new ServerNode("IDC1","127.0.0.1",8080);
        ServerNode node2 = new ServerNode("IDC1","127.0.0.1",8081);
        ServerNode node3 = new ServerNode("IDC1","127.0.0.1",8082);
        ServerNode node4 = new ServerNode("IDC1","127.0.0.1",8084);

        //hash them to hash ring
        HashRing<ServerNode> hashRing = new HashRing<>(Arrays.asList(node1,node2,node3,node4),10);//10 virtual node

        //we have 5 keys, we are trying them to route to server node
        String key1 = "19216801";
        String key2 = "18216802";
        String key3 = "17216803";
        String key4 = "13216804";
        String key5 = "12216805";

        addKeys(hashRing,key1,key2,key3,key4,key5);

        ServerNode node5 = new ServerNode("IDC2","127.0.0.1",8080);
        System.out.println("-------------putting new node online " + node5.getKey() + "------------");
        hashRing.addNode(node5,10);
        addKeys(hashRing,key1,key2,key3,key4,key5);

        System.out.println("-------------removing node " + node3.getKey() + "------------");
        hashRing.removeNode(node3);
        addKeys(hashRing,key1,key2,key3,key4,key5);
    }

    private static void addKeys(HashRing<ServerNode> hashRing, String ... requestIps){
        for (String requestIp: requestIps) {
            System.out.println(requestIp + " is route to " + hashRing.addKey(requestIp));
        }
    }
}
