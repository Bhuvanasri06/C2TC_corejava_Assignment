package com.bhuvanasri.assignment3.BTS.mainapp;

import com.bhuvanasri.assignment3.BTS.accounts.*;
import com.bhuvanasri.assignment3.BTS.transaction.*;
import com.bhuvanasri.assignment3.BTS.bank.*;
public class MainApp {

	public static void main(String[] args) {
		 SavingsAccount sa = new SavingsAccount("S001", 5000);
	        CheckingAccount ca = new CheckingAccount("C001", 2000);

	        Transaction t = new Transaction();
	        t.performTransaction(sa, "deposit", 1000);
	        t.performTransaction(sa, "withdraw", 2000);

	        t.performTransaction(ca, "deposit", 500);
	        t.performTransaction(ca, "withdraw", 1000);

	        System.out.println("Total Accounts created: " + Bank.getTotalAccounts());

	}

}