package com.java.oops.abstraction;

import java.util.Date;
import java.util.logging.Logger;

public abstract class AbstractBank {
	private static final Logger log = Logger.getLogger(AbstractBank.class.getName());

	String nameOfBank;
	private long acNo;
	String IFSCcode;
	protected int balance;
	private Date dob;

	public long getAcNo() {
		return acNo;
	}

	public int getBalance() {// concrete method
		return balance;
	}

	abstract boolean deposit(int money);// method signature

	abstract int withdraw(int money);// method signature
}
