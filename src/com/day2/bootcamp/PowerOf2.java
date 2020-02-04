package com.day2.bootcamp;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,power=1;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a Number ");
		n=scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			power=power*2;
			//power=(int) Math.pow(2, i);
			System.out.println(power);
		}
	}

}
