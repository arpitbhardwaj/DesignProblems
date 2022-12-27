package com.ab.design.controlsystem.filesystem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
public class Directory extends Entry{

    private List<Entry> contents;
    public Directory(String name, Directory parent) {
        super(name, parent);
        this.contents = new ArrayList<>();
    }

    @Override
    public int size() {
        for (Entry entry:
             contents) {
            size += entry.size;
        }
        return size;
    }

    public List<Entry> getContents() {
        return contents;
    }

    public int numberOfFiles(){
        int count = 0;

        for (Entry entry:
             contents) {
            if (entry instanceof Directory){
                count++;
                count += ((Directory) entry).numberOfFiles();
            }else if (entry instanceof File){
                count++;
            }
        }
        return count;
    }
    public boolean deleteEntry(Entry entry){
        return contents.remove(entry);
    }

    public boolean addEntry(Entry entry){
        return contents.add(entry);
    }
}
