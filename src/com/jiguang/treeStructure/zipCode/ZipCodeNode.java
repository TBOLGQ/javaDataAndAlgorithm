package com.jiguang.treeStructure.zipCode;

public class ZipCodeNode implements Comparable<ZipCodeNode>{
    Byte data;
    int weight;
    ZipCodeNode left;
    ZipCodeNode right;

    public ZipCodeNode(Byte data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    @Override
    public int compareTo(ZipCodeNode o) {
        return -(this.weight-o.weight);
    }
}
