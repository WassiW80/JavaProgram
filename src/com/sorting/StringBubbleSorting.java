package com.sorting;

import java.util.Scanner;

public class StringBubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter: ");
		int num = scanner.nextInt();
		String[] string=new String[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the element in the array: ");
			string[i]=scanner.next();
		}
		for (int i = 0; i < string.length; i++) {
			for (int j = 0; j < string.length-1-i; j++) {
				if (string[j].compareTo(string[j+1])>0) {
					String temp=string[j];
					string[j]=string[j+1];
					string[j+1]=temp;
				}
			}
		}
		System.out.println("Element after sorting: ");
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
	}

}
