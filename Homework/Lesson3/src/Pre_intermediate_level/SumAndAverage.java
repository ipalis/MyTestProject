package Pre_intermediate_level;

import java.util.Scanner;

public class SumAndAverage {
	
	private int size;
	private int array[];
	
	public SumAndAverage(){
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter array length: ");
	    this.size = input.nextInt();
	    this.array = new int[size];
	    System.out.println("Insert array elements: ");
	    	for (int i = 0; i < size; i++) {
	        array[i] = input.nextInt();
	    	}
	    input.close();
    	}
    	
    //function that calculate sum of elements
	public static int mySum(int[] myArray){
		int outSum = 0;
		for(int i = 0; i < myArray.length; i++){
		 outSum += myArray[i];
		}
		return outSum;
	}
	
	//function that calculate average
	public static double myAverage(int[] myArray){
		
		return ((double) mySum(myArray)) / myArray.length;
		
	}
	//function that prints result
	public void printResult(){
    	
    	System.out.println("Sum: " + mySum(array) + " "+ "Average: " + myAverage(array));	
    }

}
