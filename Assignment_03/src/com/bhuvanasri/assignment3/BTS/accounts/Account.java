package com.bhuvanasri.assignment3.BTS.accounts;
import com.bhuvanasri.assignment3.BTS.bank.*;
public abstract class Account {
	
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        Bank.incrementAccounts();  // increase total accounts
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    public String getAccountNumber() {
        return accountNumber;
    }

}