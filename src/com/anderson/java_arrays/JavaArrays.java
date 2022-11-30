package com.anderson.java_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArrays {

	public static void main(String[] args) {
		
		//arrayDemoOne();
		//arrayDemoTwo();
		//enhancedLoop();
		//arrayDemoThree();
		//insertElements();
		arrayBasics();
		

	}
	
	public static void arrayDemoOne() {
		
		// access array elements
		int[] age = {7,13,18,21,22,25};
		System.out.println(age.length);
		System.out.print(age[5]);
	}
	
	public static void arrayDemoTwo() {
		int[] age1 = {3,6,8,23,67,87};
		for( int i = 0; i < age1.length; i++) {
			System.out.println(age1[i]);
		}
	}
	
	public static void enhancedLoop() {
		String[] animals = { "dog", "cat", "mouse", "lion", "tiger"};
		for (String animalNames : animals) {
			System.out.println(animalNames);
		}
	}
	
	public static void arrayDemoThree() {
		int[] numbers = {-4,2,6,7,4,43,56,87,91,37};
		int sum = 0;
		Double average;
		
		// access all elements using enhanced loop, add each element to the sum
		for (int number : numbers) {
			sum += number;
		}
		
		// get the total number of elements
		int arrayLength = numbers.length;
		
		// calculate the average and convert from int to double
		average = ((double) sum / (double)arrayLength);
		
		System.out.println("sum: " + sum + " average " + average);
	}
	
	public static void insertElements() {
		int i;
		int element;
		int[] arr = new int[11];
		Scanner scan = new Scanner (System.in);
		
		System.out.print("enter 10 elements");
		for (i = 0; i < 10; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.print("enter an element to insert");
		element = scan.nextInt();
		arr[i] = element;
		
		System.out.println("\n now the new array is: ");
		for (i = 0; i < 11; i++)
			System.out.print(arr[i] + " ");
	}
	
	// 303.3.2 Array Assignment
	
	// question 1
	
	public static void arrayBasics() {
		int[] arr1 = new int [3];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
	// question 2
		int[] arr2 = {13,5,7,68,2};
		System.out.println(arr2[2]);
		
		
	// question 3
		String[] arrColors = { "red", "green", "blue", "yellow"};
		System.out.println(arrColors.length);
		String[] cloneArray = arrColors.clone();
		System.out.println(Arrays.toString(cloneArray));
		
		
	// question 5
		int[] arr3 = new int[5];
		for( int i = 0; i < arr3.length; i++) {
			arr3[i] = i;
		}
		System.out.println(Arrays.toString(arr3));
		
		
		// question 6 
		int[] arr4 = new int[5];
		for(int i = 0; i <arr4.length; i++) {
			arr4[i] = (i * 2);
			
		}
		System.out.println(Arrays.toString(arr4));
		
		
		// question 6
		int[] arr5 = new int[5];
		for( int i = 0; i < arr5.length; i++);
		
	}

}
