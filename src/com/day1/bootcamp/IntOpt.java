package com.day1.bootcamp;

import java.util.Scanner;

public class IntOpt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of a, b and c");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println((a+b*c));
		System.out.println((a*b+c));
		System.out.println((c+a/b));
		System.out.println((a%b+c));
	}

}
