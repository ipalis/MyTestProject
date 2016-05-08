package Advanced_level;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter year in Arabic numerals: ");
		int number = scan.nextInt();
		scan.close();
		
		String romanNumeral = "";
		if (number == 0) {
			System.out.print("Year in Romanian numerals: nulla");
		}
			else{
				if ((number > 0) && (number <= 2015)) {
					
				while (number >= 1000) {
					romanNumeral += "M";
					number -= 1000;
				}
				
				while (number >= 900) {
					romanNumeral += "CM";
					number -= 900;
				}
				
				while (number >= 500) {
					romanNumeral += "D";
					number -= 500;
				}
				
				while (number >= 400) {
					romanNumeral += "CD";
					number -= 400;
				}
				
				while (number >= 100) {
					romanNumeral += "C";
					number -= 100;
				}
				
				while (number >= 90) {
					romanNumeral += "XC";
					number -= 90;
				}
				
				while (number >= 50) {
					romanNumeral += "L";
					number -= 50;
				}
				
				while (number >= 40) {
					romanNumeral += "XL";
					number -= 40;
				}
				
				while (number >= 10) {
					romanNumeral += "X";
					number -= 10;
				}
				
				while (number >= 9) {
					romanNumeral += "IX";
					number -= 9;
				}
				
				while (number >= 5) {
					romanNumeral += "V";
					number -= 5;
				}
				
				while (number >= 4) {
					romanNumeral += "IV";
					number -= 4;
				}
				
				while (number >= 1) {
					romanNumeral += "I";
					number -= 1;
				}
				System.out.println("Year in Romanian numerals: " + romanNumeral);
				}
				else {
					System.out.println("Please enter year from 1 to 2015 in Arabic numerals!" + romanNumeral);
				}
			}
	}

}
