package com.jiguang.algorithm.dynamicProgram;


/**
 * 爬楼梯问题
 * 递归解决：20级楼梯，可以爬到19在爬一个，或者爬到18再爬两个
 */
public class ClimbStairs {
    public static void main(String[] args) {
        int i = 20;
        int count = climb(i);
        System.out.printf("爬%d级楼梯的方案有%d种",i,count);
    }
    public static int climb(int n){
        if (n == 1){
            return 1;
        } else if (n == 2){
            return 2;
        } else {
            return climb(n-1) + climb(n-2);
        }
    }
}
