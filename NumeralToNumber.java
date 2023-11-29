package cs176;

import java.util.Scanner;

public class NumeralToNumber {
	
	public static void main(String[] args) {
		final String M = "M";
		final String CM = "CM";
		final String D ="D";
		final String CD = "CD";
		final String C = "C";
		final String XC = "XC";
		final String L = "L";
		final String XL = "XL";
		final String X = "X";
		final String IX = "IX";
		final String V = "V";
		final String IV = "IV";
		final String I = "I";
		int number = 0;
		
		Scanner Numeral = new Scanner(System.in);
		System.out.print("Input: ");
		String numeral = Numeral.next().toUpperCase();
		
		String Num = numeral;
		
		while (Num.length() > 0) {
			if (Num.contains(CM) == true) {
				Num = Num.replace(CM, "");
				number += 900;
			}
			
			else if (Num.contains(CD) == true) {
				Num = Num.replace(CD, "");
				number += 400;
			}
			
			else if (Num.contains(XC) == true) {
				Num = Num.replace(XC, "");
				number += 90;
			}
			
			else if (Num.contains(XL) == true) {
				Num = Num.replace(XL, "");
				number += 40;
			}
			
			else if (Num.contains(IX) == true) {
				Num = Num.replace(IX, "");
				number += 9;
			}
			
			else if (Num.contains(IV) == true) {
				Num = Num.replace(IV, "");
				number += 4;
			}
			
			else if (Num.contains(M) == true) {
				Num = Num.replace(M, "");
				number += 1000;
			}
			
			else if (Num.contains(D) == true) {
				Num = Num.replace(D, "");
				number += 500;
			}
			
			else if (Num.contains(C) == true) {
				Num = Num.replace(C, "");
				number += 100;
			}
			
			else if (Num.contains(L) == true) {
				Num = Num.replace(L, "");
				number += 50;
			}
			
			else if (Num.contains(X) == true) {
				Num = Num.replace(X, "");
				number += 10;
			}
			
			else if (Num.contains(V) == true) {
				Num = Num.replace(V, "");
				number += 5;
			}
			
			else if (Num.contains(I) == true) {
				Num = Num.replace(I, "");
				number += 1;
			}
			
		}
		System.out.println("Output: "+ number);
		System.out.println(Num);
	}

}
