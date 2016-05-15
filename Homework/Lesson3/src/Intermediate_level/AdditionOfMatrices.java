package Intermediate_level;

import java.util.Scanner;

public class AdditionOfMatrices {
	
		private int m, n, c, d;
		private int first[][], second[][], sum[][];
		
	//constructor
	public AdditionOfMatrices(){
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the number of rows and columns of matrix");
	    this.m = in.nextInt();
	    this.n = in.nextInt();
	   
	    this.first = new int[m][n];
	    this.second = new int[m][n];
	    this.sum = new int[m][n];
	   
	    System.out.println("Enter the elements of first matrix");
	    for (c = 0 ; c < m ; c++){
	       for (d = 0 ; d < n ; d++){
	          first[c][d] = in.nextInt();
	       }
	    }
	
	    System.out.println("Enter the elements of second matrix");
	    for (c = 0 ; c < m ; c++){
	       for (d = 0 ; d < n ; d++){
	          second[c][d] = in.nextInt();
	       }
	    }
	    in.close();
	}
	
	//function that calculates and print sum of two matrices
	public int[][] sumOfMatrices(){
		
		System.out.println("Sum of entered matrices:");
		
		for (c = 0 ; c < m ; c++){
			for (d = 0 ; d < n ; d++){
				sum[c][d] = first[c][d] + second[c][d];
		    }
		}
		
		 for (c = 0 ; c < m ; c++){
			 for (d = 0 ; d < n ; d++){
				 System.out.print(sum[c][d] + "\t");
		     }
		     System.out.println();
		 }
    return this.sum;
	}
	
	
	
}
