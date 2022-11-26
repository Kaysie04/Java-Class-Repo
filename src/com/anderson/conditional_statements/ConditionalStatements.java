package com.anderson.conditional_statements;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		//question1();
		//question2();
		//question3();
		//question4();
		//question5();
		//question6();
		
		
		

	}
	
	public static void question1() {
		int x;
		x = 90;
		if( x < 10) {
			System.out.println("Less than 10");
		}
		
	}
	
	public static void question2() {
		int x;
		x = 11;
		if(x < 10) {
			System.out.println("Less than 10");
		} else System.out.println("Greater than 10");
	}
	
	public static void question3() {
		int x;
		x = 100;
		if (x < 10) {
			System.out.println("Less than 10");
		} else if ( x > 10 && x < 20) {
			System.out.println("Greater than 10 but less than 20");
			
		} else if ( x >=20) {
			System.out.println("Greater than or equal to 20");
		}
	}
		
	public static void question4() {
		int x;
		x = 21;
		if (x < 10 || x > 20) {
			System.out.println("Out of range");
			
		} else if ( x >=10 && x <=20) {
			System.out.println("In range");
		}
	}
		
		public static void question5() {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter your number score");
			int grade = userInput.nextInt();
			if (grade >= 90 && grade <= 100) {
				System.out.print("A");
				
			} else if ( grade >= 80 && grade <= 89) {
				System.out.print("B");
			} else if  ( grade >70 && grade <= 79) {
				System.out.println("C");
			} else if  ( grade >= 60 && grade <= 69) {
				System.out.println("D");
			} else if (grade < 60) {
				System.out.println("F did you even try?");
			} else if (grade < 0 || grade > 100) {
				System.out.println("Score out of range");
			}	
		}
		
		public static void question6() {
			Scanner userNumber = new Scanner(System.in);
			System.out.println("enter a number between 1 and 7");
			int weekday = userNumber.nextInt();
			
			switch(weekday) {
			case 1: 
				System.out.println("Monday");
				break;
			case 2: 
				System.out.println("Tuesday");
				break;
			case 3: 
				System.out.println("Wednesday");
				break;
			case 4: 
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7: 
				System.out.println("Sunday");
				break;
				
			default: System.out.println("Must enter a number 1 -7");
			}
			
		}
		
		public static void question7() {
			
		}
		
	}


