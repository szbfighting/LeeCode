package com.leecode.july;

import java.util.Arrays;

public class Topic_239 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        nums = maxSlidingWindow(nums,3);
        for (int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    /*public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] num = new int[nums.length-k+1];
        for (int i = 0;i+k-1<nums.length;i++){
            int temp = max(nums,i,i+k-1);
            num[i] = temp;
        }
        return num;
    }*/

    public static int max(int[] nums,int start,int end){
        int max = nums[start];
        for (int i = start;i<=end;i++){
            if (nums[i]>max)
                max= nums[i];
        }
        return max;
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n*k==0) return new int[0];
        if (k ==1 ) return nums;

        int[] left = new int[n];
        left[0] = nums[0];
        int[] right = new int[n];
        right[n-1] = nums[n-1];
        for (int i = 1;i<n;i++){
            if (i%k==0) left[i] = nums[i];
            else left[i] = Math.max(left[i-1],nums[i]);

            int j = n-i-1;
            if ((j+1)%k==0) right[j] = nums[j];
            else right[j] = Math.max(right[j+1],nums[j]);
        }

        int[] result = new int[n-k+1];
        for (int i = 0;i<n-k+1;i++){
            result[i] = Math.max(right[i],left[i+k-1]);
        }
        return result;
     }
}
