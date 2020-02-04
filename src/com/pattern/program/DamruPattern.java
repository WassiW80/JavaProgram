package com.pattern.program;

public class DamruPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//left side
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			for (int j = 3; j >=i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}
			for (int j = 0; j <=i; j++) {
				System.out.print("  ");
			}
			for (int j = 3; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
				
		//space printing
		
	}

}
