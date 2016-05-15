package Beginner_level;

import java.util.Scanner;

public class myFunc {
	
	private int x, y;
	
	// introduce variables that will be checked	
	public myFunc() {

		 Scanner sc = new Scanner(System.in);
	      System.out.print("Input number 1: ");
	      x = sc.nextInt();
	      System.out.print("Input number 2: ");
	      y = sc.nextInt();
	      sc.close();
	}
	
	// check the condition of the problem
	public void verifyTen() {
		
		if ((x==10) || (y==10) || (x+y==10)){
					
					System.out.println("True");
				}
				
				else {
					
					System.out.println("False");
				}
				
	}

}
