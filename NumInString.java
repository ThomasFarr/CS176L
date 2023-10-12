package cs176;

import java.util.Scanner;

public class NumInString {

	public static void main(String[] args) {
		int counter = 0;
		int totalDig = 0;
		Scanner userString = new Scanner(System.in);
		System.out.println("Please give me a sentence: ");
		String userInput = userString.nextLine();
		
		int length = userInput.length();
		
		
		
		while (counter < length) {
			char charInString = userInput.charAt(counter);
			boolean num = Character.isDigit(charInString);
			if (num == true) {
				totalDig +=1;
				break;
			} 
			counter +=1;
		}
		if (totalDig >=1) {
			System.out.println(userInput + " contains numerical numbers, please check again.");
		} else {
			System.out.println(userInput + " contains no numerical numbers.");
		}
			

	}

}
