package com.song.offer;

public class Offer_05 {
    public static void main(String[] args) {
        String s = "we are family.";
        System.out.println(replaceSpace(s));
    }

    public static String replaceSpace(String s) {
        return s.replace(" ","%20");
    }
}
