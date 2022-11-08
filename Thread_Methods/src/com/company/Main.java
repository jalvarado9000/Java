package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(Thread.activeCount()); //to check if a thread is on or off
        Thread.currentThread().setName("Pijas");
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().isAlive());





    }
}
