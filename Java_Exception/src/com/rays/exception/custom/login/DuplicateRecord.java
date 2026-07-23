package com.rays.exception.custom.login;

public class DuplicateRecord {
		public static void main(String[] args) {
			
			String name = "Anuj1";
			if(name.equals("Anuj")) {
				System.out.println("Record found");
			} else {
				throw new TestDuplicateRecordException();
			}
		}
	}

