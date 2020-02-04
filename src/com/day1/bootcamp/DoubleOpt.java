package com.day1.bootcamp;

import java.util.Scanner;

public class DoubleOpt {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value of a, b and c");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		System.out.println((a+b*c));
		System.out.println((a*b+c));
		System.out.println((c+a/b));
		System.out.println((a%b+c));
	}

}
