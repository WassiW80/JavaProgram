package com.numeric.pattern.program;

public class NumberPattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i <= 4; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= 3; j++) {
					count++;
					System.out.print(count + " ");
					
				}
			}
			else {
				int temp=count+1;
				for (int j = count+3; j >= temp; j--) {
					count++;
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}

}
