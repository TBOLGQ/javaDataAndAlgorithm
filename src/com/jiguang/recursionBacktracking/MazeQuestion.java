package com.jiguang.recursionBacktracking;

/**
 * 递归回溯解决迷宫问题
 */
public class MazeQuestion {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for (int i=0;i< map.length;i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        for (int i=1;i<map[0].length-1;i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;

        System.out.println("地图的信息:");
        for (int i=0;i< map.length;i++) {
            for (int j=0;j<map[0].length;j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }

        getWay(map, 1, 1);
        System.out.println("走过的路径:");
        for (int i=0;i< map.length;i++) {
            for (int j=0;j<map[0].length;j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    //map[i][j]为0，表示该点没走过，1表示墙，2表示通路可以走，3表示该点走过不通
    /**
     *
     * @param map 地图
     * @param i  从哪个位置开始找
     * @param j
     * @return  如果找到返回真
     */
    public static boolean getWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            //没走过的点先设为2通路
            if (map[i][j] == 0) {
                //按照策略下->右->上->左
                map[i][j] = 2;
                //向各个方向尝试
                if (getWay(map, i+1, j)) {
                    return true;
                } else if (getWay(map, i, j+1)) {
                    return true;
                } else if (getWay(map, i-1, j)) {
                    return true;
                } else if (getWay(map, i, j-1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
