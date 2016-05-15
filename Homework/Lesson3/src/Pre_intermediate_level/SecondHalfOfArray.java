package Pre_intermediate_level;

import java.util.Scanner;

public class SecondHalfOfArray {
	
	private int size;
	private int array[];
	
	public SecondHalfOfArray(){
	
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
	
	// function that separates and prints the second half of the array including middle element
    public void printSecondHalf() {
    	System.out.print("The second half of the array is: ");
    	for (int j = array.length/2; j < size; j++){
    		System.out.print(array[j] + " ");
    	}

    }
}