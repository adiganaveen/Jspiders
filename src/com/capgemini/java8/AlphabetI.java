package com.capgemini.java8;

class AlphabetI
{
	public static void main(String[] args) 
	{
		int n=11;
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<n;col++)
			{
				if( row == 0 || row == n-1 || col == n/2 )
					System.out.print("* ");
				
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}