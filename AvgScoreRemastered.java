package cs176;

import java.util.Scanner;

class Student {
	public String Name() {
		Scanner NameInput = new Scanner(System.in);
        System.out.print("What is your name? ");
        
        String getName = NameInput.nextLine();
        return getName;
        
	}
}
public class AvgScoreRemastered {


	public static void main(String[] args) {
		final int MINTEST = 0;
		final int MAXSCORE = 100;
		final int MINSCORE = 0;
		double totalscore = 0;
		int testnumber = 1;
		
		Student getName = new Student();
		String Name = getName.Name();
		
		Scanner totalTests = new Scanner(System.in);
		System.out.print("hello " + Name + " how many exams have you taken? ");
		int testsTaken = totalTests.nextInt();
		
		while (testnumber <= testsTaken) {
			Scanner score = new Scanner(System.in);
			System.out.print("Give me the score for Exam " + testnumber +": ");
			int testscore = score.nextInt();
			if (testscore <= MAXSCORE && testscore >= MINSCORE) {
				totalscore += testscore;
				testnumber += 1;
			} else {
				System.out.println("Invalid Score! Please give me the score of exam "+ testnumber);
			}
		}
		double average = (totalscore / testsTaken);
		System.out.println("Hi, "+ Name + ", your average score of "+ testsTaken +" is "+ average);
		}
		
		
		

	}


