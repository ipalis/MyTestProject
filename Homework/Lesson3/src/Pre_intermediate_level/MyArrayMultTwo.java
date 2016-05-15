package Pre_intermediate_level;

import java.util.Scanner;

public class MyArrayMultTwo {
	
	private int size;
	private int array[];
	
	public MyArrayMultTwo(){
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
	
    //function that finds min and max elements and multiply their to two
	public int[] myMinMax(int myArray[]){
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
	
	//function that prints array with result
	public void printExtr(){
	    int[] extrArray = myMinMax(array);
	    
	    for (int i = 0; i <size; i++ ) {
	    	System.out.print(extrArray[i] + " ");
	    }
	}
}
