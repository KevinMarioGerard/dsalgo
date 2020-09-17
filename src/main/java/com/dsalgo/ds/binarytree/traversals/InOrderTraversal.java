package com.dsalgo.ds.binarytree.traversals;

import com.dsalgo.ds.binarytree.BinaryTree;
import com.dsalgo.ds.binarytree.Node;

/**
 * Depth First Traversal
 * 1. Traverse the left subtree, i.e., call Inorder(left-subtree)
 * 2. Visit the root.
 * 3. Traverse the right subtree, i.e., call Inorder(right-subtree)
 */
public class InOrderTraversal {
    private static void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.lNode);

        System.out.print(node.data + " ");

        inOrder(node.rNode);
    }

    public static void traverse(BinaryTree tree) {
        inOrder(tree.root);
    }
}