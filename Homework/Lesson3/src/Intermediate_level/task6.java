package Intermediate_level;

import java.util.Scanner;

public class task6 {

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input string: ");
		String str = sc.nextLine();
		sc.close();
		
		String maxword = null;
		str = str + ' ';
		int l = str.length();
		String word = " ";
		int maxlength = 0;
		
			for(int i = 0; i < l; i++){
				word = word + str.charAt(i);
				
				if(str.charAt(i+1) == ' '){
					
					if(word.length() > maxlength){
						maxword = new String(word);
						maxlength = word.length();
					}
					word = " ";
					i++;
				}
			}
		System.out.println("longest word is:" + maxword);
		
	}
		
}