package Intermediate_level;

import java.util.Scanner;

public class CamelCaseSeparator {
	
		private String input, result;
		private char firstChar, currentChar;
	
	public CamelCaseSeparator(){
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a camelCase sentence: ");
	    this.input = scanner.nextLine();
	    scanner.close();
	}
	
	// function that transforms CamelCase sentence in simple sentence
	public void camelCaseSeparator(){
		this.result = "";
	    this.firstChar = input.charAt(0);
	    result = result + Character.toUpperCase(firstChar);
	    for (int i = 1; i < input.length(); i++) {
	        this.currentChar = input.charAt(i);
	        if (Character.isUpperCase(currentChar)) {
	            result = result + " " + Character.toLowerCase(currentChar);
	        } else {
	        	result = result + Character.toLowerCase(currentChar);
	        }
	    }
	    System.out.println(result);
	}
}
