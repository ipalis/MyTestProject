package Beginner_level;

import java.util.Scanner;


class  task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter array length: ");
	    int size = input.nextInt();
	    int array[] = new int[size];
	    System.out.println("Insert array elements: ");
	    	for (int i = 0; i < size; i++) {
	        array[i] = input.nextInt();
	    	}
	    System.out.println("Enter the number which we are checking for: ");
	    int number = input.nextInt();
	    int quantity = 0;
	    	for (int i=0; i < size; i++){
	    		if (number == array[i]){
	    			    quantity++;
	    		}
	    	}
	    System.out.println("Quantity:" + quantity);
	    input.close();
	}
}
