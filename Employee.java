package cs176;
import java.util.Scanner;

public class Employee {
	private String EmployeeName();
	private double EmployeeSalary;
	
	
	
	public Employee(String Name, double Salary) {
		EmployeeName = Name;
		EmployeeSalary = Salary;
		
		
	}
		private String getName() {
			return Name;
		
		}
		private double getSalary() {
			return Salary;
			
		}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Please enter your salary: ");
        double Salary = sc.nextInt();
        
        Scanner getraise = new Scanner(System.in);
        System.out.print("Did you receive a raise?(true/false): ");
        boolean raise = getraise.nextBoolean();
        
        if (raise){
        	Scanner getraisepercent = new Scanner(System.in);
            System.out.print("What is the percent value: ");
            double raisepercent = getraisepercent.nextDouble();
            
            double currentsalary = Salary + (Salary * (raisepercent * 0.01));
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Past Salary: " + Salary);
            System.out.print("Employee Current Salary: " + currentsalary);
        }
        
        else {
        	System.out.println("Employee Name: " + name);
            System.out.println("Employee Past Salary: " + Salary);
        }
		
				
			}
}
