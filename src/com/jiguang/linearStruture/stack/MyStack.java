package com.jiguang.linearStruture.stack;

import java.util.Arrays;

public class MyStack {
    private int[] arr;
    @Override
    public String toString() {
        return "MyStack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public MyStack() {
        arr = new int[0];
    }
    //压入元素
    public void push(int element){
        int[] newArr = new int[arr.length+1];
        for (int i=0;i< arr.length;i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = element;
        arr = newArr;
    }
    //取出栈顶元素
    public int pop(){
        if (arr.length == 0){
            throw new RuntimeException("stack is empty");
        }
        int element = arr[arr.length-1];
        int[] newArr = new int[arr.length-1];
        for (int i=0;i< arr.length-1;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
        return element;
    }
    //查看栈顶元素
    public int peek(){
        return arr[arr.length-1];
    }
    //查看是否为空
    public boolean isEmpty(){
        return arr.length==0;
    }
}
