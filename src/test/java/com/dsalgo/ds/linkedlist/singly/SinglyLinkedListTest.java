package com.dsalgo.ds.linkedlist.singly;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class SinglyLinkedListTest {

    private SinglyLinkedList list;
    private static ByteArrayOutputStream outputStream;

    @BeforeAll static void init() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @BeforeEach void createLinkedList() {
        list = new SinglyLinkedList();
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);

        list.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
    }

    @Test void traverse() {
        list.traverse();
        Assertions.assertEquals("1  2  3  4", outputStream.toString().trim());
    }

    @Test void insertAtHead() {
        list.insert(new Node(10), 0);
        list.traverse();
        Assertions.assertEquals("10  1  2  3  4", outputStream.toString().trim());
    }

    @Test void insertAtEnd() {
        list.insert(new Node(10), 5);
        list.insert(new Node(25), 30);
        list.insert(new Node(30), 6);

        list.traverse();
        Assertions.assertEquals("1  2  3  4  10  25  30", outputStream.toString().trim());
    }

    @Test void insert() {
        list.insert(new Node(10), 2);
        list.insert(new Node(25), 5);
        list.insert(new Node(30), 5);

        list.traverse();
        Assertions.assertEquals("1  2  10  3  4  30  25", outputStream.toString().trim());
    }

    @AfterEach void clearOutputStream() {
        outputStream.reset();
    }
}
