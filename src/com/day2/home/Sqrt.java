package com.day2.home;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the value of c");
		double c = scanner.nextDouble();
		double t=c;
		double epsilon=1.0e-15;
		while (Math.abs(t-c/t)>epsilon*t) {
			t=((c/t)+t)/2.0;
		}
		System.out.println("T "+t);
	}

}
