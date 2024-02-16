package com.java.advance.multithreading;

public class PrimeMinisterExample {

	public static void main(String[] args) {
		PrimeMinister electPM = PrimeMinister.electPM("Mr Modi", 60);
		System.out.println(electPM);
		System.out.println(electPM.hashCode());
		
		PrimeMinister electPM2 = PrimeMinister.electPM("Joe Biden", 60);
		System.out.println(electPM2);
		System.out.println(electPM2.hashCode());


	}

}
