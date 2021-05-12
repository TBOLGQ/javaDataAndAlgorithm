package com.jiguang.linearStruture.linkedList;

public class Josepfu {
    public static void main(String[] args) {
        SingleCircleLinkedList linkedList = new SingleCircleLinkedList();
        linkedList.addNode(5);
        linkedList.countChild(1, 2, 5);
    }
}

/**
 * 单向循环链表
 * first:第一个节点
 * curNode:当前节点
 */
class SingleCircleLinkedList{
    private CircleNode first = null;
    public void addNode(int nums){
        CircleNode curNode = null;
        for (int i=1;i<=nums;i++) {
            CircleNode node = new CircleNode(i);
            if (i == 1) {
                first = node;
                first.setNext(first);
                curNode = first;
            } else {
                curNode.setNext(node);
                node.setNext(first);
                curNode = node;
            }
        }
    }
    public void show(){
        if (first == null) {
            System.out.println("没有任何节点");
        }
        CircleNode curNode = first;
        while (true) {
            System.out.printf("小孩的编号：%d\n",curNode.getNo());
            if (curNode.getNext() == first) {
                break;
            }
            curNode = curNode.getNext();
        }
    }

    /**
     * 约瑟夫问题求解
     * @param startNo 开始位置
     * @param countNum 每次数几个
     * @param nums 最初孩子数量
     */
    public void countChild(int startNo, int countNum, int nums){
        if (first == null||startNo <1||startNo > nums) {
            System.out.println("参数输入有误，请重新输入！");
            return;
        }
        CircleNode helper = first;
        while (true) {
            if (helper.getNext() == first) {
                break;
            }
            helper = helper.getNext();
        }
        //先移动到起始位置
        for (int i=0;i<startNo-1;i++) {
            first = first.getNext();
            helper = helper.getNext();
        }
        while (true) {
            if (helper == first) {
                break;
            }
            for (int i=0;i<countNum-1;i++) {
                helper = helper.getNext();
                first = first.getNext();
            }
            System.out.printf("小孩%d出圈\n",first.getNo());
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.printf("最后留在圈中的小孩编号为：%d",first.getNo());
    }
}
class CircleNode{
    private int no;
    private CircleNode next;

    public CircleNode(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public CircleNode getNext() {
        return next;
    }

    public void setNext(CircleNode next) {
        this.next = next;
    }
}
