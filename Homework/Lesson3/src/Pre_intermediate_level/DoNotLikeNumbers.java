package Pre_intermediate_level;

import java.util.Scanner;

public class DoNotLikeNumbers {
	
	private int size;
	private int array[];
	
	public DoNotLikeNumbers(){
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
	
	// function that print result
	public void printCheckNumbers(){
    	System.out.println(checkNumbers(array));
	}
	
	// function that checked available numbers 7 or 9
	public boolean checkNumbers(int[] myArray) {
		for (int i = 0; i < myArray.length; i++){
			if ((myArray[i] == 7) || (myArray[i] == 9)){
				return false;
			}
		}
		 return true;
	}

}
