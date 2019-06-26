package com.capgemini.java8;
class Triangle11
{
	public static void main(String[] args) 
	{
		int n=6;
		for(int row=0;row<n;row++)
		{
			for ( int space=0 ; space < n-1-row ; space++)
			{
				System.out.print(" ");
			}
			for ( int col=0 ; 2*row >= col ; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}