package com.ab.design.algorithm.consistenthashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Arpit Bhardwaj
 *
 */
public class MD5HashFunction {

    MessageDigest instance;

    public MD5HashFunction() {
        try {
            instance = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    public long hash(String key) {
        instance.reset();
        instance.update(key.getBytes());
        byte[] digest = instance.digest();

        long h = 0;
        for (int i = 0; i < 4; i++) {
            h <<= 8;
            h |= ((int) digest[i]) & 0xFF;
        }
        return h;
    }
}
