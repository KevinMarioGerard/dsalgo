package com.dsalgo.ds.linkedlist.singly;

public class SinglyLinkedList {
    Node head;

    public void traverse() {
        Node node = head;

        while (node != null) {
            System.out.printf(" %d ", node.data);

            node = node.next;
        }
    }
}
