package com.java.oops.abstraction;

import java.util.Date;
import java.util.logging.Logger;

//import java.util.Lo;
public class Bank {

	private static final Logger log = Logger.getLogger(Bank.class.getName());

	String nameOfBank;
	private long acNo;
	String IFSCcode;
	private int balance;
	private Date dob;

	public long getAcNo() {
		return acNo;
	}

	public int getBalance() {
		return balance;
	}

	boolean deposit(int money) {
		if (money > 0) {
			this.balance += money;
			return true;
		} else {
			log.warning("Negative balance not allowed");
			return false;
		}
	}

	int withdraw(int money) {
		if (!(money > this.balance) && money > 0) {
			this.balance -= money;
			return money;
		} else {
			log.warning("Insufficent Funds");
			return -1;
		}
	}

}
