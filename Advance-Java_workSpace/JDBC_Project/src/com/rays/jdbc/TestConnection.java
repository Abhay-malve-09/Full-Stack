package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
 public static void main(String[] args) throws Exception{
	
	 //step 1. load Driver class into the class loader
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 //step 2. Make Connection to the database
	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
	 
	 System.out.println("connection established successfully..." + conn.getCatalog());
}
}
