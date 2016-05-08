package Beginner_level;

import java.util.Scanner;

public class task3 {

	    public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Number: ");
	      int number = sc.nextInt();
	      if ((number>0) && ((number % 3 == 0)||(number % 5 == 0))){
	         System.out.println("True");
	      }
	      else{
	         System.out.println("False");
	      }
	    sc.close();
	}
}
	