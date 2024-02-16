package com.java.advance.io;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		String notesFilePath = "C:\\Users\\suman\\eclipse-workspace\\JavaB10\\notes\\notes.txt";
		File file = new File(notesFilePath);
		
		if(file.exists()) {
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			
		}

	}

}
