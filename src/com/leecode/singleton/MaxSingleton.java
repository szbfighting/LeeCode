package com.leecode.singleton;

public class MaxSingleton {

    private MaxSingleton(){}

    public static MaxSingleton getInstance(){
        return SingletonHolder.instance;
    }

    private  static class SingletonHolder{
        private  static final MaxSingleton instance = new MaxSingleton();
    }

    public static void main(String[] args) {
        System.out.println(MaxSingleton.getInstance());
        System.out.println(MaxSingleton.getInstance());
        System.out.println(MaxSingleton.getInstance());
    }
}
