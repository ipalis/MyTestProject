package Beginner_level;

import java.util.Scanner;

public class Return {
	
	private int n;
	private String s;
	private String result = "";
	
	//
	public Return(){
	
		Scanner sc = new Scanner(System.in);
	    System.out.print("Input string: ");
	    this.s = sc.next();
	    System.out.print("Input n: ");
	    this.n = sc.nextInt();
	    sc.close();
		}
	
	//
    public void returnString(){
    	
	    for (int i=n; i>0; i--){
	  	 String substring = s.substring(0, i);
	  	 result += substring;
	    }
		  
	    System.out.println(result);
	    
	    }  

}
