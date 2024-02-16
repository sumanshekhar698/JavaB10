package com.java.advance.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args) {
		String notesFilePath = "C:\\Users\\suman\\eclipse-workspace\\JavaB10\\notes\\sample.txt";
		String msg = "The project is simple \n and its easy to work";
//		byte [] msgArr = {};

		File file = new File(notesFilePath);
		if (file.exists()) {
			try (FileInputStream fis = new FileInputStream(file);) {
				int readChar = -1;
				while ((readChar = fis.read()) != -1) {
					System.out.print((char)readChar);
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

}
