package com.java.oops.abstraction.interfaces.jdk8;

public interface SpecialInterfaceFaeturesInJava8 {

	
	static void hello() {// JDK 8 :: static methods are allowed in Inrtefaces
		System.out.println("Hello");
	}
	
	
	default void hi() {// JDK 8 :: default methods are allowed in Intefaces TODO
		System.out.println("Hiie");
	}
	
}
