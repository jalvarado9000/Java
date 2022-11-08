package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SavingsAccount money = new SavingsAccount("Juan","2234","500");

        System.out.println(money.getBalance());
        System.out.println(money.deposit("500"));
        System.out.println(money.getBalance());
        System.out.println(money.withdraw("997"));
        System.out.println(money.getBalance());




    }
}
