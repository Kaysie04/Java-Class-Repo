package com.anderson.java_encapsulation;

public class StudentDriver {

	public static void main(String[] args) {
		Student obj1 = new Student();
		System.out.println(obj1.toString());
		
		Student obj2 = new Student(123, "connor", "smith", "smith@gmail.com", "123-456-789");
		System.out.println(obj2.toString());
		

	}

}
