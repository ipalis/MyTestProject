package Pre_intermediate_level;

import java.util.Scanner;

public class QuadraticEquation {
	
		private double a, b, c, discriminant;

	
	public QuadraticEquation(){
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a, b, c: ");
	    this.a = input.nextDouble();
	    this.b = input.nextDouble();
	    this.c = input.nextDouble();
	    input.close();
    }
	
	// function that calculates the roots of quadratic equation
	public void calculating(){
	    this.discriminant = calculateDiscriminant(a, b, c);
	
	    if (discriminant > 0.0) {
	        double r1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
	        double r2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
	        System.out.println("The roots are " + r1 + " and " + r2);
	    } 
	    else if (discriminant == 0.0) {
	        double r1 = -b / (2.0 * a);
	        System.out.println("The root is " + r1);
	    } 
	    else {
	        System.out.println("The equation has no real roots.");
	    }
	}

	// function that calculates the discriminant
	private static double calculateDiscriminant(double a, double b, double c) {
		double discriminant = b * b - 4.0 * a * c;
		return discriminant;

	}
}