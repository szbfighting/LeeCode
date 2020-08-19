package com.leecode.hashmap;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();

    }

    public static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

}
