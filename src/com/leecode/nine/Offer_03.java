package com.leecode.nine;

import java.util.HashSet;

public class Offer_03 {
    public static int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i:nums){
            if (!hashSet.add(i)){
                return i;
            }
        }
        return 0;
    }
}
