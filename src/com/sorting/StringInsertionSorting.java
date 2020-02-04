package com.sorting;

import java.util.Scanner;

public class StringInsertionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of element you want to enter: ");
		int num= scanner.nextInt();
		String[] string=new String[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the string element in array: ");
			string[i]=scanner.next();
		}
		System.out.println("Element before sorting:");
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
		for (int i = 0; i < string.length; i++) {
			String temp=string[i];
			int j = i;
			while (j>0 && string[j-1].compareTo(temp)>0) {
				string[j]=string[j-1];
				j--;
			}
			string[j]=temp;
		}
		System.out.println("Element after sorting: ");
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
	}

}
