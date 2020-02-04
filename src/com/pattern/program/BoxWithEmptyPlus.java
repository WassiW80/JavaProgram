package com.pattern.program;

public class BoxWithEmptyPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (i == 0 || j == 0 || j == 10 || i == 10) {
					System.out.print("* ");
				} else if (i == 5 || j == 5) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
