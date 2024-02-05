package com.java.oops.abstraction;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(bank.getBalance());
		bank.deposit(-87);
		System.out.println(bank.getBalance());
		
//		AbstractBank abstractBank = new AbstractBank();//You cannot create an object of Abstract clas DIRECTLY
		BankImpl bankImpl = new BankImpl();//But You can create a object of Implementation of a Abstract class
		bankImpl.deposit(99);
		
		AbstractBank abstractBank = new AbstractBank() {//Annonymous Inner Type
			
			@Override
			int withdraw(int money) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			boolean deposit(int money) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
