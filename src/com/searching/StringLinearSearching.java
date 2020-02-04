package com.searching;

import java.util.Scanner;

public class StringLinearSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean found=false;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of element you want: ");
		int num=scanner.nextInt();
		String array[]=new String[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the string element: ");
			array[i]=scanner.next();
		}
		System.out.println("Enter the element you want to search: ");
		String search=scanner.next();
		for (int i = 0; i < array.length; i++) {
			if (array[i].equalsIgnoreCase(search)) {
				System.out.println("Element found at location "+i);
				break;
			}
		}
		if (found) {
			System.out.println("Element not found! ");
		}
	}

}
