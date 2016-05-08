package Pre_intermediate_level;

import java.util.Scanner;

public class task2 {
	private static String swapChar(String x){
		char[] chars = x.toCharArray();
		char y = chars[0];
		chars[0] = chars[chars.length - 1];
		chars[chars.length - 1] = y;
		return new String(chars);
	}
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Input string: ");
	      String x = sc.nextLine();
	      System.out.println(swapChar(x));
	      sc.close();
	      }

}
