package com.day2.home;

import java.util.Scanner;

public class CarLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value for p,y,r");
		double p = scanner.nextDouble();
		double y = scanner.nextDouble();
		double r = scanner.nextDouble();
		double n = 12 * y;
		r = r / (12 * 100);
		double payment = p * r / (1 - Math.pow((1 + r), -n));
		System.out.println(payment);
	}

}
