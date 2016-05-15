package Pre_intermediate_level;

import java.util.Scanner;

public class MultiplicationTable {
	
	private int n, c;
    
	public MultiplicationTable(){
		
	    System.out.print("Enter a digit for the multiplication table: ");
	    Scanner in = new Scanner(System.in);
	    this.n = in.nextInt();
	    System.out.println("Multiplication table of "+n+" is :");
	    in.close();
	}
	
	//function that calculates and prints table
	public void multiplicationTable(){
		
	    for ( c = 1 ; c <= 10 ; c++ )
	       System.out.println(n+"*"+c+" = "+(n*c));
	}

}
