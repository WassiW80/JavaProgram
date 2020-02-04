package com.day1.bootcamp;

public class PrintIntials {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
				if (i==j) {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
