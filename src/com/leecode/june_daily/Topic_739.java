package com.leecode.june_daily;

public class Topic_739 {
    public int[] dailyTemperatures(int[] T) {

        int[] days = new int[T.length];
        int j;
        for (int i = 0; i < T.length; i++) {
            for (j = i; j < T.length; j++) {
                if (T[j]>T[i])
                    break;
            }
            if (j==T.length)
                days[i]=0;
            else
                days[i]=j-i;
        }
        return days;
    }
}
