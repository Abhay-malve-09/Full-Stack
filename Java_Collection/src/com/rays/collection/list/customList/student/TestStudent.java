package com.rays.collection.list.customList.student;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ram", 101, "Maths");
		Student s2 = new Student("Shyam", 104, "Phy");
		Student s3 = new Student("Aman", 103, "Chem");
		Student s4 = new Student("Uday", 102, "Bio");
		Student s5 = new Student("Raman", 106, "English");
		Student s6 = new Student("Kamlesh", 105, "Comm");
		
		List<Student> list =  new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		for(Student s : list) {
			System.out.println(s);
		}
		
	}
}
