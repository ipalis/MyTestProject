package Beginner_level;

import java.util.Scanner;

public class elemOfArray {
	
	private int size, number, quantity;
	private int array[];
	
	
	// introduce size and elements of array and number which we are checking for
	public elemOfArray() {
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter array length: ");
	    this.size = input.nextInt();
	    this.array = new int[size];
	    System.out.println("Insert array elements: ");
	    	for (int i = 0; i < size; i++) {
	        array[i] = input.nextInt();
	    	}
	    System.out.println("Enter the number which we are checking for: ");
	    this.number = input.nextInt();
	    input.close();
	}
	
	// create function which finds quantity of number in the array
	public void findQuantity() {
		
	    	for (int i=0; i < size; i++){
	    		if (number == array[i]){
	    			    quantity++;
	    		}
	    	}
	    	System.out.println("Quantity: " + quantity); 
	}
   
}
