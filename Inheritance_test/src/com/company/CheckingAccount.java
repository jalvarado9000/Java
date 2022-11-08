package com.company;


public class CheckingAccount extends BankAccount {


    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int balance = getBalance();


        int limitAmount = -100;
        balance -= amountToWithdraw;

        if (balance < 0 && balance > limitAmount)
            amountToWithdraw+= 10;
        else{
            if (balance <= limitAmount)
                amountToWithdraw = 0;
        }
            //setBalance(balance);
            return CheckingAccount.super.withdraw(amountToWithdraw);

        }

    }

