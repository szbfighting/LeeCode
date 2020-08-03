package com.bilibili.thread;

import java.util.ArrayList;
import java.util.List;

public class Test {

    static List<Test> list = new ArrayList<>();
    public Test(){
        list.add(this);
        for (Test test : list) {
            System.out.println(test);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        YouTest youTest = new YouTest();
    }

}

class MyTest extends Test{

}

class YouTest extends Test{

}
