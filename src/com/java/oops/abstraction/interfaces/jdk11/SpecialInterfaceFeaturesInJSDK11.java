package com.java.oops.abstraction.interfaces.jdk11;

public interface SpecialInterfaceFeaturesInJSDK11 {

	private void hello() {// JDK 11 upwards
		System.out.println("Hello");
	}

	default void hi() {
		hello();
		System.out.println("Hi");

	}
}
