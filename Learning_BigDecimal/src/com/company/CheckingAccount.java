package com.company;

import com.company.BankAccount;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {


    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, String strBalance) {
        super(accountHolderName, accountNumber, strBalance);
    }

    @Override
    public BigDecimal withdraw(String amountToWithdraw) {
        BigDecimal amount = new BigDecimal(amountToWithdraw);
        BigDecimal balance = new BigDecimal(String.valueOf(CheckingAccount.super.getBalance()));


        BigDecimal limitAmount = new BigDecimal(-100);
        balance = balance.subtract(amount);

        if (balance.compareTo(BigDecimal.valueOf(0)) < 0 && balance.compareTo(limitAmount) > 0)
            amount = amount.add(BigDecimal.valueOf(10));
        else{
            if (balance.compareTo(limitAmount) <= 0)
                amount = BigDecimal.valueOf(0) ;
        }
        //setBalance(balance);
        return CheckingAccount.super.withdraw(amount.toPlainString());

    }


/*
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



*/



}