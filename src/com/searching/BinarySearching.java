package com.searching;

public class BinarySearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 15, 25, 30, 49, 50, 57, 60, 75, 80, 100 };
		int search = 10;
		boolean found = false;
		int low = 0, high = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			int mid = (low + high) / 2;
			if (array[mid] == search) {
				System.out.println("Element found: " + mid);
				found = true;
				break;
			} else if (search < array[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		if (found == false) {
			System.out.println("Element Not found");
		}
	}

}
