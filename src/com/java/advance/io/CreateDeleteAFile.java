package com.java.advance.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateDeleteAFile {

	public static void main(String[] args) {
		String notesFilePath = "C:\\Users\\suman\\eclipse-workspace\\JavaB10\\notes\\sample.txt";
		File file = new File(notesFilePath);
		System.out.println(file.exists());

		Scanner scanner = new Scanner(System.in);
		if (!file.exists()) {
			try {
				boolean newFile = file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Do you want to delete this file " + file.getName() + " ? 1:Yes 2:No ");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				file.delete();
				break;
			case 2:
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
			System.out.println(file);

		}

	}

}
