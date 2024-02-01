package com.java.oops.abstraction;

import java.util.logging.Logger;

public class BankImpl extends AbstractBank{
	private static final Logger log = Logger.getLogger(AbstractBank.class.getName());

	@Override
	boolean deposit(int money) {
		if (money > 0) {
			this.balance += money;
			return true;
		} else {
			log.warning("Negative balance not allowed");
			return false;
		}
	}

	@Override
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
