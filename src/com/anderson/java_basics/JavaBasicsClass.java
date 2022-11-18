package com.anderson.java_basics;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class JavaBasicsClass {

	
	public static void main(String[] args) {
		displaySumOne();
		displaySumTwo();
		displaySumThree();
		displaySumFour();
		displaySumFive();
		//displaySumSix();
		displaySumSeven();
		displaySumEight();
		binaryAssignmentOne();
		binaryAssignmentTwo();
		binaryAssignmentThree();
		binaryAssignmentFour();
		binaryAssignmentFive();
		binaryAssignmentSix();

	}
	
	public static void displaySumOne() { 
		 int numberOne = 22;
		 int numberTwo = 17;
		 int sum = numberOne + numberTwo;
		System.out.println("displaySumOne value: " + sum);
		
	}
	
	public static void displaySumTwo() {
		double numberOne = 5.5;
		double numberTwo = 10.7;
		double sum = numberOne + numberTwo;
		System.out.println("displaySumTwo value: " + sum);
	}
	
	public static void displaySumThree() {
		int numberOne = 5;
		double numberTwo = 5.2;
		double sum = numberOne + numberTwo;
		System.out.println("displaySumThree value: " + sum);
	}
	
	public static void displaySumFour() {
		int numberOne = 10;
		int numberTwo = 20;
		int result = numberTwo / numberOne;
		System.out.println("displaySumFour value: " + result);
		// The system errors when the larger number is changed to a decimal because the datatype "int" can not be used for decimals. The datatype needs to be changed and the datatype of the result variable has to be changed as well.
		
	}
	
	public static void displaySumFive() {
		double numberOne = 2.3;
		double numberTwo = 5.8;
		double result = numberTwo / numberOne;
		System.out.println("displaySumFive result value: " + result);
		int resultTwo = (int) result;
		System.out.println("displaySumFive resultTwo value: " + resultTwo);
	}
	
	public static void displaySumSix() {
		int x = 5;
		int y = 6;
		//int q = y / x;
		int q = (double) y;
		System.out.println("displaySumSix value: " + q);
		
	}
	
	public static void displaySumSeven() {
		final int x = 77;
		int y = x + 23;
		System.out.println("displaySumSeven value: " + y);
	}
	
	public static void displaySumEight() {
		
		double hotLatte = 6.75;
		double donut = 1.25;
		double bagel = 4.50;
		double subtotal = (6.75 * 3) + (4 * 1.25) + (2 * 4.5);
		final double SALES_TAX = .0825;
		
		final DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.DOWN);
		double totalSale = subtotal + (subtotal * SALES_TAX);
	
		
		System.out.println("totalSale: " + df.format(totalSale));
	}
		
		public static void binaryAssignmentOne() {
			int x = 88;
			System.out.println("Decimal of x: " + x);
			System.out.println("Binary of x: " + Integer.toBinaryString(x));
			x <<= x;
			System.out.println("Decimal of x shifted left: " + x);
			System.out.println("Binary of x shifted left: " + Integer.toBinaryString(x));
		}
		
		public static void binaryAssignmentTwo() {
			int x = 150;
			System.out.println("Binary of x: " + Integer.toBinaryString(x));
			x >>= x;
			System.out.println("Binary of x shifted right: " + Integer.toBinaryString(x));
		}
		
		public static void binaryAssignmentThree() {
			int x = 7;
			int y = 17;
			int z = x | y;
			System.out.println(z);
			System.out.println(Integer.toBinaryString(z));
		}
		
		public static void binaryAssignmentFour() {
			int x = 22;
			System.out.println(x);
			x = x++;
			System.out.println(x);
		}
		
		public static void binaryAssignmentFive() {
			int x = 1;
			System.out.println("Original value of x: " + x);
			x += 1;
			System.out.println(x);
			x = ++x;
			System.out.println(x);
			x = x + 1;
			System.out.println(x);	
		}
		
		public static void binaryAssignmentSix() {
			int x;
			int y;
			x = 5;
			y = 8;
			int sum = x++ + 8;
			System.out.println(sum);
		}
	
}





