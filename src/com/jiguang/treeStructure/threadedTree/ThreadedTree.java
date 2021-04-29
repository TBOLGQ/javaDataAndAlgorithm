package com.jiguang.treeStructure.threadedTree;

public class ThreadedTree {
    ThreadedNode root;
    ThreadedNode pre;

    public void setRoot(ThreadedNode root) {
        this.root = root;
    }

    public ThreadedNode getRoot() {
        return root;
    }

    public void threadModes(){
        threadNodes(root);
    }
    public void threadNodes(ThreadedNode node){
        if (node==null){
            return;
        }
        threadNodes(node.leftNode);
        if (node.leftNode==null){
            node.leftNode=pre;
            node.leftType=1;
        }
        if (pre!=null&&pre.rightNode==null){
            pre.rightNode=node;
            pre.rightType=1;
        }
        pre = node;
        threadNodes(node.rightNode);
    }
    public void threadIterate(){
        ThreadedNode node = root;
        while (node!=null){
            //循环找到最开始的节点
            while (node.leftType==0){
                node = node.leftNode;
            }
            System.out.println(node.value);
            while (node.rightType==1){
                node = node.rightNode;
                System.out.println(node.value);
            }
            node = node.rightNode;
        }
    }
    public void midShow(){
        root.midShow();
    }
}
