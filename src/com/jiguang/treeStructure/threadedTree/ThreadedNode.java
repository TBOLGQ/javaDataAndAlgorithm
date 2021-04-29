package com.jiguang.treeStructure.threadedTree;

public class ThreadedNode {
    int value;
    ThreadedNode leftNode;
    ThreadedNode rightNode;
    int leftType;
    int rightType;
    public ThreadedNode(int value) {
        this.value = value;
    }

    public void setLeftNode(ThreadedNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(ThreadedNode rightNode) {
        this.rightNode = rightNode;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }
    public void midShow(){
        if (leftNode!=null){
            leftNode.midShow();
        }
        System.out.println(value);
        if (rightNode!=null){
            rightNode.midShow();
        }
    }
}
