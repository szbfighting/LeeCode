package com.leecode.august;

class FooBar {
    public static void main(String[] args) {
        FooBar fooBar = new FooBar(10);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        fooBar.bar();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        fooBar.foo();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();




    }

    private int n;
    boolean fooRun = false;
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(/*Runnable printFoo*/) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (this) {
                if (fooRun) wait();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                //printFoo.run();
                System.out.print("Foo");
                fooRun = true;
                notifyAll();
            }
        }
    }

    public void bar(/*Runnable printBar*/) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (this) {
                if (!fooRun) wait();
                // printBar.run() outputs "bar". Do not change or remove this line.
                //printBar.run();
                System.out.println("Bar");
                fooRun = false;
                notifyAll();
            }
        }
    }
}
