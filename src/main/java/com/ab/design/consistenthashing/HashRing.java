package com.ab.design.consistenthashing;

/**
 * @author Arpit Bhardwaj
 */
public interface HashRing {
    public boolean addServer(Server server);
    public boolean removeServer(Server server);
    public Server getServer(String key);
    public boolean put(String key, String value);
    public Entry get(String key);
}
