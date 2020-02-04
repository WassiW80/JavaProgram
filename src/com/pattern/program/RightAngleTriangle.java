package com.pattern.program;

public class RightAngleTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		int n = 4;
		int k = 0;
		for (int i = n; i >= 1; i--) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print("*");
			}
			k = 0;
			while (k != (2 * i - 1)) {
				if (k == 0 || k == (2 * i - 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				k++;
			}

			System.out.println();
		}
		k = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}

			while (k != (2 * i - 1)) {
				if (k == 0 || k == (2 * i - 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				k++;
			}
			k = 0;
			System.out.println();
		}
			
	}
	/*
	 * for (int i = 1; i < n*2-2; i++) { System.out.print("* "); }
	 */
	// n--;

}
