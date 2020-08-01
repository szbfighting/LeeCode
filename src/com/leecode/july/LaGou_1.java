package com.leecode.july;

import java.util.HashMap;
import java.util.Map;

public class LaGou_1 {

    public static void main(String[] args) {
            int[] nums = {1,2,3,4,5,6};
            int[] result = findTarget(nums,4);
        System.out.println(result[0]+","+result[1]);
    }

    public static int[] findTarget(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for (int i = 0;i<nums.length;i++){
            if (map.containsKey(target-nums[i]))
                return new int[]{i,map.get(target-nums[i])};
        }
        return null;
    }

}
