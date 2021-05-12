package com.jiguang.algorithm.dynamicProgram;

public class MaxChildArrayDynamic {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,5,-1,2};
        System.out.println(get(arr));
    }
    public static int get(int[] arr) {
        int max = Integer.MIN_VALUE;
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        for (int i=1;i< arr.length;i++){
            if (dp[i-1] > 0) {
                dp[i] = dp[i-1]+arr[i];
            } else {
                dp[i] = arr[i];
            }
            if (dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }

}
