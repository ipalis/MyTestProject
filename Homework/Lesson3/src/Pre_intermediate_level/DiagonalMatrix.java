package Pre_intermediate_level;

import java.util.Scanner;

public class DiagonalMatrix {
	
	private int length;
	private String x, tab;

	
	public DiagonalMatrix(){
		Scanner sc = new Scanner(System.in);
	    System.out.print("Input string: ");
	    this.x = sc.nextLine();
	    sc.close();
	}
	
	// fuction which prints word like diagonal matrix
	public void printMatrix() {
	
	    this.tab = "";
	    this.length = x.length();
	    for (int i = 0; i < length; i++) {
	  	  System.out.println(tab + x.charAt(i));
	  	  tab = tab + " ";
			
	    }

	}
}
