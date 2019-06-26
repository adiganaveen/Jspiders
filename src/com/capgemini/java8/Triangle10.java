package com.capgemini.java8;
class Triangle10
{
	public static void main(String[] args) 
	{
		int n=10;
		for(int row=0;row<n;row++)
		{
			for(int col=0; row>=col  ;col++)
			{
					System.out.print("*");	
			}
			System.out.println();
		}

		for(int row =1 ; row <n ; row ++)
		{
			for (int col=0 ; row+col<=n-1; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
}