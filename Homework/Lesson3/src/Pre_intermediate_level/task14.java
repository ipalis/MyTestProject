package Pre_intermediate_level;

import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Input string: ");
	      String x = sc.nextLine();
	      sc.close();
	      String tab = "";
	      int length = x.length();
	      for (int i = 0; i < length; i++) {
	    	  System.out.println(tab + x.charAt(i));
	    	  tab = tab + " ";
			
		}

	}

}
