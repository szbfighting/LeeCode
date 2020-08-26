package com.leecode.august;

import java.util.HashSet;
import java.util.List;

public class Topic_283 {


    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index]=temp;
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
