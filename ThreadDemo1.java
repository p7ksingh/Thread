package com.arr.Thread;

class Test3 extends Thread {

}

public class ThreadDemo1 {
    public static void main(String[] args) {
        Test3 test = new Test3();
        Test3 test2 = new Test3();
        Test3 test3 = new Test3();
        System.out.println(test.getName());
        System.out.println(test2.getName());

        System.out.println(test3.getName());
        System.out.println(Thread.currentThread().getName());
        test.setName("pankaj");
        test2.setName("marrage");
        Thread.currentThread().setName("ThreadDemo");
        System.out.println(test.getName());
        System.out.println(test2.getName());
        System.out.println(Thread.currentThread().getName());
    }
}