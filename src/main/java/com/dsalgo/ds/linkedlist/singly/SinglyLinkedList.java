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

    /**
     * position 0 indicates insert at head of linked list
     * 0 < position < length of linked list indicates insert at middle
     * position >= length of linked list indicates insert at end
     */
    public void insert(Node node, int position) {
        if (position == 0) {
            node.next = head;
            head = node;
            return;
        }

        Node currentNode = head;
        int index = 0;

        position--;

        while (currentNode.next != null) {
            if (index >= position) {
                node.next = currentNode.next;
                currentNode.next = node;
                return;
            }

            index++;
            currentNode = currentNode.next;
        }

        currentNode.next = node;
    }
}
