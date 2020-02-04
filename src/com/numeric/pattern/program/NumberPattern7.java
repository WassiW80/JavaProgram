package com.numeric.pattern.program;

public class NumberPattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			int no = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(no);
				no=no+4-j;
			}
			System.out.println();
		}
	}

}
