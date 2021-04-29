package com.jiguang.treeStructure;

import com.jiguang.treeStructure.arrayBinaryTree.ArrayTree;
import com.jiguang.treeStructure.threadedTree.ThreadedNode;
import com.jiguang.treeStructure.threadedTree.ThreadedTree;

public class TreeTest {
    public static void main(String[] args) {
        ThreadedTree threadedTree = new ThreadedTree();
        ThreadedNode root = new ThreadedNode(1);
        threadedTree.setRoot(root);
        ThreadedNode lNode = new ThreadedNode(2);
        ThreadedNode rNode = new ThreadedNode(3);
        root.setLeftNode(lNode);
        root.setRightNode(rNode);
        lNode.setLeftNode(new ThreadedNode(4));
        lNode.setRightNode(new ThreadedNode(5));
        rNode.setLeftNode(new ThreadedNode(6));
        rNode.setRightNode(new ThreadedNode(7));
        threadedTree.midShow();
        threadedTree.threadModes();
        System.out.println("=======================");
        threadedTree.threadIterate();
    }
}
