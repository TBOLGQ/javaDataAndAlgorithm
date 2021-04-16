package com.jiguang;

import com.jiguang.treeStructure.binaryTree.BinaryTree;
import com.jiguang.treeStructure.binaryTree.TreeNode;

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        binaryTree.setRoot(root);
        TreeNode rootL = new TreeNode(2);
        TreeNode rootR = new TreeNode(3);
        root.setLeftNode(rootL);
        root.setRightNode(rootR);
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
//        binaryTree.frontShow();
//        binaryTree.midShow();
        binaryTree.delete(2);
        binaryTree.frontShow();
    }
}
