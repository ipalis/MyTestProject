package Intermediate_level;

import java.util.Scanner;

public class ReversedArray {
		
		private int size;
		private int array[], numbers[], result[], myArray[];
	
	public ReversedArray(){
		
	}
		
	//function that reads input
	public int[] readInputs(int myArray) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter array length: ");
	    this.size = input.nextInt();
	    this.array = new int[size];
	    System.out.println("Insert array elements: ");
	    	for (int i = 0; i < size; i++) {
	        array[i] = input.nextInt();
	    	}
	    input.close();
	    return this.array;
	}
	
	//function that does revers array
	public int[] printReversed(int[] values) {
		this.myArray = new  int[values.length];
		for (int i = values.length-1; i >= 0;  i--) {
			myArray[values.length - i - 1] = values[i];
		}
		return myArray;
	}
		
	//function that prints result
	public void printResult(){
		this.numbers = readInputs(0);
		this.result = printReversed(numbers);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}

}
