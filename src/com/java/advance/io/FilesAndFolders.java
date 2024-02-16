package com.java.advance.io;

import java.io.File;
import java.util.Arrays;

public class FilesAndFolders {

	public static void main(String[] args) {
		
		String notesFolderPath = "C:\\Users\\suman\\eclipse-workspace\\JavaB10\\notes";
		String notesFilePath = "C:\\Users\\suman\\eclipse-workspace\\JavaB10\\notes\\notes.txt";

		
		File file = new File(notesFolderPath);
		System.out.println(file.isDirectory());
		
		if(file.isDirectory()) {
			File[] listFiles = file.listFiles();
			System.out.println(Arrays.toString(listFiles));
		}
		
		
		File file2 = new File(notesFilePath);
		System.out.println(file2.isDirectory());
		

		System.out.println(file2.isFile());
		
		

	}

}
