package com.ab.design.algorithm.bloomfilter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author Arpit Bhardwaj
 *
 * Bloom filters are for hash based probabilistic ds for larger datasets which determines whether an element is probably present or definately not.
 * When a Bloom filter says an element is not present it is for sure not present.
 * When Bloom filter says the given element is present it is not 100% sure,
 *
 * Underlaying Data Structure
 * Bit array of size N
 * h number of hash functions
 *
 * Time complexity: O(h), where h is the number of hash functions used
 * Space complexity: 159 Mb (For 40 million data sets)
 * Case of False positive: 1 mistake per 10 million (for h = 23)
 *
 * Use case
 *      to implement URL Seen component in  web crawler
 */
public class BloomFilterDemo {
    public static void main(String[] args) {
        BloomFilter<String> urlSeen = BloomFilter
                .create(Funnels.stringFunnel(StandardCharsets.UTF_8),10000);

        urlSeen.put("https://www.wikipedia.org/");
        urlSeen.put("https://www.google.com/");
        urlSeen.put("https://www.linkedin.com/");

        System.out.println(urlSeen.mightContain("https://www.linkedin.com/"));
        System.out.println(urlSeen.mightContain("https://www.facebook.com/"));
    }
}
