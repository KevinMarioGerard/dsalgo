package com.dsalgo.ds.binarytree.traversals;

import com.dsalgo.ds.binarytree.BinaryTree;
import com.dsalgo.ds.binarytree.Node;

/**
 * Depth First Traversal
 * 1. Traverse the left subtree, i.e., call Inorder(left-subtree)
 * 2. Traverse the right subtree, i.e., call Inorder(right-subtree)
 * 3. Visit the root.
 */
public class PostOrderTraversal {
    private static void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.lNode);

        postOrder(node.rNode);

        System.out.print(node.data + " ");
    }

    public static void traverse(BinaryTree tree) {
        postOrder(tree.root);
    }
}