package com.leecode.builder;
//Director类，负责构造Computer
public class Director {
    Builder builder = null;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(String board,String display){
        builder.buildBoard(board);
        builder.buildDisplay(display);
        builder.buildOS();
    }
}
