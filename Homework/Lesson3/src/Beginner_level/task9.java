package Beginner_level;

import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
	      System.out.print("Input a: ");
	      int a = sc.nextInt();
	      System.out.print("Input b: ");
	      int b = sc.nextInt();
	      
	      double result = (double) (a) / ((double) (b));
	      
	      System.out.println(result);
	     
	      sc.close();
	}

}
