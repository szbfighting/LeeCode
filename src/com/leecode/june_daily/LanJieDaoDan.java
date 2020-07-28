package com.leecode.june_daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LanJieDaoDan {
    public static void main(String[] args) {

        int[] height = new int[100];
        int[] dp = new int[100];
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0;i<n;i++){
            height[i] = sc.nextInt();
            dp[i] = 1;
        }

        for (int i = 0;i<n;i++){
            for (int j = 0;j<i;j++){
                if (height[j]>=height[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i]>max){
                max = dp[i];
            }
        }

        System.out.println(max);
    }
}
