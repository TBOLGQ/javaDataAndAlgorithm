package com.jiguang.sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9,6,8,7,0,1,10,4,2};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void heapSort(int[] a){
        int start = (a.length-2)/2;
        for (int i = start;i>=0;i--){
            maxHeap(a,a.length,i);
        }
        for (int j = a.length-1;j>0;j--){
            int temp = a[0];
            a[0] = a[j];
            a[j] = temp;
            maxHeap(a,j,0);
        }
    }
    public static void maxHeap(int[] a,int size,int index){
        int leftNode = 2*index+1;
        int rightNode = 2*index+2;
        int max = index;
        if (leftNode<size&&a[leftNode]>a[max]){
            max = leftNode;
        }
        if (rightNode<size&&a[rightNode]>a[max]){
            max = rightNode;
        }
        if (max!=index){
            int temp = a[index];
            a[index] = a[max];
            a[max] = temp;
            maxHeap(a,size,max);
        }
    }
}
