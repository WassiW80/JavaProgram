package com.pattern.program;

public class CombinePyramidDownAndUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

		// upward
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
