package com.jiguang.treeStructure.binaryTree;

public class BinaryTree {
    TreeNode root;
    public TreeNode getRoot() {
        return root;
    }
    public void setRoot(TreeNode root) {
        this.root = root;
    }
    public void frontShow(){
        root.frontShow();
    }
    public void midShow(){
        root.midShow();
    }
    public void afterShow(){
        root.afterShow();
    }
}
