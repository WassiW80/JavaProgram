package com.day2.bootcamp;

import java.util.Scanner;

import com.bridgelabz.bootcamp.lindkedlist.LinkedList;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		LinkedList linkedList=new LinkedList();
		System.out.println("Enter a Number:");
		int n = scanner.nextInt();
		double h1 = 1;
		linkedList.insert(h1);
		for (int i = 2; i <= n; i++) {
			h1 = h1 + 1.0 / i;
			linkedList.insert(h1);
			
		}
		System.out.println("Harmonic Number: " + h1);
		linkedList.show();
	}
}
