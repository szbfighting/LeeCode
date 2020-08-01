package com.leecode.sort;

public class MaoPao {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        sort(nums);
    }

    public static void sort(int[] nums) {
        boolean isSort = true;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSort = false;
                    count++;
                }
                if (isSort)
                    break;
            }
        }
        System.out.println("count="+count);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
