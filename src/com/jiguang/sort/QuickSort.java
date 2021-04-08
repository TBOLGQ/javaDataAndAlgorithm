package com.jiguang.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,8,5,10,3,6,2,5,1,7,9};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] a,int begin,int end){
        if (begin<end){
            int standard = a[begin];
            int low = begin;
            int high = end;
            while (low<high){
                while (low<high&&a[high]>=standard){
                    high--;
                }
                a[low] = a[high];
                while (low<high&&a[low]<=standard){
                    low++;
                }
                a[high] = a[low];
            }
            a[low] = standard;
            quickSort(a,begin,low);
            quickSort(a,low+1,end);
        }
    }
}
