package com.jiguang.linearStruture.sparseArray;

public class sparseArray {
    public static void main(String[] args) {
        //创建原始数组
        int[][] chessArray1 = new int[11][11];
        chessArray1[1][2] = 1;
        chessArray1[2][3] = 2;
        System.out.println("原始的二位数组:");
        for (int[] row:chessArray1){
            for (int data:row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        //统计不为0的值的个数
        int sum = 0;
        for (int i=0;i< chessArray1.length;i++){
            for (int j=0;j<chessArray1[i].length;j++){
                if (chessArray1[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("非0值的个数:"+sum);
        //创建稀疏数组
        int[][] sparseArray = new int[sum+1][3];
        sparseArray[0][0] = chessArray1.length;
        sparseArray[0][1] = chessArray1[0].length;
        sparseArray[0][2] = sum;
        int count = 0;
        for (int i=0;i< chessArray1.length;i++){
            for (int j=0;j<chessArray1[i].length;j++){
                if (chessArray1[i][j] != 0){
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArray1[i][j];
                }
            }
        }
        System.out.println("转换后的稀疏数组:");
        for (int[] row:sparseArray){
            for (int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        //由稀疏数组恢复原始数组
        int[][] chessArray2 = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i=1;i<sparseArray.length;i++){
            chessArray2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        System.out.println("恢复后的数组:");
        for (int[] row:chessArray2){
            for (int data:row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
