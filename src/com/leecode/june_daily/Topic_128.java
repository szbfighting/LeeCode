package com.leecode.june_daily;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 给定一个未排序的整数数组，找出最长连续序列的长度。
 *
 * 要求算法的时间复杂度为 O(n)。
 *
 * 示例:
 *
 * 输入: [100, 4, 200, 1, 3, 2]
 * 输出: 4
 * 解释: 最长连续序列是 [1, 2, 3, 4]。它的长度为 4。
 */

/**
 * Date:2020/06/06
 */
public class Topic_128 {

    /**
     * 题解一
     * 1.先将所有整数放入一个List中
     * 2.然后遍历数组中的元素，在List中对该元素向前和向后检索，如果有，则删除该元素
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        if (nums.length<2)
            return nums.length;
        int maxLength = 0;
        int tempLength = 0;
        int temp1=0,temp2=0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i]))
                continue;
            tempLength = 0;
            temp1 = nums[i];
            temp2 = nums[i]+1;
            while(list.contains(temp1)){
                tempLength++;
                list.remove(Integer.valueOf(temp1));
                temp1--;
            }

            while(list.contains(temp2)){
                tempLength++;
                list.remove(Integer.valueOf(temp2));
                temp2++;
            }
            maxLength = maxLength>tempLength?maxLength:tempLength;
        }
        return maxLength;
    }

    /**
     * 题解二
     * @param nums
     * @return
     */
    public int longestConsecutive2(int[] nums) {
        int maxLength = 0;
        int tempLength = 0,temp;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        for (int num :
                hashSet) {
            if (!hashSet.contains(num - 1)) {
                tempLength = 1;
                temp = num;
                while (hashSet.contains(++temp)) {
                    tempLength++;
                }
                maxLength = maxLength > tempLength ? maxLength : tempLength;
            }
        }
        return maxLength;
    }
}
