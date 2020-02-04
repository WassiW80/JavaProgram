package com.sorting;

public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {15,40,30,10,50};
		for (int i = 0; i < array.length; i++) {
			int min=i;
			for (int j = i+1; j < array.length; j++) {
				if (array[min]>array[j]) {
					min=j;
				}
			}
			int swap=array[i];
			array[i]=array[min];
			array[min]=swap;
		}
		System.out.println("Sorted Array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
