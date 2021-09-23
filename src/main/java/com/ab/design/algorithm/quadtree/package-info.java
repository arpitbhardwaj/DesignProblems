package com.ab.design.algorithm.quadtree;

/**
 * @author Arpit Bhardwaj
 *
 * Quad Tree
 *      is a variant of the Tree data structure.
 *      Trees generally have internal nodes (nodes that have at least one child) and leaf nodes which have no children.
 *      These nodes hold data that are ordered in a hierarchical order.
 *      A quadtree is a tree data structure in which each node has zero or four children.
 *      Its main peculiarity is its way of recursively dividing a flat 2-D space into four quadrants.
 *
 * Used Case:
 *      Spatial Indexing
 *          Uber need to be able to track the location of cars in near real-time, and provide user updates via extremely fast geo-queries.
 *          Facebook wants to let you know when your friends are nearby.
 *      Image processing
 *      Sparse data storage
 */