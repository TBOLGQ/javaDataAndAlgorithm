package com.jiguang.linearStruture.linkedList;

import java.util.Stack;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode node1 = new HeroNode(1,"宋江","及时雨");
        HeroNode node2 = new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode node3 = new HeroNode(3,"吴用","智多星");
        HeroNode node4 = new HeroNode(4,"公孙胜","入云龙");
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.addByOrder(node1);
        linkedList.addByOrder(node4);
        linkedList.addByOrder(node2);
        linkedList.addByOrder(node3);

        HeroNode newNode = new HeroNode(2,"小卢","玉麒麟~~~");
        linkedList.update(newNode);

        linkedList.del(1);

        linkedList.list();
        System.out.println("链表的节点个数为："+getNodeCount(linkedList.getHeadNode()));

        System.out.println("倒数第k个节点为："+getNodeK(linkedList.getHeadNode(), 2));

        reverseLinkedList(linkedList.getHeadNode());
        linkedList.list();

        reversePrint(linkedList.getHeadNode());

    }

    //返回链表的节点个数
    public static int getNodeCount(HeroNode head){
        if (head.next == null){
            return 0;
        }
        int count = 0;
        HeroNode temp = head.next;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    //查找单链表的倒数第k个节点
    public static HeroNode getNodeK(HeroNode head,int k){
        if (head.next == null){
            return null;
        }
        int size = getNodeCount(head);
        HeroNode temp = head.next;
        if (k<=0 || k>size){
            System.out.println("查找的位置k不合理！");
            return null;
        }
        for (int i=0;i<size-k;i++){
            temp = temp.next;
        }
        return temp;
    }
    //将单链表反转
    public static void reverseLinkedList(HeroNode head){
        if (head.next == null||head.next.next == null){
            return;
        }
        HeroNode cur = head.next;
        HeroNode next = null;
        HeroNode reverseHead = new HeroNode(0,"","");
        while (cur != null) {
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        head.next = reverseHead.next;
    }
    //反转打印
    public static void reversePrint(HeroNode head){
        if (head.next == null){
            return;
        }
        Stack<HeroNode> stack = new Stack<>();
        HeroNode temp = head.next;
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}
/**
 * 单链表
 */
class SingleLinkedList{
    public HeroNode getHeadNode() {
        return headNode;
    }

    private HeroNode headNode = new HeroNode(0,null,null);
    //在链表尾部添加节点
    public void addNode(HeroNode node){
        HeroNode temp = headNode;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }
    //遍历链表
    public void list(){
        if (headNode.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = headNode.next;
        while (true) {
            if (temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
    //按顺序插入节点
    public void addByOrder(HeroNode node){
        HeroNode temp = headNode;
        boolean flag = false;   //编号是否存在的标识
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no > node.no) {
                break;
            } else if (temp.next.no == node.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("准备插入的英雄编号已存在，不能加入！");
        } else {
            node.next = temp.next;
            temp.next = node;
        }
    }
    //根据编号修改节点信息
    public void update(HeroNode node) {
        HeroNode temp = headNode;
        boolean flag = false;
        if (headNode.next == null){
            System.out.println("链表为空，无法修改！");
        }
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == node.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = node.name;
            temp.nickName = node.nickName;
        } else {
            System.out.println("未找到该编号的节点，无法修改！");
        }
    }
    //根据编号删除节点
    public void del(int no) {
        HeroNode temp = headNode;
        boolean flag = false;
        while (true) {
            if (temp.next == null){
                break;
            }
            if (temp.next.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("要删除的节点不存在");
        }
    }
}

/**
 * Hero节点
 */
class HeroNode{
    public int no;
    public String name;
    public String nickName;
    public HeroNode next;

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}