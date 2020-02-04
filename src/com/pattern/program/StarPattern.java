package com.pattern.program;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 1; i <= 5; i++) {
			/*
			 * for (int j = 7; j > i; j--) { System.out.print(" "); }
			 */
			for (int k = 1; k <=9; k++) {

				/*
				 * if (k > x || k < x || k == 1) System.out.print("*"); else {
				 * System.out.print(" "); }
				 */
				if (i>1&&k==5) {
					System.out.print(" ");
				}
				else if (k>=6-i && k<=4+i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
