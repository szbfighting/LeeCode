package com.leecode.june_daily;

public class Topic_67 {

    public String addBinary(String a, String b) {
        if (a.length()<b.length()){
            String temp = a;
            a = b;
            b = temp;
        }
        String result = new String();
        int forward = 0;
        a=new StringBuffer(a).reverse().toString();
        b=new StringBuffer(b).reverse().toString();
        for (int i = 0; i < b.length(); i++) {
            int he = forward + a.charAt(i)-'0'+b.charAt(i)-'0';
            result+=String.valueOf(he%2);
            forward = he/2;
        }
        for (int i = b.length(); i <a.length() ; i++) {
            int he = forward + a.charAt(i)-'0';
            result+=String.valueOf(he%2);
            forward = he/2;
        }
        if (forward>0)
            result+="1";
        return new StringBuffer(result).reverse().toString();

    }

}
