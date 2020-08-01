package com.leecode.sort;

public class ChaRu {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 1, 23, 6, 78, 34};
        sort(nums);
    }

    public static void sort(int[] nums){
        for (int i = 1;i<nums.length;i++){
            int temp = nums[i];
            int j = i-1;
            while(j>=0&&nums[j]>temp){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1] = temp;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
