package com.day2.bootcamp;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t,v,w=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value for t and v");
		t=scanner.nextDouble();
		v=scanner.nextDouble();
		w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		System.out.println(w);
	}

}
