package Beginner_level;

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Input string: ");
	      String s = sc.next();
	      System.out.print("Input n: ");
	      int n = sc.nextInt();
	      String result = "";
	      for (int i=n; i>0; i--){
	    	 String substring = s.substring(0, i);
	    	 result += substring;
	      }
		  
	      System.out.println(result);
		  
		  sc.close();
	}

}
