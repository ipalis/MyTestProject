package Pre_intermediate_level;

import java.util.Scanner;

public class SwapCharacters {
	
	private	String x;
	
	public SwapCharacters(){
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Input string: ");
	    this.x = sc.nextLine();
	    sc.close();
	}
	
	// function which swaps first and last characters
	private  String swapChar(){
		
		char[] chars = x.toCharArray();
		char y = chars[0];
		chars[0] = chars[chars.length - 1];
		chars[chars.length - 1] = y;
		return new String(chars);

	}
	
	// function which print modified string
	public void printResult(){
		 System.out.println(swapChar());
	}
}