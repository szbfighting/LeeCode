package com.leecode.august;

public class Topic_1114 {

    public static void main(String[] args) {
        //System.out.println(Thread.currentThread().getName());
        Runnable printFirst = new Runnable() {
            @Override
            public void run() {
                System.out.println("First");
                //System.out.println(Thread.currentThread().getName());
            }
        };
        Runnable printSecond = new Runnable() {
            @Override
            public void run() {
                System.out.println("Second");
                //System.out.println(Thread.currentThread().getName());
            }
        };
        Runnable printThird = new Runnable() {
            @Override
            public void run() {
                System.out.println("Third");
                //System.out.println(Thread.currentThread().getName());
            }
        };


            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        first(printFirst);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        third(printThird);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    second(printSecond);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
    static boolean first = false,second = false;
    static Object locker = new Object();
    public static void first(Runnable printFirst) throws InterruptedException {
        synchronized(locker) {

            printFirst.run();
            first = true;
            locker.notifyAll();
        }
    }

    public static void second(Runnable printSecond) throws InterruptedException {
        synchronized (locker) {
            while (!first){
                locker.wait();
            }

            printSecond.run();
            second = true;
            locker.notifyAll();
        }
    }

    public static void third(Runnable printThird) throws InterruptedException {

        synchronized (locker) {
            while(!second){
                locker.wait();
            }
            printThird.run();
        }
    }
}
