package com.jiguang.linearStruture.linkedList;

public class LoopNode {
    public int data;
    LoopNode next=this;
    public LoopNode(int data){
        this.data = data;
    }
    //删除下一个节点
    public void removeNext(){
        LoopNode newNode = next.next;
        this.next = newNode;
    }
    public LoopNode next(){
        return this.next;
    }
    public int getData(){
        return this.data;
    }
    //在当前节点后插入节点
    public void after(LoopNode node){
        LoopNode nextNode = next;
        this.next = node;
        node.next = nextNode;
    }
}
