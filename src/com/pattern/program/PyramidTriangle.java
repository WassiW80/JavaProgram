package com.pattern.program;

public class PyramidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 4; i++) {
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
