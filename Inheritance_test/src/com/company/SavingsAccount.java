package com.company;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }


   public int withdraw(int amountToWithdraw) {
       int balance = getBalance();
       balance -= amountToWithdraw;
       if(balance < 150 && balance >= 2)
           amountToWithdraw+=2;
       else
       {
           if(getBalance() < amountToWithdraw)
               amountToWithdraw = 0;
       }

       return SavingsAccount.super.withdraw(amountToWithdraw);



    }


}
