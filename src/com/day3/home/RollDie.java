package com.day3.home;

import java.util.Random;
import java.util.Scanner;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int die = random.nextInt(6) + 1;
			/* System.out.println(die); */
			switch (die) {
			case 1:
				++count1;
				break;
			case 2:
				++count2;
				break;
			case 3:
				++count3;
				break;
			case 4:
				++count4;
				break;
			case 5:
				++count5;
				break;
			case 6:
				++count6;
				break;

			default:
				
				break;
			}
		}
			   if (count1 > count2 && count2 > count3 && count3 > count4 && count4 > count5 && count5 > count6) {
			System.out.println(count1);
		} else if (count2 > count3 && count3 > count4 && count4 > count5 && count5 > count6 && count6 > count1) {
			System.out.println(count2);
		} else if (count3 > count4 && count4 > count5 && count5 > count6 && count6 > count1 && count1 > count2) {
			System.out.println(count3);
		} else if (count4 > count5 && count5 > count6 && count6 > count1 && count1 > count2 && count2 > count3) {
			System.out.println(count4);
		} else if (count5 > count6 && count6 > count1 && count1 > count2 && count2 > count3 && count3 > count4) {
			System.out.println(count5);
		} else if (count6 > count1 && count1 > count2 && count2 > count3 && count3 > count4 && count4 > count5) {
			System.out.println(count6);
		}
	}

}
