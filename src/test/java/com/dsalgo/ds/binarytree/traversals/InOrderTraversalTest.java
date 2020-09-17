package com.dsalgo.ds.binarytree.traversals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.dsalgo.ds.binarytree.BinaryTree;
import com.dsalgo.ds.binarytree.Node;

import org.junit.jupiter.api.*;

public class InOrderTraversalTest {

    private static ByteArrayOutputStream outputStream;

    @BeforeAll static void init() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach void clearOutputStream() {
        outputStream.reset();
    }

    @Test void inOrderTraversal() {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.root = new Node<Integer>(25);
        tree.root.lNode = new Node<Integer>(15);
        tree.root.rNode = new Node<Integer>(50);
        tree.root.lNode.lNode = new Node<Integer>(10);
        tree.root.lNode.rNode = new Node<Integer>(22);
        tree.root.rNode.lNode = new Node<Integer>(35);
        tree.root.rNode.rNode = new Node<Integer>(70);
        tree.root.lNode.lNode.lNode = new Node<Integer>(4);
        tree.root.lNode.lNode.rNode = new Node<Integer>(12);
        tree.root.lNode.rNode.lNode = new Node<Integer>(18);
        tree.root.lNode.rNode.rNode = new Node<Integer>(24);
        tree.root.rNode.lNode.lNode = new Node<Integer>(31);
        tree.root.rNode.lNode.rNode = new Node<Integer>(44);
        tree.root.rNode.rNode.lNode = new Node<Integer>(66);
        tree.root.rNode.rNode.rNode = new Node<Integer>(90);

        InOrderTraversal.traverse(tree);

        Assertions.assertEquals(
            "4 10 12 15 18 22 24 25 31 35 44 50 66 70 90", 
            outputStream.toString().trim()
        );
    }

    @Test void inOrderTraversalHeadOnly() {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.root = new Node<Integer>(25);

        InOrderTraversal.traverse(tree);

        Assertions.assertEquals("25", outputStream.toString().trim());
    }

    @Test void inOrderTraversalEmptyTree() {
        BinaryTree<Integer> tree = new BinaryTree<>();

        InOrderTraversal.traverse(tree);

        Assertions.assertEquals("", outputStream.toString().trim());
    }
}