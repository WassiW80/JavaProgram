package com.pattern.program;

public class TestPattern3 
{

	public static void main(String[] args) 
	{
		int n = 4;
		int x = n;
		int y = n;
		
		for (int i = 1; i <=n; i++) 
		{
			for (int j = 1; j <n*2; j++) 
			{
				if(i>1&&j==4)
				{
					System.out.print("  ");
				}
				else if(j>=x&&j<=y)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			
			}
			x--;
			y++;
			System.out.println();

		}
				
	}

}
