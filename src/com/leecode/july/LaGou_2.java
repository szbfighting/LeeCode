package com.leecode.july;

import java.io.IOException;

public class LaGou_2 {
    public static void main(String[] args) {
        String[] words = {"cat", "car", "city", "dog","door", "deep"};

    }

    public static boolean find(String[] words,String word){
        Word root = new Word();
        for (int i = 0;i<words.length;i++){
            insert(root,words[i]);
        }
        return false;
    }

    public static void insert(Word root,String word){
        char[] chars = word.toCharArray();
        for (int i = 0;i<chars.length;i++){
            char  ch = chars[i];
            boolean isSuccessful = false;

        }
    }

    static class Word{
        char ch;
        Word left;
        Word right;
    }

    public void testException () throws IOException {
        throw new IOException();
    }
}


