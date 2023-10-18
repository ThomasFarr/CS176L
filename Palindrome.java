package cs176;

import java.util.Scanner;

public class Palindrome {

	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a word or palindrome: ");
		String userString = userInput.next();
		
		String reversedStr = "";
		String lowerString = userString.toLowerCase();
		
		for (int i=0; i<userString.length(); i++) {
			reversedStr = lowerString.charAt(i) + reversedStr;
		}
		
		if (reversedStr.equals(lowerString)) {
			System.out.println(userString +" is a palindrome!");
		} else {
			System.out.println(userString +" is not a palindrome!");
		}
		
	}
		
		
}
	


