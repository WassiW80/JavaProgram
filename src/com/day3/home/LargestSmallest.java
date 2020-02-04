package com.day3.home;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 7, 6, 5 };
		int l1 = arr[0];
		int l2 = arr[1];

		if (l1 > l2) {
			int temp = l1;
			l1 = l2;
			l1 = temp;
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > l1) {
				l2 = l1;
				l1 = arr[i];
			} else if (arr[i] > l2 && arr[i] != l1) {
				l2 = arr[i];
			}
		}
		System.out.println(l1);
		System.out.println(l2);

		if (l2 > l1) {
			int temp = l1;
			l2 = l1;
			l1 = temp;
		}
		for (int i = arr.length-1; i >=0 ; i--) {
			if (arr[i] < l1) {
				l2 = l1;
				l1 = arr[i];
			} else if (arr[i] < l2 && arr[i] != l1) {
				l2 = arr[i];
			}
		}
		System.out.println(l1);
		System.out.println(l2);
	}

}
