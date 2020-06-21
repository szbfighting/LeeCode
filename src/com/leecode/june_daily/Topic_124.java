package com.leecode.june_daily;

public class Topic_124 {

    public int maxPathSum(TreeNode root) {
        maxNode(root);
        return result;

    }

    int result = Integer.MIN_VALUE;
    public int maxNode(TreeNode node){
        if (node == null){
            return 0;
        }

        int left = Math.max(maxNode(node.left),0);
        int right = Math.max(maxNode(node.right),0);

        int max = node.val + left + right;

        result = Math.max(max,result);

        return node.val+Math.max(left,right);

    }


    static class TreeNode {
     int val;
     TreeNode left = null;
     TreeNode right = null;
     TreeNode(int x) { val = x; }
    }
}
