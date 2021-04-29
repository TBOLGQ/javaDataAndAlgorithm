package com.jiguang.treeStructure.zipCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestZipCode {
    public static void main(String[] args) {
        String str = "can you can a can as a can caner can a can.";
        byte[] bytes = str.getBytes();
        byte[] newBytes = huffmanZip(bytes);
    }
    private static byte[] huffmanZip(byte[] bytes) {
        //将字节数组转换为节点列表
        List<ZipCodeNode> nodes = getNodes(bytes);
        //创建霍夫曼树
        ZipCodeNode node = createHuffmanTree(nodes);
        Map<Byte,String> huffmanCodes = getCodes(node);
        return null;
    }

    private static Map<Byte, String> getCodes(ZipCodeNode node) {
        return null;
    }

    private static ZipCodeNode createHuffmanTree(List<ZipCodeNode> nodes) {
        while (nodes.size()>1) {
            Collections.sort(nodes);
            ZipCodeNode left = nodes.get(nodes.size()-1);
            ZipCodeNode right = nodes.get(nodes.size()-2);
            ZipCodeNode parent = new ZipCodeNode(null, left.weight+right.weight);
            parent.left = left;
            parent.right = right;
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
        }
        return nodes.get(0);
    }

    private static List<ZipCodeNode> getNodes(byte[] bytes){
        List<ZipCodeNode> nodes = new ArrayList<>();
        Map<Byte,Integer> maps = new HashMap<>();
        for (byte data:bytes){
            Integer count = maps.get(data);
            if (count == null){
                maps.put(data,1);
            }else{
                maps.put(data,count+1);
            }
        }
        for (Map.Entry<Byte,Integer> entry:maps.entrySet()){
            nodes.add(new ZipCodeNode(entry.getKey(), entry.getValue()));
        }
        return nodes;
    }
}
