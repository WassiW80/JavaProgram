package com.pattern.program;

public class HallowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j < (i * 2); j++) {
				if (j > 1 && j < (i * 2) - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// Up
		for (int i = 4; i >= 1; i--) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j < (i * 2); j++) {
				if (j > 1 && j < (i * 2) - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
