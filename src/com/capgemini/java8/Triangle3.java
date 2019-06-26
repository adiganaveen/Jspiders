package com.capgemini.java8;
class Triangle3
{
	public static void main(String[] args) 
	{
		int n=11;
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<n;col++)
			{
				if( 
					col==n-1 ||
					row==n-1 ||
					row+col==n-1
				  )
					System.out.print("* ");
				
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}