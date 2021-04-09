package com.jiguang.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,8,5,10,3,6,2,5,1,7,9};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] a){
        for (int i=1;i<a.length;i++){
            if (a[i]<a[i-1]){
                int temp = a[i];
                int j;
                for (j=i-1;j>=0&&temp<a[j];j--){
                    a[j+1]=a[j];
                }
                a[j+1]=temp;
            }
        }
    }
}
