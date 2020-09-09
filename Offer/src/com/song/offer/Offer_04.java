package com.song.offer;

public class Offer_04 {
    public static void main(String[] args) {
        int[][] nums = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(findNumberIn2DArray(nums,20));
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        boolean isFind = false;
        int i = 0;
        if(matrix.length==0) return false;
        int j = matrix[0].length-1;
        while(i<=matrix.length-1&&j>=0&&!isFind){
            if (matrix[i][j]==target){
                isFind = true;
            }else if(matrix[i][j]>target){
                j-=1;
            }else if(matrix[i][j]<target){
                i+=1;
            }
        }
        return isFind;
    }
}
