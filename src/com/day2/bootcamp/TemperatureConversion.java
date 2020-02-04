package com.day2.bootcamp;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		double c, f;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice 1 or 2:");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter temperature in Fahrenheit:");
			f = scanner.nextInt();
			c = (f - 32) * 5 / 9;
			System.out.println("Temperature in Celsius: " + c);
			break;
		case 2:
			System.out.println("Enter temperature in Celsius:");
			c = scanner.nextInt();
			f = (c * 9 / 5) + 32;
			System.out.println("Temperature in Fahrenheit: " + f);
			break;

		default:
			System.out.println("Enter value 1 or 2");
			break;
		}
	}

}
