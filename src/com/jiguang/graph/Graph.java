package com.jiguang.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    private ArrayList<String> pointList;

    private int[][] edges;

    private int numOfEdges;

    private boolean[] isVisited;

    public static void main(String[] args) {
        int n = 5;
        String[] vertexs = {"A","B","C","D","E"};
        Graph graph = new Graph(5);
        for (String vertex:vertexs) {
            graph.insertVertex(vertex);
        }
        //A-B A-C B-C B-D B-E
        graph.insertEdge(0, 1, 1);
        graph.insertEdge(0, 2, 1);
        graph.insertEdge(1, 2, 1);
        graph.insertEdge(1, 3, 1);
        graph.insertEdge(1, 4, 1);
        graph.showGraph();
        System.out.println("图深度优先遍历~");
        graph.dfs();
    }

    public Graph(int n){
        pointList = new ArrayList<>(n);
        edges = new int[n][n];
        numOfEdges = 0;
        isVisited = new boolean[n];
    }

    //插入顶点
    public void insertVertex(String vertex){
        pointList.add(vertex);
    }

    //插入边
    public void insertEdge(int v1, int v2, int weight){
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }

    //获取顶点的数量
    public int getNumOfVertex(){
        return pointList.size();
    }

    //获取边的数量
    public int getNumOfEdges() {
        return numOfEdges;
    }

    //通过索引获取顶点数据
    public String getValueByIndex(int i){
        return pointList.get(i);
    }

    //获取权重
    public int getWeight(int v1, int v2){
        return edges[v1][v2];
    }
    public void showGraph(){
        for (int[] edge:edges) {
            System.out.println(Arrays.toString(edge));
        }
    }

    /**
     * 得到第一个邻接节点的下标
     * @param index
     * @return
     */
    public int getFirstNeighbor(int index){
        for (int i=0;i< pointList.size();i++) {
            if (edges[index][i] > 0) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 根据前一个邻接节点获取下一个邻接节点下标
     * @param v1
     * @param v2
     * @return
     */
    public int getNextNeighbor(int v1, int v2) {
        for (int i=v2+1;i< pointList.size();i++) {
            if (edges[v1][i] > 0) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 深度优先遍历
     * @param isVisited
     * @param i
     */
    public void dfs(boolean[] isVisited, int i) {
        //打印当前节点
        System.out.print(getValueByIndex(i)+" ");
        //是否已访问设为true
        isVisited[i] = true;
        //获取第一个邻接节点
        int w = getFirstNeighbor(i);
        while (w != -1) {
            if (!isVisited[w]) {
                dfs(isVisited, w);
            }
            w = getNextNeighbor(i, w);
        }
    }

    /**
     * 深度优先方法重载
     */
    public void dfs() {
        for (int i=0;i<getNumOfVertex();i++) {
            if (!isVisited[i]) {
                dfs(isVisited, i);
            }
        }
    }

    /**
     * 对一个节点的广度优先遍历
     * @param isVisited
     * @param i
     */
    public void bfs(boolean[] isVisited,int i) {
        int u; //队列头节点坐标
        int w; //邻接节点
        LinkedList queue = new LinkedList();
        System.out.println(i+" ");
        isVisited[i] = true;
        queue.add(i);
        while (! queue.isEmpty()) {
            u = (int) queue.removeFirst();
            w = getFirstNeighbor(u);
            while (w != -1) {
                if (!isVisited[w]) {
                    System.out.println(getValueByIndex(w)+" ");
                    isVisited[w] = true;
                    queue.addLast(w);
                }
                w = getNextNeighbor(u, w);
            }
        }
    }

    /**
     * 广度优先方法重载
     */
    public void bfs() {
        for (int i=0;i<getNumOfVertex();i++) {
            if (isVisited[i]) {
                bfs(isVisited, i);
            }
        }
    }
}
