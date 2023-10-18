package cs176;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 =0;
		int GCD = 1;
		final int maxVal = 1000;
		final int minVal = 0;
		
		while(num1>maxVal || num2>maxVal || num1<=minVal || num2<=minVal) {
			Scanner numbers = new Scanner(System.in);
			System.out.print("Enter your two numbers in form 'x,y': ");
			String bothNum = numbers.nextLine();
			bothNum = bothNum.replaceAll("\\s", "");
			String splitRedo[] = bothNum.split("[, ]");
			num1 = Integer.parseInt(splitRedo[0]);
			num2 = Integer.parseInt(splitRedo[1]);
		}
		
		for (int i=1; i<=num1 && i<= num2; i++) {
			if (num1 % i ==0 && num2 % i ==0) {
				GCD = i;
			}
		}
		
		System.out.println("GCD("+num1+","+num2+") = "+GCD);


		
		

	}

}
