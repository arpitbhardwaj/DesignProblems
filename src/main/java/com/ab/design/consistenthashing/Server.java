package com.ab.design.consistenthashing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
public class Server {
    private String ipAddress;
    private List<Entry<String,String>> entries;

    public Server(String ipAddress) {
        this.ipAddress = ipAddress;
        entries = new ArrayList<>();
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public List<Entry<String, String>> getEntries() {
        return entries;
    }

    public void addEntry(Entry entry){
        entries.add(entry);
    }

    public void removeEntry(Entry entry){
        entries.remove(entry);
    }

    public Entry getEntry(String key){
        for (Entry entry:
             entries) {
            if (entry.getKey().equals(key)){
                return entry;
            }
        }
        return null;
    }
}
