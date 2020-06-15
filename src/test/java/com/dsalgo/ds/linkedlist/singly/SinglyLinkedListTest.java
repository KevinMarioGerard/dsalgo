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

    @Test void deleteAtHead() {
        list.delete(1);
        list.delete(2);

        list.traverse();
        Assertions.assertEquals("3  4", outputStream.toString().trim());
    }

    @Test void deleteAtEnd() {
        list.delete(4);
        list.delete(3);

        list.traverse();
        Assertions.assertEquals("1  2", outputStream.toString().trim());
    }

    @Test void delete() {
        list.delete(2);
        list.delete(3);

        list.traverse();
        Assertions.assertEquals("1  4", outputStream.toString().trim());
    }

    @Test void deleteUnavailableData() {
        list.delete(6);
        list.delete(5);

        list.traverse();
        Assertions.assertEquals("1  2  3  4", outputStream.toString().trim());
    }

    @Test void deleteMultipleOccurrencesOfData() {
        list.insert(new Node(1), 0);
        list.insert(new Node(1), 0);
        list.insert(new Node(2), 5);
        list.delete(2);
        list.delete(1);

        list.traverse();
        Assertions.assertEquals("3  4", outputStream.toString().trim());
    }

    @Test void deleteAtHeadPosition() {
        list.deleteNodeAtPosition(0);

        list.traverse();
        Assertions.assertEquals("2  3  4", outputStream.toString().trim());
    }

    @Test void deleteAtPosition() {
        list.deleteNodeAtPosition(2);

        list.traverse();
        Assertions.assertEquals("1  2  4", outputStream.toString().trim());
    }

    @Test void deleteNodeAtEnd() {
        list.deleteNodeAtPosition(3);

        list.traverse();
        Assertions.assertEquals("1  2  3", outputStream.toString().trim());
    }

    @Test void deleteList() {
        list.deleteList();

        list.traverse();
        Assertions.assertEquals("", outputStream.toString().trim());
        Assertions.assertNull(list.head);
    }

    @AfterEach void clearOutputStream() {
        outputStream.reset();
    }
}
