package com.day3.bootcamp;

import java.util.Scanner;

public class Cos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		double x = scanner.nextDouble();

		x = x * (Math.PI / 180);

		double fact = 1.0;
		double result = 1.0;
		for (int i = 1; fact != 0.0; i++) {
			fact = fact * (x / i);
			if (i % 4 == 0) {
				result = result + fact;
			}
			if (i % 4 == 2) {
				result = result - fact;
			}

		}
		System.out.println(result);
	}

}
