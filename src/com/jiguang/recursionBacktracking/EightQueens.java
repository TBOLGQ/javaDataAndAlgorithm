package com.jiguang.recursionBacktracking;

/**
 * 八皇后问题
 */
public class EightQueens {
    int max = 8;

    int[] array = new int[max];

    static int count = 0;

    public static void main(String[] args) {
        EightQueens queens = new EightQueens();
        queens.check(0);
        System.out.printf("八皇后共有%d种解法~", count);
    }

    /**
     *
     * @param n
     */
    private void check(int n) {
        if (n == max) {
            print();
            return;
        }
        for (int i=0;i<max;i++) {
            array[n] = i;
            if (judge(n)) {
                check(n+1);
            }
        }
    }

    /**
     * 放置第n个皇后，判断是否和之前的冲突
     * @param n
     * @return
     */
    private boolean judge(int n) {
        for (int i=0;i<n;i++) {
            //判断同一列
            //判断一条直线：横向距离是否等于纵向距离
            if (array[i] == array[n]||Math.abs(n-i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    private void print() {
        count++;
        for (int i=0;i<max;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
