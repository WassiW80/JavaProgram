package com.day2.home;

import java.util.Scanner;

public class GamblingSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Stake, Goal and Trails");
		int stake=scanner.nextInt();
		int goal=scanner.nextInt();
		int trail=scanner.nextInt();
		int bet=20;
		double avgbet=0;
		int wonCount=0;
		int i=0;
		for (i = 0; i < trail; i++) {
			if (stake>=bet) {
				if (stake==goal) {
					break;
				}else {
					double rand =Math.random();
					if (rand>0.5) {
						stake=stake+(bet*2);
						avgbet++;
						wonCount++;
					}else {
						stake=stake-(bet*2);
						avgbet++;
					}
				}
				
			}else {
				break;
			}
		}
		System.out.println("Won Count: "+wonCount);
		System.out.println("Percentage of Won: "+(wonCount*100)/i);
		System.out.println("AvgBet "+(avgbet/i));
		System.out.println("IIII "+i);
	}

}
