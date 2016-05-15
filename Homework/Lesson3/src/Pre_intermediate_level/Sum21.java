package Pre_intermediate_level;

import java.util.Scanner;

public class Sum21 {
	
	private int a, b;
	
	public Sum21(){
		
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Input number a: ");
	     this.a = sc.nextInt();
	     System.out.print("Input number : ");
	     this.b = sc.nextInt();
	     sc.close();
	}
	
	//fuction which checks what a, b or their sum equal 21
	public void checkSum21(){
		
		if ((a == 21) || (b == 21) || (a + b == 21)){
			
			System.out.println("True");
		}
		
		else {
			
			System.out.println("False");
		}
	}

}
