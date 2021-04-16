package com.jiguang.treeStructure;

import com.jiguang.treeStructure.arrayBinaryTree.ArrayTree;

public class TreeTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        ArrayTree arrayTree = new ArrayTree(arr);
        arrayTree.frontShow(0);
    }
}
