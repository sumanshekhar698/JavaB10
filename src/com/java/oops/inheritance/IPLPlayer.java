package com.java.oops.inheritance;

public class IPLPlayer extends Player {

	int x = 99;
	int runs;
	int matchesPlayed;
	float strikeRate;
	int wickets;
	int jerseyNo;

	public IPLPlayer(String name, int age, int playingYears, Gender gender) {
		super(name, age, playingYears, gender);
		// TODO Auto-generated constructor stub
	}

	public IPLPlayer(String name, int age, int playingYears, Gender gender, int runs, int matchesPlayed,
			float strikeRate, int wickets, int jerseyNo) {
//		this();

		super(name, age, playingYears, gender);// call the constructor of the parent/super class

		System.out.println("Child Constructor");
		this.runs = runs;
		this.matchesPlayed = matchesPlayed;
		this.strikeRate = strikeRate;
		this.wickets = wickets;
		this.jerseyNo = jerseyNo;
	}

	@Override
	public String toString() {
		return "IPLPlayer [runs=" + runs + ", matchesPlayed=" + matchesPlayed + ", strikeRate=" + strikeRate
				+ ", wickets=" + wickets + ", jerseyNo=" + jerseyNo + ", name=" + name + ", age=" + age
				+ ", playingYears=" + playingYears + ", gender=" + gender + "]";
	}

	@Override // Annotation
	void printX() {// Method Overriding is alsoll a kind of a polymorphism, RUNTIME POLMORPHISM
		System.out.println("Child print x");
//		super.printX();
		System.out.println(x);// 99
		System.out.println(super.x);// supr means immediate parent
	}

	void sayMyJersey() {// specialized method
		System.out.println(jerseyNo);
	}

//	@Override
//	void sayMyName() {// final methods cannot be overidden
//		System.out.println("Name :: " + this.name);
//	}

}
