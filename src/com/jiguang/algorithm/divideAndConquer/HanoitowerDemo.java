package com.jiguang.algorithm.divideAndConquer;

public class HanoitowerDemo {
    public static void main(String[] args) {
        hanoitower(2,'A','B','C');
    }
    public static void hanoitower(int num,char a,char b,char c){
        if (num == 1){
            System.out.println("第1个盘子从"+a+"->"+c);
        } else {
            hanoitower(num-1,a,c,b);
            System.out.println("第"+num+"个盘子从"+a+"->"+c);
            hanoitower(num-1,b,a,c);
        }
    }
}
