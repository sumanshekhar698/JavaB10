package com.java.oops.abstraction.interfaces;

import com.java.oops.abstraction.BankImpl;
import com.java.oops.abstraction.interfaces.jdk8.FunctionalInterface;

public class Main {

	public static void main(String[] args) {

//		Bank bank = new Bank();

		BankImplementation bankImpl = new BankImplementation();
		bankImpl.deposit(77);

		Bank bank = new Bank() {

			@Override
			public int withdraw(int money) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean deposit(int money) {
				// TODO Auto-generated method stub
				return false;
			}
		};

		FunctionalInterface functionalInterface = new FunctionalInterface() {// 2. Annonymous Inner Type

			@Override
			public void hello() {
				System.out.println("Hello 1");
			}
		};

		functionalInterface.hello();

		FunctionalInterface functionalInterface3 = () -> {// 3. Lambda fn :: the inteface should be Functional Interface
			System.out.println("Hello 3");
		};
	}

}

class Hello implements FunctionalInterface {//1. Implementation Class

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello 2");

	}

}
