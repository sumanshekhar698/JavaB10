package com.java.oops.exception_handling;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		System.out.println("START");
		Scanner scanner = new Scanner(System.in);
		int votingAge = scanner.nextInt();
		try {
			boolean res = checkEligiblity(votingAge);
			System.out.println(res);
		} catch (InvalidVotingAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("END");
	}

	private static boolean checkEligiblity(int votingAge) throws InvalidVotingAge {
		if (votingAge < 0 || votingAge > 130) {
			throw new InvalidVotingAge("Invalid Age Provided");
		} else if (votingAge < 18) {
			throw new InvalidVotingAge("Under Age Provided");
		}
		return true;
	}

}

class InvalidVotingAge extends Exception {

	public InvalidVotingAge(String message) {
		super(message);
	}

}
