package com.jiguang.query;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr0 = new int[]{1,6,23,34,56,68,71,87,111};
        int target = 23;
        int begin = 0;
        int end = arr0.length-1;
        int mid = (begin+end)/2;
        int index = -1;
        while (true){
            if (arr0[mid] == target){
                index = mid;
                break;
            }else if(arr0[mid]>target){
                mid = (begin+mid)/2;
                end = mid-1;
            }else {
                begin = mid;
                mid = (mid+end)/2;
            }
        }
        System.out.println("index:"+index);
    }
}
