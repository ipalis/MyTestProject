package Beginner_level;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Input number 1: ");
	      int x = sc.nextInt();
	      System.out.print("Input number 2: ");
	      int y = sc.nextInt();
		if ((x==10) || (y==10) || (x+y==10)){
			
			System.out.println("True");
		}
		
		else {
			
			System.out.println("False");
		}
		sc.close();
	}

}
