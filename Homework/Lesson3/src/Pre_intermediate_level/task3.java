package Pre_intermediate_level;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Input number 1: ");
	      int a = sc.nextInt();
	      System.out.print("Input number 2: ");
	      int b = sc.nextInt();
		if ((a==21) || (b==21) || (a+b==21)){
			
			System.out.println("True");
		}
		
		else {
			
			System.out.println("False");
		}
		sc.close();
	}
}