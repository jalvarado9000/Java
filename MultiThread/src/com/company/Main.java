package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyThread Thread1 = new MyThread();
        OtherThread Thread2 = new OtherThread();

        Thread1.start();
        Thread2.start();


    }
}
