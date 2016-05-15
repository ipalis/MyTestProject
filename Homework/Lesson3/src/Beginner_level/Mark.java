package Beginner_level;

import java.util.Scanner;

public class Mark {
	
	private int mark;
	private String yourResult;
	
	// introduce your mark	
	public Mark(){
		
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Your mark is: ");
	      this.mark = sc.nextInt();
	      this.yourResult = "";
	      sc.close();
	}
	
	// function depending on mark returns your result
	public void  myMark() {
		
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
		
	}
}
