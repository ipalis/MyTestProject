package Intermediate_level;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		int[] numbers = readInputs(0);
		int[] result = printReversed(numbers);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
	
	public static int[] readInputs(int myArray) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter array length: ");
	    int size = input.nextInt();
	    int array[] = new int[size];
	    System.out.println("Insert array elements: ");
	    	for (int i = 0; i < size; i++) {
	        array[i] = input.nextInt();
	    	}
	    	input.close();
	    	return array;
	}
	public static int[] printReversed(int[] values) {
		int[] myArray = new  int[values.length];
		for (int i = values.length-1; i >= 0;  i--) {
			myArray[values.length - i - 1] = values[i];
		}
		return myArray;
		
	}
}