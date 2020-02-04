package com.searching;

import java.util.Scanner;

public class LinearSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		boolean found = false;
		System.out.println("Enter the number of elements: ");
		int num=scanner.nextInt();
		int array[]=new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the elements: ");
			array[i]=scanner.nextInt();
		}
		System.out.println("Enter the element you want to search: ");
		int search=scanner.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i]==search) {
				found=true;
				break;
			}
		}
		if (found) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Not found");
		}
	}

}
