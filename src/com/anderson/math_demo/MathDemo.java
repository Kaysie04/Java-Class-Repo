package com.anderson.math_demo;

public class MathDemo {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		int a = 10, b = -20;
		System.out.println(Math.abs(a));
		System.out.println(Math.abs(b));
		System.out.println(Math.max(a,b));
		System.out.println(Math.min(a, b));
		
		double d = 83.67;
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(d));
		System.out.println(Math.rint(d));
		System.out.println(Math.round(d));
		
		double n1 = (Math.random());
		int n2 = (int) (Math.random() * 100);
		int n3 = (int) (Math.random() * 100);
		
		System.out.println(Math.round(n1));
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		int min = 100;
		int max = 1000;
		int range = (max - min) + 1;
		double d1 = Math.random() * range;
		
		
		
	
		System.out.println(range);	
		System.out.println(d1);
	}

}
