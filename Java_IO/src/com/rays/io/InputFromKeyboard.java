package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputFromKeyboard {

	public static void main(String[] args) throws IOException {
		
		PrintWriter out = new PrintWriter(new FileWriter("D:\\iofolder\\.Hye1.txt", true));
		
		System.out.println("start writung text here...");
		
		InputStreamReader kb = new InputStreamReader(System.in);
		
		BufferedReader in = new BufferedReader(kb);
	
		
		String line = in.readLine();
		
		System.out.println("Output:" +line);
		
		while(!line.equals("exit")) {
				out.println(line); // write line in the file
                line = in.readLine();
	}
		
		in.close();
		out.close();
		kb.close();
}
}

