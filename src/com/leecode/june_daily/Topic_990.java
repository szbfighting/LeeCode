package com.leecode.june_daily;

public class Topic_990 {
    public boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        for (String tag :
                equations) {
            if (tag.charAt(1) == '=') {
                int index1 = tag.charAt(0)-'a';
                int index2 = tag.charAt(3)-'a';
                union(parent,index1,index2);
            }
        }

        for (String tag :
                equations) {
            if (tag.charAt(1) == '!') {
                int index1 = tag.charAt(0)-'a';
                int index2 = tag.charAt(3)-'a';
                if (find(parent,index1)==find(parent,index2)){
                    return false;
                }
            }
        }

        return true;
    }
    public void union ( int[] parent, int index1,int index2){
        parent[find(parent,index1)] = find(parent,index2);
    }

    private int find(int[] parent, int index) {
        while(parent[index] != index){
            index = parent[index];
        }

        return index;
    }
}
