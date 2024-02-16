package com.java.advance.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAFile {

	public static void main(String[] args) {
		String notesFilePath = "C:\\Users\\suman\\eclipse-workspace\\JavaB10\\notes\\sample.txt";
		String msg = "The project is simple \n and its easy to work";
//		byte [] msgArr = {};

		File file = new File(notesFilePath);
		if (file.exists()) {
			try (FileOutputStream fos = new FileOutputStream(file);) {
				fos.write(msg.getBytes());

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

}
