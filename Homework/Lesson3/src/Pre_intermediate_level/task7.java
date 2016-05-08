package Pre_intermediate_level;

import java.util.Scanner;

public class task7 {
	
	private static int[] myMinMax(int myArray[]){
		int max = myArray[0];
		int min = myArray[0];
		int maxPosition = 0;
		int minPosition = 0;
			for(int j=1; j < myArray.length; j++){
				if (max < myArray[j]){
					max = myArray[j];
					maxPosition = j;
				}
				if (min > myArray[j]){
					min = myArray[j];
					minPosition = j;
				}
			}
			myArray[maxPosition] *= 2;
			myArray[minPosition] *= 2;
			return myArray;
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
	    int[] extrArray = myMinMax(array);
	    
	    for (int i = 0; i <size; i++ ) {
	    	System.out.print(extrArray[i] + " ");
	    }
	    input.close();
	}

}
