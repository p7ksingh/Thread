package com.arr.Thread;

class Thread3 extends Thread {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

public class ThreadDenoex {
    public static void main(String[] args) throws InterruptedException {
        Thread3 t = new Thread3();
        Thread3 t1 = new Thread3();
        Thread3 t2 = new Thread3();
        t.start();
     //   t.join();
        t1.start();
     //   t1.join();
        t2.start();
     //   t2.join();
    }
}