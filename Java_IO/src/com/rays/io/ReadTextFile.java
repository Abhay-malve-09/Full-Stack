package com.rays.io;

import java.io.FileReader;

public class ReadTextFile {

	public static void main(String[] args) throws Exception{
		
		FileReader file = new FileReader("D:\\iofolder\\Hello.txt");
		
		int i = file.read();
		
		while(i != -1) { //jab tak -1 nhi ayega tab tak loop chlta rhega
			// read() jab tak character milta rahega tab tak uski ASCII value return karega jab file khtm hojygi tab read() = -1 return krega .
			
			System.out.println((char) i + " = " + i); // (char) i ASCI ko charecter me convert krta he  i = prints ASCI value
			
			i = file.read(); // infinite loop na chle easliye dobara read() call kra
		
		}
		
		file.close();
	}
}
