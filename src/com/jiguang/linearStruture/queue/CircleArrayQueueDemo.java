package com.jiguang.linearStruture.queue;

import java.util.Scanner;

public class CircleArrayQueueDemo {
    public static void main(String[] args) {
        CircleArrayQueue queue = new CircleArrayQueue(3);
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        char c =' ';
        while (loop){
            System.out.println("s(show):显示队列");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):从队列取出数据");
            System.out.println("h(head):获取队列头数据");
            System.out.println("e(exit):退出程序");
            c = scanner.next().charAt(0);
            switch (c){
                case 's':
                    queue.show();
                    break;
                case 'a':
                    System.out.println("请输入一个数:");
                    int i = scanner.nextInt();
                    queue.addQueue(i);
                    break;
                case 'g':
                    try {
                        int i2 = queue.getQueue();
                        System.out.println("取出的数据为:"+i2);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出~");
    }
}


/**
 * 循环数组模拟队列
 */
class CircleArrayQueue{
    private int maxSize;
    //front = 0 指向第一个元素
    private int front;
    //rear = 0  指向最后元素的后一个位置，预留一个空间
    private int rear;
    private int[] arr;
    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[this.maxSize];
    }
    public boolean isFull(){
        return (rear+1)%maxSize == front;
    }
    public boolean isEmpty(){
        return front == rear;
    }
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列满，不能加入数据");
            return;
        }
        arr[rear] = n;
        rear = (rear+1)%maxSize;
    }
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列为空，不能取数据");
        }
        int value = arr[front];
        front = (front+1)%maxSize;
        return value;
    }
    public void show(){
        if (isEmpty()){
            System.out.println("队列为空，无法显示");
            return;
        }
        for (int i=front;i<front+size();i++){
            System.out.printf("%d\t",arr[i % maxSize]);
        }
    }
    public int size(){
        return (rear+maxSize-front)%maxSize;
    }
    public int headQueue(){
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有数据~");
        }
        return arr[front];
    }
}
