package Advanced_level;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Metrics percent1 = new Metrics();
		Metrics percent2 = new Metrics();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter passed number of test cases: ");
		int p = scan.nextInt();
		System.out.print("Enter failed number of test cases: ");
		int f = scan.nextInt();
		System.out.print("Enter complete number of unresolved issues: ");
		int i = scan.nextInt();
		System.out.print("Enter number of unresolved issues (bugs) with HIGH priority: ");
		int h = scan.nextInt();
		System.out.print("Enter number of unresolved issues (bugs) with Blocker and Critical severity: ");
		int bc = scan.nextInt();
		scan.close();
		
		if (percent1.passedToFailed(p, f) >= 20) {
			System.out.println("Build is not stable: failed TC are more than 20%! Failed TC = " + percent1.passedToFailed(p, f) + " %");	
			
		}
		if (h > 10) {
			System.out.println("Build is not stable: have more than 10 unresolved issues with HIGH priority! Quantity = " + h);
		}
		if (bc > 5) {
			System.out.println("Build is not stable:  have more than 5 unresolved issues with Blocker/Critical severity! Quantity = " + bc);
		}
		if (percent2.completeToBlocked(i, bc) >= 5) {
			System.out.println("Build is not stable: unresolved Blocker issues are more than 5%! Blocker issues = " + percent2.completeToBlocked(i, bc) + " %");
		}
				
		if ((percent1.passedToFailed(p, f) <= 20) && (h < 10) && (bc < 5) && (percent2.completeToBlocked(i, bc) <= 5)) {
				System.out.println("Build is stable!");
		}
		
		

	}

}
