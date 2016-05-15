package Intermediate_level;

import java.util.Scanner;

public class Superpower {
	
	private int a, b, sum, number, amount;
	
	// introduce and check number and amount
	public Superpower(){
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter number: ");
	    this.a = input.nextInt();
	    
		    if (a < 0) {
		    	System.out.println("Please input correct number!");
		    	input.close();
		    	return;
		    }
	    System.out.print("Enter amount: ");
	    this.b = input.nextInt();
		    if ((b > 83)||(b < 0)) {
		    	System.out.println("Please input correct amount!");
		    	input.close();
		    	return;
		    }
		    
	}
	
	// function that checks our superpower
	public boolean checkSuperPower(int number, int amount) {
		
		this.sum = 0;
		while (this.number > 0) {
			this.sum += this.number % 10;
			this.number = this.number / 10;
		}
		return this.amount == this.sum;

		}
	
	//function that prints result
	public void printResult(){
		
		System.out.println("Check superpower: " + checkSuperPower(a, b));
	}
}