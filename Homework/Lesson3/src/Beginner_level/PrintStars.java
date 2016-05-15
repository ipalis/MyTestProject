package Beginner_level;

import java.util.Scanner;

public class PrintStars {
	
	int n;
	
	public PrintStars(){
		
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Input number from 1 to 9: ");
	      this.n = sc.nextInt();
	      sc.close();
	}
	
	// function that prints asterisks on growth and decrease
	public void printStars(){
		
		
		if(n >= 1 && n <= 9){
			
			// growth
	    	for(int i = 0; i < n ; i++){
	    	   for(int j = 0; j < i; j++){
	   	               System.out.print("*");
	   		   }
	    	           System.out.println("*");
	    	}
	    	
	    	//decrease
	   		for(int i = n-1; i > 0 ; i--){
    		   for(int j = 1; j < i; j++){
    			   		System.out.print("*");
		       }
		                System.out.println("*");
	   		}   
	      }
		
		else
			System.out.print("Error, please input number in range from 1 to 9!");
	}

}
