package com.dsalgo.ds.binarytree;

public class Node<T> {
    
    public T data;

    public Node<T> lNode;

    public Node<T> rNode;

    public Node(T data) {
        this.data = data;
        this.lNode = null;
        this.rNode = null;
    }
}