package com.dsalgo.ds.binarytree;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.*;

class BinaryTreeTest {
    @Test void initTree() {
        BinaryTree<Integer> tree = new BinaryTree<>();

        Exception exception = null;
        
        try {
            tree.root = new Node<Integer>(1);
            tree.root.lNode = new Node<Integer>(2);
            tree.root.rNode = new Node<Integer>(3);
            tree.root.lNode.lNode = new Node<Integer>(4);
            tree.root.lNode.rNode = new Node<Integer>(5);
            tree.root.rNode.rNode = new Node<Integer>(7);
        } catch (Exception e) {

        }

        assertNull(exception);
    }
}