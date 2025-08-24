package com.bhuvanasri.assignment3.BTS.accounts;

public class CheckingAccount extends Account {
	
	 public CheckingAccount(String accountNumber, double initialBalance) {
	        super(accountNumber, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited " + amount + " into Checking Account. Balance: " + balance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrew " + amount + " from Checking Account. Balance: " + balance);
	        } else {
	            System.out.println("Insufficient funds in Checking Account.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
}