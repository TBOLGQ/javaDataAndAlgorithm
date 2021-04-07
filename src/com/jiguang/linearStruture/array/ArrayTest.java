package com.jiguang.linearStruture.array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{9,8,7};
        System.out.println(Arrays.toString(arr1));
        int[] newArr1 = new int[arr1.length+1];
        for (int i=0;i< arr1.length;i++){
            newArr1[i+1] = arr1[i];
        }
        newArr1[arr1.length] = 6;
        arr1 = newArr1;
        System.out.println(Arrays.toString(arr1));
    }
}
