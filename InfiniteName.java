package cs176;

import java.util.Scanner;

public class InfiniteName {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String username = name.nextLine();
		int max = 10;
		int count = 0;
		while (count < max) {
			System.out.println(username);
		}

	}

}
