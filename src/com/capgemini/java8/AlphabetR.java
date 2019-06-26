package com.capgemini.java8;

class AlphabetR
{
	public static void main(String[] args) 
	{
		int n=11;
		for(int row=0;row<n;row++)
		{
			for(int col=n/2;col<n;col++)
			{
				if( col == n/2 ||
					row == 0 && col!= n-1 ||
					row == n/2 && col != n-1 ||
					col == n-1 && row!=0 && row < n/2 ||
					row == col 
				  )
					System.out.print("* ");
				
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}