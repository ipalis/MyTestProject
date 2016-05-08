package Intermediate_level;

import java.util.Scanner;

public class task4 {

		public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
		    System.out.print("Input string: ");
		    String str = in.nextLine();
		    in.close();
		    System.out.println(mySum(str));
		}
		
		public static int mySum(String str){
		    int a[]= new int[100];
		    int number = 0;
		    int result = 0;
		    for (int i = 0; i < str.length(); i++) {
		         if (Character.isDigit(str.charAt(i))){
		         number = Integer.valueOf(str.substring(i, i+1)).intValue();
		         a[i]=number;
		         result += a[i];
		        }
		      
		    }
		   return result;
			}
			 
	}