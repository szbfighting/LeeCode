package com.leecode.august;

public class Topic_647 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(countSubstrings(s));
    }

    public static int countSubstrings(String s) {
        //odd:奇数长度回文串
        //even:偶数长度回文串
        int odd ,even;
        int n = s.length();
        int count = 0;
        for (odd = 0,even = 0;odd<n;odd++,even++){
            int start = odd,end = odd;
            while(start>=0&&end<n&&s.charAt(start--)==s.charAt(end++)){
                count++;
            }
            start = even;
            end = even+1;
            while(start>=0&&end<n&&s.charAt(start--)==s.charAt(end++)){
                count++;
            }
        }
        return count;
    }
}

