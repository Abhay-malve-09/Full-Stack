package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("D:\\iofolder\\HellO.txt", true);
		
		file.write("i am java");
		
		System.out.println("text data write successfully");
		
		file.close();
	}
}
