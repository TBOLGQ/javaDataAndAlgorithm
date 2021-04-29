package com.jiguang.treeStructure.huffmanTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTest {
    public static void main(String[] args) {
        int arr[] = new int[]{3,7,8,29,5,11,23,14};
        HuffmanNode node = createHuffmanTree(arr);
        System.out.println(node);
    }
    public static HuffmanNode createHuffmanTree(int[] a){
        List<HuffmanNode> nodes = new ArrayList<>();
        for (int value:a){
            nodes.add(new HuffmanNode(value));
        }
        while (nodes.size()>1) {
            Collections.sort(nodes);
            HuffmanNode left = nodes.get(nodes.size()-1);
            HuffmanNode right = nodes.get(nodes.size()-2);
            HuffmanNode parent = new HuffmanNode(left.value+ right.value);
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
        }
        return nodes.get(0);
    }
}
