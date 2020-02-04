package com.day1.home;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		double delta,root1,root2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value of a,b and c");
		a=scanner.nextDouble();
		b=scanner.nextDouble();
		c=scanner.nextDouble();
		delta=Math.abs(b*b-4*a*c);
		root1=(-b+Math.sqrt(delta))/(2*a);
		root2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("Root 1 of x "+root1);
		System.out.println("Root 2 of x "+root2);
	}

}
