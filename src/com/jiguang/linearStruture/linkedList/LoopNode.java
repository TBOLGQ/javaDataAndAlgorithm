package com.jiguang.linearStruture.linkedList;

public class LoopNode {
    public int data;
    LoopNode next;
    public LoopNode(int data){
        this.data = data;
    }
    //追加节点
    public void append(LoopNode node){
        LoopNode currentNode = this;
        while (true){
            LoopNode nextNode = currentNode.next;
            if (nextNode==null){
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = node;
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

    public void after(LoopNode node){
        LoopNode nextNode = next;
        this.next = node;
        node.next = nextNode;
    }
}
