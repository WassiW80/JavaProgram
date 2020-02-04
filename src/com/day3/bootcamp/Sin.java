package com.day3.bootcamp;

import java.util.Scanner;

public class Sin {

	public static void main(String[] args) { // TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		double x = scanner.nextDouble();

		x = x * (Math.PI / 180);
		System.out.println(x);

		double fact = 1.0; // ith fact = x^i / i!
		double result = 0.0; // result of first i facts in taylor series
		int i = 1;
		for (i = 1; fact != 0.0; i++) {
			fact = fact * (x / i);
			if (i % 4 == 1)
				result = result + fact;
			if (i % 4 == 3)
				result = result - fact;
		}
		System.out.println(result);

	}
}
