package com.day1.home;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringSeason ss=new SpringSeason();
		
		int year;
		boolean leap = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a years");
		year = scanner.nextInt();
		if (year >= 1582) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						leap = true;
					} 
					else {
						leap = false;
					}
				} 
				else {
					leap = true;
				}
			}else {
				leap=false;
			}
		}
		if (leap) {
			System.out.println(year + " is Leap Year");
		} else {
			System.out.println(year + " is not a Leap Year");
		}
		System.out.println(1800%400);
	}

}
