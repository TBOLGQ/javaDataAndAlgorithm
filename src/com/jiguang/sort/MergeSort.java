package com.jiguang.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,8,5,10,3,6,2,5,1,7,9};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] a,int low,int high){
        int mid = (low+high)/2;
        if (low<high){
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void merge(int[] a,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int index = 0;
        while (i<=mid&&j<=high){
            if (a[i]<=a[j]){
                temp[index++] = a[i++];
            } else {
                temp[index++] = a[j++];
            }
        }
        while (i<=mid){
            temp[index++] = a[i++];
        }
        while (j<=high){
            temp[index++] = a[j++];
        }
        for (int k=0;k<temp.length;k++){
            a[low+k] = temp[k];
        }
    }
}
