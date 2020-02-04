package com.day3.bootcamp;

import java.util.Calendar;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start and end range: ");
		int startRange = scanner.nextInt();
		int endRange = scanner.nextInt();
		for (int i = startRange; i < endRange; i++) {
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i != 1) {
				System.out.println(i);
			} else if (i == 2 || i == 3 || i == 5 || i == 7) {
				System.out.println(i);
			} else {
			}
		}
	}

}
