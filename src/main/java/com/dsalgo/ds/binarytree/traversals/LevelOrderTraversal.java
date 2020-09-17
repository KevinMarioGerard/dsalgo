package com.dsalgo.ds.binarytree.traversals;

import java.util.LinkedList;
import java.util.Queue;

import com.dsalgo.ds.binarytree.BinaryTree;
import com.dsalgo.ds.binarytree.Node;

/**
 * Breadth First Traversal
 * Approach: Use Queue
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class LevelOrderTraversal {
    private static void levelOrder(Node node) {
        if (node == null) return;

        Queue<Node> queue = new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.lNode != null) queue.add(temp.lNode);
            if (temp.rNode != null) queue.add(temp.rNode);

            System.out.print(temp.data + " ");
        }
    }

    public static void traverse(BinaryTree tree) {
        levelOrder(tree.root);
    } 
}