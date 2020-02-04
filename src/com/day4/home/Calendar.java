package com.day4.home;

import java.awt.Dialog.ModalExclusionType;
import java.util.Scanner;

public class Calendar {

	static int dayOfWeek(int day, int month, int year) {
		year = year - (14 - month) / 12;
		int x = year + year / 4 - year / 100 + year / 400;
		month = month + 12 * ((14 - month) / 12) - 2;
		day = (day + x + 31 * month / 12) % 7;

		/*
		 * switch (day) { case 0: System.out.println("Sunday"); break; case 1:
		 * System.out.println("Monday"); break; case 2: System.out.println("Tuesday");
		 * break; case 3: System.out.println("Wednesday"); break; case 4:
		 * System.out.println("Thursday"); break; case 5: System.out.println("Friday");
		 * break; case 6: System.out.println("Saturday"); break;
		 * 
		 * default: break; }
		 */
		return day;
	}

	static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(dayOfWeek(1, 11, 2019));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month and year: ");
		int month = scanner.nextInt();
		int year = scanner.nextInt();

		String string[] = { "", "January", "Febuary", "March", "April","May", "June", "July", "August", "September",
				"October", "November", "December" };

		int day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (month == 2 && isLeapYear(year)) {
			day[month] = 29;
		}

		System.out.println("  " + string[month] + " " + year);
		System.out.println("Su Mo Tu We Th Fr Sa");
		int d = dayOfWeek(1, month, year);
		for (int i = 0; i < d; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= day[month]; i++) {
			System.out.printf("%2d ",i);

			if ((i + d) % 7 == 0 || (i == day[month])) {
				System.out.println();

			}
		}
	}

}
