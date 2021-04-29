package com.jiguang.linearStruture.queue;

import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        char c =' ';
        while (loop){
            System.out.println("s(show):显示队列");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):从队列取出数据");
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

class ArrayQueue{
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[this.maxSize];
        front = -1;  //指向队列头的前一个位置
        rear = -1;   //指向队尾的数据
    }
    public boolean isFull(){
        return rear == maxSize - 1;
    }
    public boolean isEmpty(){
        return rear == front;
    }
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列满，不能加入数据");
            return;
        }
        rear++;
        arr[rear] = n;
    }
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列为空，不能取数据");
        }
        front++;
        return arr[front];
    }
    public void show(){
        if (isEmpty()){
            System.out.println("队列为空，无法显示");
            return;
        }
        for (int i=0;i<arr.length;i++){
            System.out.printf("%d\t",arr[i]);
        }
    }
}
