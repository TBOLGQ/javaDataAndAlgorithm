package com.jiguang.linearStruture.linkedList;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {

    }
}

/**
 * 双向链表：
 *  可以双向查找
 *  可以自我删除
 */
class DoubleLinkedList{
    private HeroNode2 headNode = new HeroNode2(0, "", "");

    public HeroNode2 getHeadNode() {
        return headNode;
    }
    //遍历链表
    public void list(){
        if (headNode.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode2 temp = headNode.next;
        while (true) {
            if (temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
    //在链表尾部添加节点
    public void addNode(HeroNode2 node){
        HeroNode2 temp = headNode;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;
    }
    //根据编号修改节点信息
    public void update(HeroNode2 node) {
        HeroNode2 temp = headNode;
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
        HeroNode2 temp = headNode.next;
        boolean flag = false;
        while (true) {
            if (temp == null){
                break;
            }
            if (temp.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.pre.next = temp.next;
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
        } else {
            System.out.println("要删除的节点不存在");
        }
    }
}
class HeroNode2{
    public int no;
    public String name;
    public String nickName;
    public HeroNode2 next;
    public HeroNode2 pre;

    public HeroNode2(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }
    @Override
    public String toString() {
        return "HeroNode2{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}