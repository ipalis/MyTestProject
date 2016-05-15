package Beginner_level;

import java.util.Scanner;

public class Division {
	
	private int a, b;
	private double result;
	
	public Division() {
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Input a: ");
	    this.a = sc.nextInt();
	    System.out.print("Input b: ");
	    this.b = sc.nextInt();
	    sc.close();
	}
	
	// function that divides a/b  and casts the result to type double
	public void division(){
		
	    result = (double) (a) / ((double) (b));
	    
	    System.out.println("Result of division a/b: " + result);
	
	}
	
    

}
