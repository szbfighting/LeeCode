package com.leecode.builder;

public class Test {
    public static void main(String[] args) {
        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("英特尔主板","Retina显示器");
        System.out.println(builder.create());
    }
}
