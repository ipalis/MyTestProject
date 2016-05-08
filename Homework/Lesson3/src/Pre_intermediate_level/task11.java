package Pre_intermediate_level;

import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter array length: ");
	    int size = input.nextInt();
	    int array[] = new int[size];
	    if (size < 3 ) {
	    	System.out.println("Array too short!");
		}
	    System.out.println("Insert array elements: ");
	    	for (int i = 0; i < size; i++) {
	        array[i] = input.nextInt();
	    	}
	    	boolean result = false;
	      for (int i = 0; i < array.length - 2; i++) {
	    	  if ((array[i] == 1) && (array[i+1] == 2) && (array[i+2] == 3)){
	    		  result = true;
	    		  break;
	    		  }  
	    	  }
	      System.out.println(result);
	      input.close();
	    }	      
	}

