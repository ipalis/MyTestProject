package Pre_intermediate_level;

import java.util.Scanner;

public class task5 {
	
	private static boolean checkNumbers(int[] myArray) {
		for (int i = 0; i < myArray.length; i++){
			if ((myArray[i] == 7) || (myArray[i] == 9)){
				return false;
			}
		}
		 return true;
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
	    	System.out.println(checkNumbers(array));
	    	input.close();

	}

}
