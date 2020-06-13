package com.leecode.june_daily;

public class Topic_70 {

        public int climbStairs(int n) {
            int[] num = new int[n+1];
            return paLouTi(0,n,num);
        }

        public  int paLouTi(int k,int n,int[] num){
            if(k>n)
                return 0;
            else if(k==n)
                return 1;
            if (num[k]>0)
                return num[k];
            num[k] = paLouTi(k+1,n,num)+paLouTi(k+2,n,num);

            return num[k];
        }

}
