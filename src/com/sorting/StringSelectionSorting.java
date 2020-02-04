package com.sorting;

import java.util.Scanner;

public class StringSelectionSorting {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of element you want to enter: ");
		int num = scanner.nextInt();
		String[] string = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the string element in array: ");
			string[i] = scanner.next();
		}
		int j;
		for (int i = 0; i < string.length; i++) {
			int min = i;
			for (j = i + 1; j < string.length; j++) {
				if (string[j].compareToIgnoreCase(string[min]) < 0) {
					min = j;
				}
			}
			String temp = string[min];
			string[min] = string[i];
			string[i] = temp;
		}
		System.out.println("Element After sorting: ");
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
	}

}
