package com.ab.design.controlsystem.filesystem;

/**
 * @author Arpit Bhardwaj
 */
public class File extends Entry{
    private String content;

    public File(String name, Directory parent,int size) {
        super(name, parent);
        this.size = size;
    }

    @Override
    public int size() {
        return size;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
