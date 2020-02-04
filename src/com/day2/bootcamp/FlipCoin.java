package com.day2.bootcamp;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int hcount=0,tcount=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of time you want to flip the coin:");
		num=scanner.nextInt();
		for (int i = 0; i < num; i++) {
			double rand=Math.random();
			if (rand>0.5) {
				System.out.println("Head");
				hcount++;
			}else {
				System.out.println("Tails");
				tcount++;
			}
		}
		System.out.println("Head: "+((hcount*100/num))+"%");
		System.out.println("Tail: "+((tcount*100/num))+"%");
	}

}
