package cs176;

public class StudentGrade {
	private int grade;
	private String name;
	final int defaultgrade = 60;
	final int maximumgrade = 100;
	final int minimumgrade = 0;
	final int Agrade = 90;
	final int Bgrade = 80;
	final int Cgrade = 70;
	final int Dgrade = 60;
	
	
	public StudentGrade(String name) {
		grade = defaultgrade;
		this.name = name;
	}
	
	public StudentGrade(String studentname, int studentgrade) {
		name = studentname;
		grade = studentgrade;
		
	}
	
	public void setGrade(int grade) {
		if (grade <= maximumgrade && grade >= minimumgrade) {
			this.grade = grade;
		} else {
			this.grade = defaultgrade;
		}
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getgradelevel() {
		String a = "A";
		String b = "B";
		String c = "C";
		String d = "D";
		String f = "F";
		
		if (grade >= Agrade) {
			return a;
		} else if (grade < Agrade && grade >= Bgrade) {
			return b;
		} else if (grade < Bgrade && grade >= Cgrade) {
			return c;
		} else if (grade < Cgrade && grade >= Dgrade) {
			return d;
		} else {
			return f;
		}
	}
	
	

	public static void main(String[] args) {
		StudentGrade Josh = new StudentGrade("Josh");
		StudentGrade Thomas = new StudentGrade("Thomas", 95);
		System.out.println(Thomas.getGrade());
		System.out.println(Josh.getGrade());
		
		Josh.setGrade(-50);
		System.out.println(Josh.getGrade());
		Josh.setGrade(150);
		System.out.println(Josh.getGrade());
		Josh.setGrade(88);
		System.out.println(Josh.getGrade());
		
		System.out.println(Thomas.getgradelevel());
		System.out.println(Josh.getgradelevel());
		Josh.setGrade(77);
		System.out.println(Josh.getgradelevel());
		Josh.setGrade(64);
		System.out.println(Josh.getgradelevel());
		Josh.setGrade(44);
		System.out.println(Josh.getgradelevel());
		
	}

}
