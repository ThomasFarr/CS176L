package cs176;

import java.util.Scanner;

public class University {
	private String name;
	private int undergradstudents;
	private int percentgradrate;
	
	public University() {
		name = "Monmouth";
		undergradstudents = 4000;
		percentgradrate = 73;
		
	}
	public University(String name, int gradnumber, int percentgrad) {
		this.name = name;
		this.undergradstudents = gradnumber;
		this.percentgradrate = percentgrad;
		
	}
	
	public static void main(String[] args) {
		University monmouth = new University();
		System.out.println("The name is "+monmouth.name);
		System.out.println("The number of undergrad students is "+monmouth.undergradstudents);
		System.out.println("The percent grad rate is "+monmouth.percentgradrate);
		
		System.out.println("------------------------------------------------");
		
		University Rutgers = new University("Rutgers" , 48000 , 84);
		System.out.println("The name is "+Rutgers.name);
		System.out.println("The number of undergrad students is "+Rutgers.undergradstudents);
		System.out.println("The percent grad rate is "+Rutgers.percentgradrate);
	}
}
