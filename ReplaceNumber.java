package cs176;

import java.util.Scanner;

public class ReplaceNumber {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userString = userInput.nextLine();
		
		char userChar = userString.charAt(0);
		
		boolean numChar = Character.isDigit(userChar);
		
		
		if (numChar == true) {
			if (userChar == '0' ) {
				String removeFirst = userString.substring(1);
				String fixedString = "zero" + removeFirst;
				System.out.println(fixedString);
			} else if (userChar == '1'){
				String removeFirst = userString.substring(1);
				String fixedString = "one" + removeFirst;
				System.out.println(fixedString);
			} else if  (userChar == '2'){
				String removeFirst = userString.substring(1);
				String fixedString = "two" + removeFirst;
				System.out.println(fixedString);
			} else if  (userChar == '3'){
				String removeFirst = userString.substring(1);
				String fixedString = "three" + removeFirst;
				System.out.println(fixedString);
			} else if  (userChar == '4'){
				String removeFirst = userString.substring(1);
				String fixedString = "four" + removeFirst;
				System.out.println(fixedString);
			} else if  (userChar == '5'){
				String removeFirst = userString.substring(1);
				String fixedString = "five" + removeFirst;
				System.out.println(fixedString);
			} else if  (userChar == '6'){
				String removeFirst = userString.substring(1);
				String fixedString = "six" + removeFirst;
				System.out.println(fixedString);
			} else if  (userChar == '7'){
				String removeFirst = userString.substring(1);
				String fixedString = "seven" + removeFirst;
				System.out.println(fixedString);
			} else if  (userChar == '8'){
				String removeFirst = userString.substring(1);
				String fixedString = "eight" + removeFirst;
				System.out.println(fixedString);
			} else if  (userChar == '9'){
				String removeFirst = userString.substring(1);
				String fixedString = "nine" + removeFirst;
				System.out.println(fixedString);
			}
		} else {
			System.out.println(userString);
		}
	}

}
