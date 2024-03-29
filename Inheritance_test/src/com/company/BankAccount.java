package com.company;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private int balance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }


    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountHolderName, String accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void setBalance(int b){
        balance = b;
    }



    public int deposit(int amountToDeposit){
        if(amountToDeposit < 0)
            return balance;
        else
            balance+=amountToDeposit;
        return balance;

    }

    public int withdraw(int amountToWithdraw){
        balance-=amountToWithdraw;
        return balance;

    }
}
