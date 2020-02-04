package com.day2.home;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a date");
		int d = scanner.nextInt();
		int m = scanner.nextInt();
		int y = scanner.nextInt();
		y = y - (14 - m) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		m = m + 12 * ((14 - m) / 12) - 2;
		d = (d + x + 31 * m / 12) % 7;
		System.out.println("Day: " + d);
	}

}
