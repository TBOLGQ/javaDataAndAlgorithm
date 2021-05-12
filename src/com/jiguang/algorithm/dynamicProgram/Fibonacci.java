package com.jiguang.algorithm.dynamicProgram;

/**
 * 动态规划实现斐波那契数列
 */
public class Fibonacci {
    public static void main(String[] args) {
        int fibonacci = fibonacci(30);
        System.out.println(fibonacci);
    }
    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            int[] dp = new int[n+1];
            dp[0] = 0;
            dp[1] = 1;
            for (int i=2;i< dp.length;i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
            return dp[n];
        }
    }
}
