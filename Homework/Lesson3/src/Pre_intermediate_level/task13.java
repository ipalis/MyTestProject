package Pre_intermediate_level;

import java.util.Scanner;

public class task13 {
	public static void main(String[] Strings) {

	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter a, b, c: ");
	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    double c = input.nextDouble();

	    input.close();

	    double discriminant = calculateDiscriminant(a, b, c);

	    if (discriminant > 0.0) {
	        double r1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
	        double r2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
	        System.out.println("The roots are " + r1 + " and " + r2);
	    } else if (discriminant == 0.0) {
	        double r1 = -b / (2.0 * a);
	        System.out.println("The root is " + r1);
	    } else {
	        System.out.println("The equation has no real roots.");
	    }
	}

	private static double calculateDiscriminant(double a, double b, double c) {
	    double discriminant = b * b - 4.0 * a * c;
	    return discriminant;
	}
}
