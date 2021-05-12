package com.jiguang.algorithm.dynamicProgram;

/**
 * 子数组最大和（暴力求解）
 */
public class MaxChildArrayVilate {
    public static void main(String[] args) {
        int[] arr = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int end = -1;
        int start = -1;
        for (int i=0;i< arr.length;i++){
            sum = 0;
            for (int j=i;j< arr.length;j++){
                sum += arr[j];
                if (sum>max){
                    max = sum;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println(max);
        for (int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
