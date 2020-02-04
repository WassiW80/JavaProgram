package com.pattern.program;

public class ReverseV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for (int i = 0; i < 4; i++) { for (int j = 3; j > i; j--) {
		 * System.out.print(" "); } for (int j = 0; j < 1; j++) { System.out.print("*");
		 * } for (int j = 0; j <i; j++) { System.out.print("  "); }for (int j = 0; j <
		 * 1; j++) { System.out.print("*"); } System.out.println(); }
		 */
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (i * 2); j++) {

				if (j >= 1 && j <= (i * 2) - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}

}
