package com.leecode.june_daily;

public class Topic_209 {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length==0)
            return 0;
        int start = 0, end = 0,sum = 0,min = Integer.MAX_VALUE;
        while(end<nums.length){
            sum+=nums[end];
            while (sum>=s){
                min = Math.min(end - start + 1, min);
                sum-=nums[start];
                start++;
            }
            end++;

        }
        return min == Integer.MAX_VALUE?0:min;
    }
}
