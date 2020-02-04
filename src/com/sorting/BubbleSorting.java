package com.sorting;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number of element you want to enter: ");
		int num=scanner.nextInt();
		int array[]=new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the elements in the array: ");
			array[i]=scanner.nextInt();
		}
		System.out.println("Elements before sorting: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Elements after sorting");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j]>array[j+1] ) {
					int swap=array[j];
					array[j]=array[j+1];
					array[j+1]=swap;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
