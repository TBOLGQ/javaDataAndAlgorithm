package com.jiguang.algorithm.dynamicProgram;

/**
 * 背包问题
 * 商品数量为4 背包容量为8
 */
public class BagProblem {
    private static int[] w = {0,2,3,4,5};
    private static int[] val = {0,3,4,5,6};
    private static int[][] v = new int[5][9];
    private static int kind = 4;
    private static int weight = 8;
    private static int[] item = new int[5];
    public static void main(String[] args) {
        for (int i=1;i <= kind; i++){
            for (int j = 1;j<=weight;j++){
                if (w[i] > j){
                    v[i][j] = v[i-1][j];
                } else {
                    v[i][j] = Math.max(v[i-1][j], val[i]+v[i-1][j-w[i]]);
                }
            }
        }
        for (int i=0;i<v.length;i++){
            for (int j=0;j<v[0].length;j++){
                System.out.print(v[i][j]+" ");
            }
            System.out.println();
        }
        findBest(4,8);
        for (int i=0;i<5;i++){
            System.out.print(item[i]+" ");
        }
    }
    public static void findBest(int i,int j){
        if (i>0){
            if (v[i][j] == v[i-1][j]){
                item[i] = 0;
                findBest(i-1,j);
            } else if (j>=w[i]&&v[i][j] == v[i-1][j-w[i]]+val[i]) {
                item[i] = 1;
                findBest(i-1, j-w[i]);
            }
        }
    }
}
