package cs176;

import java.util.Scanner;

public class NumberToNumeral {

	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		System.out.print("Input: ");
		int num = Number.nextInt();
		
		StringBuilder Numeral = new StringBuilder();
		
		Number.close();
		
		while (num > 0) {
			if (num >= 1000) {
				Numeral.append("M");
				num -= 1000;
			}
			if (num >= 900 && num <= 1000) {
				Numeral.append("CM");
				num -= 900;
			}
			if (num >= 500 && num <= 900) {
				Numeral.append("D");
				num -= 500;
			}
			if (num >= 400 && num <= 500) {
				Numeral.append("CD");
				num -= 400;
			}
			if (num >= 100 && num <= 400) {
				Numeral.append("C");
				num -= 100;
			}
			if (num >= 90 && num <= 100) {
				Numeral.append("XC");
				num -= 90;
			}
			if (num >= 50 && num <= 90) {
				Numeral.append("L");
				num -= 50;
			}
			if (num >= 40 && num <= 50) {
				Numeral.append("XL");
				num -= 40;
			}
			if (num >= 10 && num <= 40) {
				Numeral.append("X");
				num -= 10;
			}
			if (num >= 9 && num <= 10) {
				Numeral.append("IX");
				num -= 9;
			}
			if (num >= 5 && num <= 9) {
				Numeral.append("V");
				num -= 5;
			}
			if (num >= 4 && num <= 5) {
				Numeral.append("IV");
				num -= 4;
			}
			if (num >= 1 && num <= 4) {
				Numeral.append("I");
				num -= 1;
			}
			
		}
		System.out.print("Output: "+ Numeral);

	}

}
