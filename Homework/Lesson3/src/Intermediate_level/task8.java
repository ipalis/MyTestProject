package Intermediate_level;


import java.util.Scanner;
	 
	public class task8 {
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a camelCase sentence: ");
	        String input = scanner.nextLine();
	        scanner.close();
	        String result = "";
	        char firstChar = input.charAt(0);
	        result = result + Character.toUpperCase(firstChar);
	        for (int i = 1; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            if (Character.isUpperCase(currentChar)) {
	                result = result + " " + Character.toLowerCase(currentChar);
	            } else {
	            	result = result + Character.toLowerCase(currentChar);
	            }
	        }
	        System.out.println(result);
	  }
}