package com.leecode.june_daily;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic_297 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        encode(root,list);
        return Arrays.toString(list.toArray(new String[list.size()]));
    }

    public void encode(TreeNode root,List<String> list){
        if (root==null){
            list.add("null");
        }else{
            list.add(String.valueOf(root.val));
            encode(root.left,list);
            encode(root.right,list);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        data = data.substring(1,data.length()-1);
        data = data.replace(" ","");
        String[] nodes = data.split(",");
        return decode(nodes);
    }
    int index = 0;
    public TreeNode decode(String[] data){
        if ("null".equals(data[index])) return null;
        TreeNode node = new TreeNode(Integer.valueOf(data[index]));
        ++index;
        node.left = decode(data);
        ++index;
        node.right = decode(data);
        return node;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
