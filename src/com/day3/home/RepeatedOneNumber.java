package com.day3.home;

public class RepeatedOneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		arr[57] = 20;
		int i;
		for (i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					System.out.println(arr[j]);
				}
			}

		}

	}

}
