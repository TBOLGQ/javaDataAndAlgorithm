package com.jiguang.algorithm.search;

/**
 * 二分查找算法
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,8,10,11,67,100};
        int i = binarySearch(arr, 1);
        System.out.println("index="+i);
    }

    public static int binarySearch(int[] a,int target){
        int low = 0;
        int high = a.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (a[mid] == target){
                return mid;
            }else if (a[mid] > target){
                high = mid-1;
            }else if (a[mid] < target){
                low = mid+1;
            }
        }
        return -1;
    }
}
