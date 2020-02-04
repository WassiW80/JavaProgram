package com.sorting;

public class InsertionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 15, 40, 30, 10, 50 }; 
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			int j = i;
			while (j > 0 && array[j - 1] > temp) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
