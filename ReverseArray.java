package cs176;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner arraySize = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int size = arraySize.nextInt();
		
		
		int arr[] = new int[size];
		Scanner arrayElements = new Scanner(System.in);
		System.out.println( "Enter the elements of the array: "); 
	        for (int i = 0; i < size; i++) { 
	        	System.out.print("at index ["+i+"] is: ");
	        	arr[i] = arrayElements.nextInt(); 
	        } 
		
		System.out.println( "The initial array is: "); 
	        for (int i = 0; i < size; i++) {
	            System.out.print(arr[i] + " "); 
	        } 
		
	        System.out.println("");
	        
		
		System.out.println("The reversed array is: ");
		for (int i=size-1; i>=0 ; i--) {
			System.out.print(arr[i] + " ");
		}
		
		arraySize.close();
		arrayElements.close();
	}

}
