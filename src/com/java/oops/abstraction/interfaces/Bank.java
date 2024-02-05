package com.java.oops.abstraction.interfaces;

public interface Bank {//You can only have abstract methods
	
//	void hello() {
//		
//	}
	
	public static final boolean FOLLOWING_RBI_GUIDELINES  = true;//public static final  - CONSTANT
	
	 boolean deposit(int money);// abstract keyword is optional in interfcaes
	 abstract int withdraw(int money);// method signature

}
