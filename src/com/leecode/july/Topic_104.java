package com.leecode.july;

public class Topic_104 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;
        System.out.println(maxDepth(root));

    }
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else
            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}


