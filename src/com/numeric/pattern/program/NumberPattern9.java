package com.numeric.pattern.program;

public class NumberPattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			if (i == 4) {
				break;
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= 4; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
