package com.anderson.java_strings;

import java.util.Arrays;

public class JavaStringMethods {

	public static void main(String[] args) {
		
		// length();
		
		String firstName = "Kaysie";
		String lastName = "Anderson";
		
		System.out.println(firstName.length());
		System.out.println(lastName.length());
		
		// isEmpty();
		
		String empty = "";
		String notEmpty = "this string is not empty";
		
		System.out.println(empty.isEmpty());
		System.out.println(notEmpty.isEmpty());
		
		//trim();
		String s1 = "    hello    ";
		System.out.println(s1+"how are you?");
		System.out.println(s1.trim()+" how are you?");
		
		// toLowerCase();
		
		String s2 = "KAYSIE";
		System.out.println(s2.toLowerCase());
		
		// toUpperCase();
		
		String s3 = "anderson";
		System.out.println(s3.toUpperCase());
		
		// concat();
		
		String s4 = "I am enjoying learning ";
		String s5 = "Java!";
		System.out.println(s4.concat(s5));
		
		// split();
		String letters = "abcdefg";
		String[] splitLetters = letters.split("");
		System.out.println(Arrays.toString(splitLetters));
		
		//charAt()
		String message = "this is so fun";
		String intro = "The first letter of the message is: ";
		System.out.println(intro + message.charAt(1));
		
		// compareTo();
		String s6 = "kaysie";
		String s7 = "kaysie";
		String s8 = "Kaysie";
		String s9 = "anderson";
		String s10 = "aanderson";
		
		System.out.println("Value of comparing kaysie and kaysie " + s6.compareTo(s7));
		System.out.println("Value of comparing kaysie and Kaysie " + s6.compareTo(s8));
		System.out.println("Value of comparing anderson and aanderson " + s9.compareTo(s10));
		
		// substring();
		
		String str1 = "I am learning";
		System.out.println(str1.substring(0,6));
		
		// indexOf();
		String str2 = "dogs are cool";
		System.out.println(str2.indexOf("oo"));
		
		// contains();
		
		String catString = "cats are cool too!";
		System.out.println(catString.contains("b"));
		
		//replace();
		String replaceString = "abcdefg";
		System.out.println(replaceString.replace('a', 'k'));
		
		// equals();
		String aStr = "I like coding";
		String aStr1 = "I like coding";
		String aStr2 = "I like coding too";
		System.out.println(aStr.equals(aStr1));
		System.out.println(aStr1.equals(aStr2));
		
		// == operator
		System.out.println("Are these two strings equal? " + aStr == aStr1);
		
		// compareTo()
		String lastStr = "abc";
		String lastStr1 = "abc";
		String lastStr2 = "def";
		System.out.println(lastStr.compareTo(lastStr1));
		
		
		
		

	}
	
}