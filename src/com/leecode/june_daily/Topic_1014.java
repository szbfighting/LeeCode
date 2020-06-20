package com.leecode.june_daily;

public class Topic_1014 {
    public int maxScoreSightseeingPair(int[] A) {

        int res = 0,max = A[0]+0;
        for (int j = 1; j < A.length; j++) {
            res = Math.max(res,max+A[j]-j);

            max = Math.max(max,A[j]+j);
        }
        return res;
    }
}
