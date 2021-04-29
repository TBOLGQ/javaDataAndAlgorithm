package com.jiguang.treeStructure.huffmanTree;

public class HuffmanNode implements Comparable<HuffmanNode>{
    int value;
    HuffmanNode left;
    HuffmanNode right;

    public HuffmanNode(int value) {
        this.value = value;
    }


    @Override
    public int compareTo(HuffmanNode o) {
        return -(this.value-o.value);
    }

    @Override
    public String toString() {
        return "HuffmanNode{" +
                "value=" + value +
                '}';
    }
}
