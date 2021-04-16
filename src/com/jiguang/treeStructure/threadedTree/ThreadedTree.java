package com.jiguang.treeStructure.threadedTree;

public class ThreadedTree {
    ThreadedNode root;

    public void setRoot(ThreadedNode root) {
        this.root = root;
    }

    public ThreadedNode getRoot() {
        return root;
    }

    public void threadModes(){
        threadNodes(root);
    }
    public static void threadNodes(ThreadedNode node){
    }
}
