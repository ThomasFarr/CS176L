package cs176;

import java.util.Scanner;

public class Week8 {

	public static void main(String[] args) {
		
		// Question 1
		System.out.println("Question 1");
		
		//String str = " Geeks      for Geek  s";
		Scanner enterString = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = enterString.nextLine();
		
		int stringLen = str.length();
		StringBuilder noSpaces = new StringBuilder();
		
		for (int i=0; i<stringLen; i++) {
			char inputChar = str.charAt(i);
			if (!Character.isWhitespace(inputChar)) {
				noSpaces.append(inputChar);
			}
		}
		System.out.println("String with spaces:  "+ str);
		System.out.println("String with no spaces: "+ noSpaces);
		System.out.println("---------------------------------------");
		
		// Question 2
		System.out.println("Question 2");
		Scanner inputString = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userString = inputString.nextLine();
	
		int userLen = userString.length();
		StringBuilder reverseString = new StringBuilder();
		
		for (int x=userLen-1; x>=0; x--) {
			char userChar = userString.charAt(x);
			reverseString.append(userChar);
		}
		System.out.println("String reversed: "+ reverseString);
		System.out.println("---------------------------------------");
		
		// Question 3
		System.out.println("Question 3");
		Scanner inputChar = new Scanner(System.in);
		System.out.print("Enter a character to remove: ");
		String userChar = inputChar.next();
		
		while (userChar.length() != 1) {
			System.out.println("Invalid chararacter! Enter a character to remove: ");
			userChar = inputChar.next();
		}
		String removedLetterString = userString.replaceAll(userChar,"");
		
		System.out.println("String with character in it: "+ userString);
		System.out.println("String with character removed: "+ removedLetterString);
		System.out.println("---------------------------------------");
		
		
		
		
		
		
		
		
		
		
		

	}

}
