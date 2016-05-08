package Beginner_level;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.print("Your mark is: ");
	      int mark = sc.nextInt();
	      String yourResult = "";
	      switch (mark){
	      case 5: yourResult = "Excellent";
	      		  break;
	      case 4: yourResult = "Good";
  		  		  break;
	      case 3: yourResult = "Not Good";
  		          break;
	      case 2: yourResult = "Failed";
  		          break;
	      case 1: yourResult = "Bad";
  		          break;
	      }
	          System.out.print(yourResult);
	      
	          sc.close();
	}

}
