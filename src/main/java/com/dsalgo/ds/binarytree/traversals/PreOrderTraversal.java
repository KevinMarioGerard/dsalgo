package com.dsalgo.ds.binarytree.traversals;

import com.dsalgo.ds.binarytree.BinaryTree;
import com.dsalgo.ds.binarytree.Node;

/**
 * Depth First Traversal
 * 1. Visit the root.
 * 2. Traverse the left subtree, i.e., call Preorder(left-subtree)
 * 3. Traverse the right subtree, i.e., call Preorder(right-subtree) 
 */
public class PreOrderTraversal {
    private static void preOrder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");

        preOrder(node.lNode);

        preOrder(node.rNode);
    }

    public static void traverse(BinaryTree tree) {
        preOrder(tree.root);
    }
}