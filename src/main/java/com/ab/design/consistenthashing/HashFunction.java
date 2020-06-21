package com.ab.design.consistenthashing;

/**
 * @author Arpit Bhardwaj
 */
public class HashFunction {
    public int createHash(String input) {
        int hash = 7;
        for (int i = 0; i < input.length(); i++) {
            hash = hash * 31 + input.charAt(i);
        }

        return hash;
    }
}
