package com.company;

public class Main {

    public static void main(String[] args) {
        /*
	BankAccount bank = new BankAccount("Juan","11111110",1000);
    System.out.println(bank.getBalance());
    bank.deposit(100);
    System.out.println(bank.getBalance());
    bank.withdraw(500);
    System.out.println(bank.getBalance());

         */

    SavingsAccount bank2 = new SavingsAccount("Juan","11111110",1000);
        System.out.println(bank2.getBalance());
        bank2.deposit(100);
        System.out.println(bank2.getBalance());
        bank2.withdraw(1100);
        System.out.println(bank2.getBalance());






    }
}
