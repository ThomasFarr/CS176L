package cs176;

import java.util.Scanner;

public class FirstRepeat {
	
	public static int firstRepeat(int[] arr, int len) {
		for (int i=0; i<len; i++) {
			for (int x = i+1; x<len; x++) {
				if (arr[i] == arr[x]) {
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
		int repeatIndex = firstRepeat(arr, len);
		
		if (repeatIndex == -1) {
			System.out.println("There is no repeating number in the array.");
		} else {
			System.out.println("First number that repeats is "+ arr[repeatIndex]);
		}
		
		arraySize.close();
		arrayElements.close();
	}

}
