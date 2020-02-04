package com.day1.home;

import java.util.Random;

public class SumOfTwoDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int dice1=random.nextInt(6)+1;
		int dice2=random.nextInt(6)+1;
		System.out.println(dice1);
		System.out.println(dice2);
		System.out.println(dice1+dice2);
	}

}
