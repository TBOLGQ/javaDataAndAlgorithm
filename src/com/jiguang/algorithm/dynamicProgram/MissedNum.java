package com.jiguang.algorithm.dynamicProgram;

/**
 * 二分查找缺失的数字
 */
public class MissedNum {
    public int solve(int[] a){
        int start = 0;
        int end = a.length-1;
        while (true){
            if (end - start == 1){
                return end;
            }
            int mid = (start+end)/2;
            if (a[mid]>mid){
                end = mid;
            }else {
                start = mid;
            }
        }
    }
}
