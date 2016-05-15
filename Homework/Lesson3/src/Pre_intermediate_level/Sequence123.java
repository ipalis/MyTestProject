package Pre_intermediate_level;

import java.util.Scanner;

public class Sequence123 {
	
		boolean result = false;
		int size;
		int array[];
	
	public Sequence123(){
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter array length: ");
	    this.size = input.nextInt();
	    	while (!boundaryCheck()){
	    		System.out.println("Enter array length: ");
	    	    this.size = input.nextInt();
	    	};
	    System.out.println("Insert array elements: ");
	    this.array = new int[size];
		    for (int i = 0; i < size; i++) {
		      array[i] = input.nextInt();
		    }
	    input.close();
	}
	
	public boolean boundaryCheck(){
		
		if (size < 3 ) {
	    	System.out.println("Array too short!");
	    	return false;
		}
		return true;
	}
	
	
	public void findSequence(){	
    	
      for (int i = 0; i < array.length - 2; i++) {
    	  if ((array[i] == 1) && (array[i+1] == 2) && (array[i+2] == 3)){
    		  result = true;
    		  break;
    		  }  
    	  }
      System.out.println(result);
      }
      
}
