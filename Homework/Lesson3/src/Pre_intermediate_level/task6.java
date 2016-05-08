package Pre_intermediate_level;

import java.util.Scanner;

public class task6 {
	
	public static int mySum(int[] myArray){
		int outSum = 0;
		for(int i = 0; i < myArray.length; i++){
		 outSum += myArray[i];
		}
		return outSum;
	}
	
	public static double myAverage(int[] myArray){
		
		return ((double) mySum(myArray)) / myArray.length;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter array length: ");
	    int size = input.nextInt();
	    int array[] = new int[size];
	    System.out.println("Insert array elements: ");
	    	for (int i = 0; i < size; i++) {
	        array[i] = input.nextInt();
	    	}
	    	System.out.println("Sum: " + mySum(array) + " "+ "Average: " + myAverage(array));
	    	input.close();

	}

}
