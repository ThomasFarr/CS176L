package cs176;

import java.util.Scanner;

public class SameName {
	
	

	public static void main(String[] args) {
		Scanner firstname = new Scanner(System.in);
		System.out.print("Enter name 1: ");
		String name1 = firstname.nextLine();
		
		Scanner secondname = new Scanner(System.in);
		System.out.print("Enter name 2: ");
		String name2 = secondname.nextLine();
		
		boolean names = name1.equals(name2);
		
		if (names == true) {
			System.out.println(name1 +" and "+ name2 +" are the same.");
		} else {
			System.out.println(name1 +" and "+ name2 +" are not the same.");
		}

	}

}
