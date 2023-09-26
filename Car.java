package cs176;

public class Car {
	private int gas;
	private int efficiency;
	private int distance;
		
	
	public Car(int gasefficiency) {
		gas = 0;
		efficiency = gasefficiency;
		distance = 0;
		
	}
	
	void addgas (int putingas) {  
	    gas = gas += putingas;
	}
	 
	void distancedriven(int amountdriven) {
		 distance = amountdriven;
		 
	}
	double getgasintank() {
		double gasintank = (gas - (distance / efficiency));
		return gasintank;
	}
	

	public static void main(String[] args) {
		Car mycar = new Car(20);
		mycar.addgas(20);
		mycar.distancedriven(100);
		System.out.println(mycar.getgasintank() + " gallons are in the car");
	}

}
