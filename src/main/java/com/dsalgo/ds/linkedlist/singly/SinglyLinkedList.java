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

    /**
     * Delete all nodes having data == @param data
     */
    public void delete(int data) {

        while (head.data == data) {
            head = head.next;

            if (head == null) return;
        }

        Node currentNode = head;

        while (currentNode.next != null) {

            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;

                if (currentNode.next == null) return;
            }

            currentNode = currentNode.next;
        }
    }
}
