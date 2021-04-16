package com.jiguang.treeStructure.arrayBinaryTree;

public class ArrayTree {
    int[] data;
    public ArrayTree(int[] data) {
        this.data = data;
    }
    public void frontShow(int index){
        if (index<data.length){
            System.out.println(data[index]);
        }
        if ((2*index+1)< data.length){
            frontShow(2*index+1);
        }
        if ((2*index+2)< data.length){
            frontShow(2*index+2);
        }
    }
}
