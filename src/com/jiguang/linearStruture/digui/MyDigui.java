package com.jiguang.linearStruture.digui;

public class MyDigui {
    public static void main(String[] args) {
        for (int i =1;i<=10;i++){
            System.out.println(febonacci(i));
        }
    }
    public static int febonacci(int n){
        if (n==1||n==2){
            return 1;
        } else {
            return febonacci(n-1)+febonacci(n-2);
        }
    }
}
