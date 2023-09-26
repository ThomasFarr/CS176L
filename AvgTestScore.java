package cs176;
import java.util.Scanner;

class Student {
	public String Name() {
		Scanner NameInput = new Scanner(System.in);
        System.out.print("Enter name:");
        
        String getName = NameInput.nextLine();
        return getName;
        
	}
}


public class AvgTestScore {
	public static void main(String[] args) {
		
		Student getName = new Student();
		String Name = getName.Name();
		
		
		
		int totalscore = 0;
		int testnumber = 1;
		while (testnumber <= 5) {
			Scanner score = new Scanner(System.in);
			System.out.print("Input score for Test " + testnumber +": ");
			totalscore += score.nextInt();
			testnumber += 1;
		}
		double average = (totalscore / 5.0);
		
		
		System.out.println(Name + " has an average of " + average);
		
		
		
        
	}

}
