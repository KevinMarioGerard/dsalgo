package com.dsalgo.ds.binarytree;

public class Node<T> {
    
    T data;

    Node<T> lNode;

    Node<T> rNode;

    public Node(T data) {
        this.data = data;
        this.lNode = null;
        this.rNode = null;
    }
}