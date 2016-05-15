package Beginner_level;

import java.util.Scanner;

public class nonNegative3Or5 {
	
	private int number;
	
	// introduce number that will be checked	
		public nonNegative3Or5() {
			  Scanner sc = new Scanner(System.in);
		      System.out.print("Number: ");
		      this.number = sc.nextInt();
		      sc.close();
		}
		
		// create function which will be check condition of the problem
		public void checkNumber() {
			
			if ((number>0) && ((number % 3 == 0)||(number % 5 == 0))){
		         System.out.println("True");
		      }
		      else{
		         System.out.println("False");
		      }
		}
	

}
