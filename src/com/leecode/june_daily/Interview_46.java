package com.leecode.june_daily;

public class Interview_46 {

    public int translateNum(int num) {
        int count = 0;
        if (num==0){
            return 1;
        }else {
            count+=translateNum(num/10);
            if (num%100>9&&num%100<26)
                count+=translateNum(num/100);
        }
        return count;
    }
}
