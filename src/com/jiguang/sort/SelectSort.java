package com.jiguang.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,8,5,10,3,6,2,5,1,7,9};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectSort(int[] a){
        for (int i=0;i<a.length-1;i++){
            int minIndex = i;
            for (int j=i+1;j<a.length;j++){
                if (a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            if (i!=minIndex){
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }
}
