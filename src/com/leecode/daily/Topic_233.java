package com.leecode.daily;

public class Topic_233 {
    public int countDigitOne(int n) {
        if (n==0)
            return 0;

        return checkOne(n)+countDigitOne(n-1);
    }

    private int checkOne(int n) {
        int count = 0;
        while(n!=0){
            if (n%10==1)
                count++;
            n/=10;
        }

        return count;
    }
}
