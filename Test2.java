package com.arr.Thread;

public class Test2 extends Thread {

    public void run() {
        System.out.println("from run method");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Test2 t2 = new Test2();
            t2.start();
        }

    }
}
