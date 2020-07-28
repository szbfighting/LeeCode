package com.leecode.singleton;

//CEO,饿汉单例模式
public class CEO  extends Staff{
    private static final CEO ceo = new CEO();
    //构造函数私有
    private CEO(){

    }
    //公有的静态方法，对外暴露获取单例对象的接口
    public static CEO getCEO(){
        return ceo;
    }

    public void work(){
        //管理VP
    }
}
