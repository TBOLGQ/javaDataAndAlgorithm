package com.jiguang;

import com.jiguang.linearStruture.linkedList.Node;
import com.jiguang.linearStruture.queue.MyQueue;
import com.jiguang.linearStruture.stack.MyStack;

public class Test {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.append(node2);
        node1.append(node3);
        node2.after(new Node(4));
        node1.show();
        System.out.println(node1.next().getData());
    }
}
