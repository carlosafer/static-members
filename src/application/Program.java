package application;

import java.util.Scanner;

public class Program {

	public static double PI = 3.14159;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		input.close();
	}

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}
}
