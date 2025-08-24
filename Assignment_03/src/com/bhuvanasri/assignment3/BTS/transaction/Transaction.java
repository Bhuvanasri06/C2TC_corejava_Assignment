package com.bhuvanasri.assignment3.BTS.transaction;
import com.bhuvanasri.assignment3.BTS.accounts.*;
public class Transaction {
	 private final double transactionFee = 10.0;  // fixed fee

	    public final void performTransaction(Account account, String type, double amount) {
	        if (type.equalsIgnoreCase("deposit")) {
	            account.deposit(amount);
	        } else if (type.equalsIgnoreCase("withdraw")) {
	            account.withdraw(amount + transactionFee);
	            System.out.println("Transaction fee of " + transactionFee + " applied.");
	        }
	    }
}