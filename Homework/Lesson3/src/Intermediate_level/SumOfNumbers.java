package Intermediate_level;

import java.util.Scanner;

public class SumOfNumbers {
	
		private String str;
		private int number, result;
		private int a[];
	
	public SumOfNumbers(){
		Scanner in = new Scanner(System.in);
	    System.out.print("Input string: ");
	    this.str = in.nextLine();
	    in.close();
	}

    //function that calculates sum of digits in the string
	public int mySum(String str){
	    this.a = new int[100];
	    this.number = 0;
	    this.result = 0;
	    for (int i = 0; i < str.length(); i++) {
	         if (Character.isDigit(str.charAt(i))){
		         number = Integer.valueOf(str.substring(i, i+1)).intValue();
		         a[i]=number;
		         result += a[i];
	        }
	    }
	   return result;
	}
	
	//function that prints result
    public void printResult(){
    
    	System.out.println("Sum of numbers in the string: " + mySum(str));
    }
}