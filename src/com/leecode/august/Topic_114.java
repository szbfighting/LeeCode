package com.leecode.august;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Topic_114 {
    public void flatten(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        parseTree(root,nodes);
        int size = nodes.size();
        for (int i = 1; i < size; i++) {
            TreeNode pre = nodes.get(i-1),curr = nodes.get(i);
            pre.left = null;
            pre.right = curr;
        }
    }



    public void parseTree(TreeNode root, List<TreeNode> nodes){
        if (root!=null){
            nodes.add(root);
            parseTree(root.left,nodes);
            parseTree(root.right,nodes);
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }
}
