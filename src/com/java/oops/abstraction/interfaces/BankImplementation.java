package com.java.oops.abstraction.interfaces;

import java.util.logging.Logger;

public class BankImplementation implements Bank {

	private static final Logger log = Logger.getLogger(BankImplementation.class.getName());

	int balance;

	@Override
	public boolean deposit(int money) {
		if (money > 0) {
			this.balance += money;
			return true;
		} else {
			log.warning("Negative balance not allowed");
			return false;
		}
	}

	@Override
	public int withdraw(int money) {
		if (!(money > this.balance) && money > 0) {
			this.balance -= money;
			return money;
		} else {
			log.warning("Insufficent Funds");
			return -1;
		}

	}

}
