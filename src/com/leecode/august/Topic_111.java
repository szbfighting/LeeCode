package com.leecode.august;

public class Topic_111 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        a. left = new TreeNode(2);
        a.left.right = new TreeNode(4);
        a.left.left = new TreeNode(3);
        a.left.right.right = new TreeNode(5);
        System.out.println(minDepth(a));

    }
    public static  int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left==null&&root.right==null)
            return 1;
        int minDepth = Integer.MAX_VALUE;
        if (root.right!=null){
            minDepth = Math.min(minDepth(root.right),minDepth);
        }
        if (root.left!=null){
            minDepth = Math.min(minDepth(root.left),minDepth);
        }
        return 1+minDepth;
    }

    static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
}
