package com.ab.design.algorithm.consistenthashing;

import java.util.Arrays;

/**
 * @author Arpit Bhardwaj
 *
 * Actual Servers which will be mapped to hash ring based on ip address
 */
public class ServerNode implements Node{

    private final String ip;
    private final String name;
    private final int port;

    public ServerNode(String name, String ip, int port) {
        this.name = name;
        this.ip = ip;
        this.port = port;
    }

    @Override
    public String getKey() {
        return name + "-"+ip+":"+port;
    }

    @Override
    public String toString(){
        return getKey();
    }
}
