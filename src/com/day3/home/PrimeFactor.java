package com.day3.home;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=scanner.nextInt();
		int i=2;
		System.out.print(n+" = ");
		while (i*i<=n) {
			if(n%i==0) {
				System.out.print(i+" * ");
				n=n/i;
			}else {
				i=i+1;
			}
		}
		System.out.println(n);
	}

}
