package cs176;
import java.util.Scanner;

public class BankAccount {
	private String name;
	private double balance;
	
	
	
	public BankAccount() {
		name = "Thomas";
		balance = 0.0;
		
	}
		
	public BankAccount(String newname, double newbalance) {
		name = newname;
		balance = newbalance;
		
	}
	
	double withdraw (double amount) {  
	    return balance -= amount;
	}
	 
	double deposit(double amount) {
	    return balance += amount;
	}
	
	public static void main(String[] args) {
		BankAccount Account1 = new BankAccount ("Josh", 5);
		
		System.out.println("Account Name: " + Account1.name);
		System.out.println("Account Balance: " + Account1.balance);
		
		System.out.println("Account Balance: " + Account1.withdraw(50));
		System.out.println("Account Balance: " + Account1.deposit(400));

	}

}
