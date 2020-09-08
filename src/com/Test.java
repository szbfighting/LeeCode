package com;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        //mt.setDaemon(true);
        mt.start();
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println(""+Thread.currentThread().getName()+"正在运行");
            }
        }
    }
}
