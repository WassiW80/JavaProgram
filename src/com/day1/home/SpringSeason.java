package com.day1.home;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {

		int m, d;
		boolean spring=false;

		m = Integer.parseInt(args[0]);
		d = Integer.parseInt(args[1]);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day and months");
		d = scanner.nextInt();
		m = scanner.nextInt();

		if ((m >= 3 && m<= 6)) {
			if (m==3 && d>=20) {
				spring=true;
			}
			if(m==6 && d>20) {
				spring=false;
			}
			else {
				spring=true;
			}
			System.out.println(spring);
			
		} else {
			System.out.println(spring);
		}
	}

}
