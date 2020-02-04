package com.day1.bootcamp;

import java.util.Scanner;

public class PrintThreeNames {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter 3 Names");
		String str1=scanner.next();
		String str2=scanner.next();
		String str3=scanner.next();
		System.out.println("Hi "+str3+", "+str2+", and "+str1+".");
	}

}
