package com.jiguang.linearStruture.linkedList;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode node1 = new HeroNode(1,"宋江","及时雨");
        HeroNode node2 = new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode node3 = new HeroNode(3,"吴用","智多星");
        HeroNode node4 = new HeroNode(4,"公孙胜","入云龙");
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.addNode(node1);
        linkedList.addNode(node2);
        linkedList.addNode(node3);
        linkedList.addNode(node4);
        linkedList.list();
    }
}

class SingleLinkedList{
    private HeroNode headNode = new HeroNode(0,null,null);
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
}

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