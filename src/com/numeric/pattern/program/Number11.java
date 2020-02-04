package com.numeric.pattern.program;

public class Number11 {
	public static void main(String args[]) {
		int i,j;
		for(i =0;i<=3;i++) {
			for(j=5-i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("0");
		for(i=2;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
