package com.capgemini.java8;

class AlphabetK
{
	public static void main(String[] args) 
	{
		int n=11;
		for(int row=0;row<n;row++)
		{
			for(int col=n/2;col<n;col++)
			{
				if( 
					col==n/2 || row==col || row+col==n-1
				  )
					System.out.print("* ");
				
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}