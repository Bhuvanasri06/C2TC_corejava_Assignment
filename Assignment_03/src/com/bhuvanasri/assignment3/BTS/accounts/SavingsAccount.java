package com.bhuvanasri.assignment3.BTS.accounts;

public class SavingsAccount extends Account{
	

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Savings Account. Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account. Balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}