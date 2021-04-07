package com.jiguang.linearStruture.queue;

import java.util.Arrays;

public class MyQueue {
    int[] arr;

    public MyQueue() {
        arr = new int[0];
    }
    //入队
    public void add(int element){
        int[] newArr = new int[arr.length+1];
        for (int i=0;i< arr.length;i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = element;
        arr = newArr;
    }
    //出队
    public int poll(){
        int element = arr[0];
        int[] newArr = new int[arr.length-1];
        for (int i=0;i< newArr.length;i++){
            newArr[i] = arr[i+1];
        }
        arr = newArr;
        return element;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
