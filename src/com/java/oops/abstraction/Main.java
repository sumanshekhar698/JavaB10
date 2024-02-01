package com.java.oops.abstraction;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(bank.getBalance());
		bank.deposit(-87);
		System.out.println(bank.getBalance());

	}

}
