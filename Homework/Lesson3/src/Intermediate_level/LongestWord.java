package Intermediate_level;

import java.util.Scanner;

public class LongestWord {
	
	private String str, maxword, word;
	private int l, maxlength;
	
	
	public LongestWord(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input string: ");
		this.str = sc.nextLine();
		sc.close();
	}
	
	//function that finds abd prints longest word
	public void findLongestWord(){
		this.maxword = null;
		str = str + ' ';
		this.l = str.length();
		this.word = " ";
		this.maxlength = 0;
		
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
