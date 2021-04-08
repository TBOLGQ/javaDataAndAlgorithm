package com.jiguang.linearStruture.digui;

public class MyHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
    public static void hanoi(int n,char from,char mid,char to){
        if (n==1){
            System.out.println("第1个盘子从"+from+"移到"+to);
        } else {
            hanoi(n-1,from,to,mid);
            System.out.println("第"+n+"个盘子从"+from+"移到"+to);
            hanoi(n-1,mid,from,to);
        }
    }
}
