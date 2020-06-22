package com.leecode.june_daily;

public class Interview_16_18 {
    public boolean patternMatching(String pattern, String value) {
        int count_a = 0,count_b = 0;
        for (char ch :
                pattern.toCharArray()) {
            if (ch == 'a')
                count_a++;
            else
                count_b++;
        }

        if (count_a<count_b){
            int temp = count_a;
            count_a = count_b;
            count_b = temp;
            char[] chars = pattern.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                chars[i] = chars[i]=='a'?'b':'a';
            }
            pattern = new String(chars);
        }
        if (value.length()==0){
            return count_b==0;
        }
        if (pattern.length()==0){
            return false;
        }
        for (int len_a = 0;count_a*len_a<=value.length();++len_a){
            int rest = value.length()-count_a*len_a;
            if ((count_b==0&&rest==0)||(count_b!=0&&rest%count_b==0)){
                int len_b=(count_b==0?0:rest/count_b);
                int pos = 0;
                boolean correct = true;
                String value_a = "",value_b = "";
                for (char ch :
                        pattern.toCharArray()) {
                    if (ch == 'a'){
                        String sub = value.substring(pos,pos+len_a);
                        if (value_a.length()==0){
                            value_a=sub;
                        }else if (!sub.equals(value_a)){
                            correct = false;
                            break;
                        }
                        pos+=len_a;
                    }else{
                        String sub = value.substring(pos,pos+len_b);
                        if (value_b.length()==0){
                            value_b = sub;
                        }else if (!sub.equals(value_b)){
                            correct = false;
                            break;
                        }
                        pos+=len_b;
                    }
                }
                if (correct&&!value_a.equals(value_b)){
                    return true;
                }
            }
        }
        return false;
    }
}
