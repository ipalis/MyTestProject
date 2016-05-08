package Pre_intermediate_level;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter array length: ");
	    int size = input.nextInt();
	    int array[] = new int[size];
	    System.out.println("Insert array elements: ");
	    	for (int i = 0; i < size; i++) {
	        array[i] = input.nextInt();
	    	}
	    	System.out.print("The second half of the array is: ");
	    	for (int j = array.length/2; j < size; j++){
	    		System.out.print(array[j] + " ");
	    	}
	    	input.close();
	}

}
