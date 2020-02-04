package com.day3.bootcamp;

import java.util.Scanner;

public class ExtendBinary {
	static int toDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;
	}

	static int[] swapNibbles(int[] arr) {
		// swap nibbles at first and last of the array
		// j is used for saving last 4 index of the array
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) { // loop runs 4 times and swap first four element to last four elements
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		System.out.println();
		System.out.println(toDecimal(arr));
		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String binary = "";

		// int i = 0;
		System.out.println("Enter a decimal number:");
		int n = scanner.nextInt();
		while (n > 0) {
			binary = (n % 2) + binary;
			n = n / 2;
			// i++;
		}
		/*
		 * for (int j = i - 1; j >= 0; j--) { // System.out.print(binary[j]);
		 */ while (binary.length() % 4 != 0) {
			binary = 0 + binary;
		}

		// }
		System.out.println(binary);

		int binArray[] = new int[binary.length()];
		for (int i = 0; i < binArray.length; i++) {
			binArray[i] = binary.charAt(i)-48;
			System.out.print(binArray[i]);
		}
		for (int j = 0; j < binArray.length; j++) {
			int[] abc=swapNibbles(binArray);
			System.out.println(abc[j]);
		}
		
}

}
