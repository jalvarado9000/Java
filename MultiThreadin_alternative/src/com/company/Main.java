package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyThread threadone = new MyThread();
        Thread thread1 = new Thread(threadone);

        OurThread threadtwo = new OurThread();
        Thread thread2 = new Thread(threadtwo);

        thread1.start();
        thread2.start();

    }
}
