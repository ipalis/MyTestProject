package Pre_intermediate_level;

import java.util.Scanner;
 
class task9 {
	
   public static void main(String args[]) {
      int n;
      int c;
      System.out.print("Enter a digit for the multiplication table: ");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      System.out.println("Multiplication table of "+n+" is :");
 
      for ( c = 1 ; c <= 10 ; c++ )
         System.out.println(n+"*"+c+" = "+(n*c));
      in.close();
   }
}