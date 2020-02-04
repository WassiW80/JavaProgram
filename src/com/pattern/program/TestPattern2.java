package com.pattern.program;

import java.util.Scanner;

public class TestPattern2 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows ");
		int rows = sc.nextInt();
				
		for (int i = 1;i <=rows; i++) 
		{
			for (int j = rows; j>i; j--)
			{
				System.out.print("  ");
			}
			for (int k = 1; k <i*2 ; k++) 
			{
				if(k>1&&k==i)
				{
				System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();


		}


		for (int i = rows-1; i>=1; i--) 
		{
			for (int j = rows-1; j >= i; j--) 
			{
				System.out.print("  ");
			}
			for (int k = 1; k <i*2; k++)
			{
				if(k>1&&k==i)
				{
					System.out.print("  ");
				}
				else
				{
				System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
