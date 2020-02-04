package com.day3.bootcamp;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String binary = "";
		//int i = 0;
		System.out.println("Enter a decimal number:");
		int n = scanner.nextInt();
		while (n > 0) {
			binary = (n % 2) + binary;
			n = n / 2;
		//	i++;
		}
		/*for (int j = i - 1; j >= 0; j--) {
			// System.out.print(binary[j]);
*/			while (binary.length() % 4 != 0) {
				binary = 0 + binary;
			}

	//	}
		System.out.println(binary);
	}
}
