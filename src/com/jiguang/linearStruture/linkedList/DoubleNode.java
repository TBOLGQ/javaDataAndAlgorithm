package com.jiguang.linearStruture.linkedList;

public class DoubleNode {
    DoubleNode pre = this;
    DoubleNode next = this;
    int data;
    public DoubleNode(int data) {
        this.data = data;
    }
    public void after(DoubleNode node){
        //下下个节点
        DoubleNode nextNext = next;
        //四条关系线
        this.next = node;
        node.pre = this;
        node.next = nextNext;
        nextNext.pre = node;
    }
}
