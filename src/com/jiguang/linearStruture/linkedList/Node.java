package com.jiguang.linearStruture.linkedList;

/**
 * 单链表
 */
public class Node {
    public int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
    public void append(Node node){
        Node currentNode = this;
        while (true){
            Node nextNode = currentNode.next;
            if (nextNode==null){
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = node;
    }
    public void removeNext(){
        Node newNode = next.next;
        this.next = newNode;
    }
    public Node next(){
        return this.next;
    }
    public int getData(){
        return this.data;
    }
    public void show(){
        Node currentNode = this;
        while (true){
            System.out.println("data:"+currentNode.data);
            currentNode = currentNode.next;
            if (currentNode == null){
                break;
            }
        }
    }

    public void after(Node node){
        Node nextNode = next;
        this.next = node;
        node.next = nextNode;
    }
}
