package com.dsalgo.ds.linkedlist.singly;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class SinglyLinkedListTest {

    private static SinglyLinkedList list;
    private static ByteArrayOutputStream outputStream;

    @BeforeAll static void init() {
        list = new SinglyLinkedList();
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);

        list.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test void traverseLinkedList() {
        list.traverse();
        Assertions.assertEquals("1  2  3  4", outputStream.toString().trim());
    }

    @Test void traverse() {
        list.traverse();
        Assertions.assertEquals("1  2  3  4", outputStream.toString().trim());
    }

    @AfterEach void clearOutputStream() {
        outputStream.reset();
    }
}
