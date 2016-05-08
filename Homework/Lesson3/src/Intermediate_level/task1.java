package Intermediate_level;

import java.util.Scanner;

public class task1 {
		
	    public static void main(String[] args){
	    	Scanner input = new Scanner(System.in);
		    System.out.print("Enter number: ");
		    int a = input.nextInt();
		    if (a < 0) {
		    	System.out.println("Please input correct number!");
		    	input.close();
		    	return;
		    }
		    System.out.print("Enter amount: ");
		    int b = input.nextInt();
		    if ((b > 83)||(b < 0)) {
		    	System.out.println("Please input correct amount!");
		    	input.close();
		    	return;
		    	
			}
		    input.close();
	    	System.out.println("Check superpower: " + checkSuperPower(a, b));
	    }
	    
	    public static boolean checkSuperPower(int number, int amount) {
			int sum = 0;
	    	while (number > 0) {
	    		sum += number % 10;
	    		number = number / 10;
			}
	    	return amount == sum;
		}
	}