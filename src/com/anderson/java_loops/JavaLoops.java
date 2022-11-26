package com.anderson.java_loops;

import java.util.Scanner;

public class JavaLoops {

	public static void main(String[] args) {
		
		//displayText5Times();
		//displaySum();
		//isPalindrome();
		//pyramidExample();
		//guessNumber();
		//subtractionQuiz();
		sentinalValue();
		

	}
	
	// For Loops
	
	public static void displayText5Times() {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			System.out.println("java is fun");
			System.out.println(i);
		}
	}
	
	
	public static void displaySum() {
		int sum = 0;
		int n = 1000;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum = " + sum);
	}
	
	public static void isPalindrome() {
		String original = "";
		String reverse = "";
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a string/number");
		original = input.nextLine();
		int length = original.length();
		
		for(int i = length - 1; i >=0; i--) 
			reverse = reverse + original.charAt(i);
			
			if(original.equals(reverse)) {
				System.out.println("Palindrome");
			} else {
				System.out.println("not a palindrome");
			}
	}
	
	
	public static void pyramidExample() {
		for (int i = 1; i <= 100; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	
	// While Loops
	
	public static void guessNumber() {
		// random number that will be guessed by user
		int randomNumber = (int) (Math.random() * 101);
		Scanner userInput = new Scanner (System.in);
		System.out.println("Guess the random number between 1 - 100");
		int guess = -1;
		while( guess != randomNumber) {
			System.out.println("Enter your guess!");
			guess = userInput.nextInt();
			if (guess == randomNumber) {
				System.out.println("Correct! The random number was " + randomNumber);
			} else if (guess > randomNumber) {
				System.out.println("Your guess is too high");
			} else System.out.println("Your guess is too low");
		}
		
	}
	
	public static void subtractionQuiz() {
		final int NUMBER_OF_QUESTIONS = 5; // number of questions
		int correctCount = 0; // count number of correct answers
		int questionCount = 0; // count number of questions
		long startTime = System.currentTimeMillis();
		String output = "";
		Scanner userInput = new Scanner(System.in);
		
		while ( questionCount < NUMBER_OF_QUESTIONS) {
			
			// 1. generate two random numbers
			int randomNumber1 = (int) (Math.random() * 10);
			int randomNumber2 = (int) (Math.random() * 10);
			
			// 2. if randomNumber1 < randomNumber2 swap randomNumber1 with randomNumber2
			if (randomNumber1 < randomNumber2) {
				int tempNumber = randomNumber1;
				randomNumber1 = randomNumber2;
				randomNumber2 = tempNumber;
			}
			
			// 3. prompt the user to answer "what is randomNumber1 - randomNumber2?"
			System.out.print("What is " + randomNumber1 + " - " + randomNumber2 + "?");
			int userAnswer = userInput.nextInt();
			
			// 4. grade answer and display result
			if (randomNumber1 - randomNumber2 == userAnswer) {
				System.out.println("CORRECT!!!!!");
				correctCount++;
			} else 
				System.out.println("WRONG!!!!! The correct answer is " + (randomNumber1 -randomNumber2));
			
			// increase the questionCount
			questionCount++;
			
		}
		
	}
	
	
	public static void sentinalValue() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter int value that is not 0");
		int data = userInput.nextInt();
		
		// keep reading data until sum is 0
		int sum = 0;
		while (data != 0) {
			sum += data;
			
			// read next data input
			System.out.print("enter another int");
			data = userInput.nextInt();
		}
		System.out.println("sum is " + sum);
	}
	
	
	
}
