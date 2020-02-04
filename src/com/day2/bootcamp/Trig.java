package com.day2.bootcamp;

import java.util.Scanner;

public class Trig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angle;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an angle:");
		angle=scanner.nextInt();
		double radian=Math.toRadians(angle);
		double trig=Math.sin(radian);
		System.out.println("Sin: "+trig);
		trig=Math.cos(radian);
		System.out.println("Cos: "+trig);
		trig=Math.tan(radian);
		System.out.println("Tan: "+trig);
		trig=Math.asin(radian);
		System.out.println("Sec: "+trig);
		trig=Math.acos(radian);
		System.out.println("Cosec: "+trig);
		trig=Math.atan(radian);
		System.out.println("Cot: "+trig);
	
	
	}

}
