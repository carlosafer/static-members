package application;

import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		
		Calculator calculator = new Calculator();
		
		double c = calculator.circumference(radius);
		
		double v = calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calculator.PI);
		
		input.close();
	}
	
}
