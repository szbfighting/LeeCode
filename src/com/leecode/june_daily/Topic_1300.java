package com.leecode.june_daily;

import java.util.Arrays;

/**
 * Date : 2020/06/14
 *
 */
public class Topic_1300 {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        if (target/arr.length<arr[0]){
            int avr = (int)(target/arr.length);
            return Math.abs(avr*arr.length-target)<Math.abs((avr+1)*arr.length-target)?avr:avr+1;
        }
        int value = 0,sum = 0,temp = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i==0) {
                sum += arr[i];
                temp = Math.abs(sum + arr[i] * (arr.length - i - 1) - target);
                value = arr[i];
                continue;
            }
            int avr = (target-sum)/(arr.length-i);
            avr = Math.abs(sum+avr*(arr.length-i)-target)<=Math.abs(sum+(avr+1)*(arr.length-i)-target)?avr:avr+1;
            if (avr<arr[i]){
                temp = Math.abs(sum+avr*(arr.length-i)-target);
                value = avr;
            }
            sum += arr[i];
            if (Math.abs(sum + arr[i] * (arr.length - i - 1) - target)<temp){
                temp = Math.abs(sum + arr[i] * (arr.length - i - 1) - target);
                value = arr[i];

            }
            if (sum + value * (arr.length - i - 1) - target>0)
                break;
        }
        return value;
    }
}
