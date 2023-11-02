package cs176;

import java.util.Scanner;

public class FirstNonRepeat {

	public static int firstNonRepeat(int[] arr, int len) {
		for (int i=0; i<len; i++) {
			for (int x = 0; x<len; x++) {
				if (i != x && arr[i] == arr[x]) {
					break ;
				}
				if (x == len-1) {
					return i;
				}
				
			}
			}
		return -1;
		}

	
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
	        
		
		int len = arr.length;
		
		int nonRepeatIndex = firstNonRepeat(arr, len);
		
		if (nonRepeatIndex == -1) {
			System.out.println("There is only repeating numbers in this array.");
		} else {
			System.out.println("The first number to not repeat is "+ arr[nonRepeatIndex]);

		}
		
		arraySize.close();
		arrayElements.close();
	}

}
