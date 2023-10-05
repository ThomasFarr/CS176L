package cs176;

import java.util.Scanner;

public class SimpleCalc {

	public static void main(String[] args) {
		String plus = "+";
		String minus = "-";
		String multiply = "*";
		String divide = "/";
		
		Scanner firstnumber = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = firstnumber.nextInt();
		
		Scanner operator = new Scanner(System.in);
		System.out.print("Enter +,-,*,/: ");
		String sign = operator.nextLine();
		
		Scanner secondnumber = new Scanner(System.in);
		System.out.print("Enter second number: ");
		double num2 = secondnumber.nextInt();
		
		if (sign.equals(plus)) {
			System.out.printf(num1 + " " + sign + " " + num2 +" = "+ (num1 + num2));
		} else if (sign.equals(minus)){
			System.out.println(num1 + " " + sign + " " + num2 +" = "+ (num1 - num2));
		} else if (sign.equals(multiply)){
			System.out.println(num1 + " " + sign + " " + num2 +" = "+ (num1 * num2));
		} else if (sign.equals(divide)){
			if (num2 == 0) {
				System.out.println("Undefined");
			} else {
				double division = (num1 / num2);
				System.out.println(num1 + " " + sign + " " + num2 +" = "+ division);
			}
			
		}
		
		

	}

}
